package com.lux.authentication;

import com.lux.authentication.model.Usuario;
import org.springframework.cache.annotation.Cacheable;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("usuario")
public class ValidarDatosUsuario {

    @POST
    @Path("/validarDatosUsuario")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response validarDatos(Usuario usuario) {
        System.out.println("Cache");
        Usuario usuarioResponse =  new Usuario(usuario.getUsuario(), usuario.getSucursal(),
                "83e92497-c660-26a0-141e-609687237c10", "123456");
        return Response.status(200).entity(usuarioResponse).build();
    }
}
