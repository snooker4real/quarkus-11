package com.snooker4real;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "http:localhost:8181")
@Path("/hello")
@ApplicationScoped
public interface GreetingService {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String remoteHello();
}
