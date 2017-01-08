package com.lux.authentication;

import com.lux.authentication.model.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("userauth")
public class ValidateData {

    @POST
    @Path("/validate")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response validateToken(User user) {
        User userResponse =  new User(user.getUserName(), user.getSuc(), "83e92497-c660-26a0-141e-609687237c10");
        return Response.status(200).entity(userResponse).build();
    }
}
