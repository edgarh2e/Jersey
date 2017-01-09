package com.lux.authentication;

import com.lux.authentication.model.User;
import org.springframework.cache.annotation.Cacheable;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("userauth")
public class ValidateData {

    @POST
    @Path("/validate")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    @Cacheable(value = "validateTokenCache", key = "T(com.lux.authentication.model.User).hash(#userName, #suc, #password)")
    public Response validateToken(User user) {
        System.out.println("Cache");
        User userResponse =  new User(user.getUserName(), user.getSuc(),
                "83e92497-c660-26a0-141e-609687237c10", "123456");
        return Response.status(200).entity(userResponse).build();
    }
}
