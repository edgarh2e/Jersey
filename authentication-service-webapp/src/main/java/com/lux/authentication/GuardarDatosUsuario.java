package com.lux.authentication;

import com.lux.authentication.model.Usuario;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("usuario")
public class GuardarDatosUsuario {

    @HeaderParam("usuario")
    private String usuario;

    @HeaderParam("sucursal")
    private String sucursal;

    @HeaderParam("password")
    private String password;

    @HeaderParam("keyCode")
    private String keyCode;

    @POST
    @Path("/guardarDatosUsuario")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response guardarDatos() {
        Usuario usuario = new Usuario(this.usuario, this.sucursal, this.password, this.keyCode);
        return Response.status(200).entity(usuario).build();
    }
}
