package com.sustav.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

@Path("/sayRest")
public class RestClient {

    @Context
    private UriInfo uriInfo;
    @GET
    @Produces("text/plain")
    public String say() {
        return "Say";
    }
}
