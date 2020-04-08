package org.example.resources;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/my-api")
@Produces(MediaType.APPLICATION_JSON)
public class MyResource {
   public  List<String> list = new ArrayList<>();

    @PUT
    public void storeData(String data){
        list.add(data) ;
    }

    @GET
    @Path("/data")
    public Response getData(){
         String result = String.join(" ",list);
         return Response.ok(result,MediaType.APPLICATION_JSON).build() ;
    }


}
