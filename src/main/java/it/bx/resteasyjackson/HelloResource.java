package it.bx.resteasyjackson;

import io.agroal.api.AgroalDataSource;
import io.quarkus.agroal.DataSource;
import it.bx.config.HelloConfiguration;
import lombok.NoArgsConstructor;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

@Path("/hello")
@Produces(TEXT_PLAIN)
@Consumes(TEXT_PLAIN)
@NoArgsConstructor
public class HelloResource {

    @Inject
    HelloConfiguration helloConfiguration;

    @Inject
    AgroalDataSource defaultSource;


    @GET
    public String hello(){
        return helloConfiguration.getMessage() + " " + helloConfiguration.getName();
    }
}
