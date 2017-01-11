package com.lux.authentication.services;

import com.lux.authentication.data.DatosUsuario;
import com.lux.authentication.model.Respuesta;
import com.lux.authentication.model.Usuario;
import com.lux.authentication.util.KeyUtil;
import org.apache.log4j.Logger;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("usuario")
public class GuardarDatosUsuario {

    private static Logger LOG = Logger.getLogger(GuardarDatosUsuario.class);

    @HeaderParam("usuario")
    private String usuario;

    @HeaderParam("sucursal")
    private String sucursal;

    @HeaderParam("password")
    private String password;

    @HeaderParam("keyCode")
    private String keyCode;

    @GET
    @Path("/guardarDatosUsuario")
    @Produces({MediaType.APPLICATION_JSON})
    public Response guardarDatos() {
        Usuario usuario = new Usuario(this.usuario, this.sucursal, this.password, this.keyCode);
        LOG.info("USuario: "+usuario.toString());
        Respuesta respuesta = DatosUsuario.guardarDatos(KeyUtil.generadorDeLlaveMapa(usuario), usuario);
        return respuesta.generarResponse();
    }
}
