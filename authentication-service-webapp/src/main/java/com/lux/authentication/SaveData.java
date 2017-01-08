package com.lux.authentication;

import com.lux.authentication.model.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("userauth")
public class SaveData {

    @POST
    @Path("/save")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response saveData(User user) {
        user.toString();
        return Response.status(200).entity(user).build();
    }
}
