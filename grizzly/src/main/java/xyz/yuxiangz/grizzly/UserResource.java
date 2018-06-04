package xyz.yuxiangz.grizzly;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class UserResource {

    @GET
    @Path("/{userId}")
    @Produces(MediaType.TEXT_PLAIN)
    public Object info(@PathParam("userId") String userId) {
        return userId;
    }

    @POST
    @Path("/delete/{userId}")
    @Produces(MediaType.TEXT_PLAIN)
    public Object delete(@PathParam("userId") String userId) {
        return userId;
    }


}
