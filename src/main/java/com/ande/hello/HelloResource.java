package com.ande.hello;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {

    @ConfigProperty(name = "GREET", defaultValue = "buuu")
    private String greet;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return greet;
    }
}
