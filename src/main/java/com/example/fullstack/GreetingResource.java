package com.example.fullstack;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive V2";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/world")
    public String helloWorld() {
            return "Hello world!";
    }
}