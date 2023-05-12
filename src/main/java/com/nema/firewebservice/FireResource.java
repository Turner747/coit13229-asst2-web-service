/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package com.nema.firewebservice;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author joshturner
 */
@Path("fires")
public class FireResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of FireResource
     */
    public FireResource() {
    }

    /**
     * Retrieves representation of an instance of com.nema.firewebservice.FireResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getFires() {
        String fireJSONString = "";
        
        // get fires from db
        
        // convert to json string
        
        
        return fireJSONString;
    }

    /**
     * POST method for sending fire trucks to fire
     * @param content representation for the resource
     */
    @POST
    @Path("/{fireId}")
    public void sendFireTruck(@PathParam("fireId") int fireId) {
        
        // add fire truck to the database
        
    }
}
