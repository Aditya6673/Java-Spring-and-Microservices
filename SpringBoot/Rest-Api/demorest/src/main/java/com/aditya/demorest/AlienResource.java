package com.aditya.demorest;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/aliens")
public class AlienResource {

    AlienRepository repo = new AlienRepository();
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<Alien> getAlien() {
         return repo.getAliens();
    }
    @GET
    @Path("/alien/{id}")
    @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Alien getAlien(@PathParam("id") int id) {
         return repo.getAlien(id);
    }
    @POST
    @Path("/create")
    public Alien createAlien(Alien a)
    {
        repo.createAlien(a);
        return a;
    }
    @PUT
    @Path("/update")
    public Alien updateAlien(Alien a)
    {
        repo.updateAlien(a);
        if(repo.getAlien(a.getId())==null){
            repo.createAlien(a);
        }
        return a;
    }
    @DELETE
    @Path("/kill/{id}")
    public Alien killAlien(@PathParam("id") int id){
        Alien a = repo.getAlien(id);
        if(a.getId()!=0){
            repo.delete(id);
        }
        return a;
    }

}
