package it.cs367.resteasyjackson;

import it.cs367.config.HelloConfiguration;
import lombok.NoArgsConstructor;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

@Path("/hello")
@Produces(TEXT_PLAIN)
@Consumes(TEXT_PLAIN)
@NoArgsConstructor
public class HelloResource {

    @Inject
    HelloConfiguration helloConfiguration;

    @GET
    public String hello(){
        return helloConfiguration.getMessage() + " " + helloConfiguration.getName();
    }
}
