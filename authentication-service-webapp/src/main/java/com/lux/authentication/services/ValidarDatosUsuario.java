package com.lux.authentication.services;

import com.lux.authentication.data.DatosUsuario;
import com.lux.authentication.model.Respuesta;
import com.lux.authentication.model.Usuario;
import com.lux.authentication.util.KeyUtil;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("usuario")
public class ValidarDatosUsuario {

    @HeaderParam("usuario")
    private String usuario;

    @HeaderParam("sucursal")
    private String sucursal;

    @HeaderParam("password")
    private String password;

    @POST
    @Path("/validarDatosUsuario")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response validarDatos() {
        Usuario usuario = new Usuario();
        usuario.setUsuario(this.usuario);
        usuario.setSucursal(this.sucursal);
        usuario.setPassword(this.password);
        Respuesta respuesta = DatosUsuario.validarDatos(KeyUtil.generadorDeLlaveMapa(usuario));
        return Response.status(respuesta.getCodigo()).entity(respuesta.getDatosUsuario()).build();
    }
}
