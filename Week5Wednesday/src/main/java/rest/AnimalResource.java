    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import entities.Animal;
import java.util.ArrayList;
import java.util.Random;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author jenso
 */
@Path("animal")
public class AnimalResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AnimalResource
     */
    public AnimalResource() {
    }
    
    @GET
    @Path("/random")
    @Produces
    public String methodName(){
        ArrayList<Animal> aniList = new ArrayList<>();
        
        Animal dog  = new Animal("dog", 2009, "woof");
        Animal cow  = new Animal("cow", 2009, "moo");
        Animal pig  = new Animal("pig", 2014, "oink");
        Animal duck  = new Animal("duck", 2014, "quack");
        Random rand = new Random();
        int randomNumber = rand.nextInt(3)+1;
        aniList.add(pig);
        aniList.add(dog);
        aniList.add(cow);
        aniList.add(duck);
        Animal randomAnimal = aniList.get(randomNumber);
        return new Gson().toJson(randomAnimal);
    }

    /**
     * Retrieves representation of an instance of rest.AnimalResource
     * @return an instance of java.lang.String
     */
    @GET
    //@Produces(MediaType.APPLICATION_JSON)
        public String getJson() {
        //TODO return proper representation object
        return "hello from my first website";
    }

    /**
     * PUT method for updating or creating an instance of AnimalResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
