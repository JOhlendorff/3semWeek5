/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.restdemo2;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author jenso
 */
@Path("customer")
public class CustomerResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CustomerResource
     */
    public CustomerResource() {
    }

    /**
     * Retrieves representation of an instance of com.mycompany.restdemo2.CustomerResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("address/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson(@PathParam("id")int id) {
        //TODO return proper representation object  
        return "{\"msg:\"\"det virker😕 med id: " +id+"\"}";
    }

    /**
     * PUT method for updating or creating an instance of CustomerResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
        
    }
    
    public String getWithQuery(@QueryParam("id") int id, @QueryParam("name") String name){
        return null;
    }
}
