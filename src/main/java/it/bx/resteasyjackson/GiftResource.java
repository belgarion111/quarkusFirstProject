package it.bx.resteasyjackson;


import it.bx.bean.Fruit;
import it.bx.bean.Gift;
import it.bx.service.SantaClausService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Set;

@Path("/gift")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GiftResource {

    @Inject
    SantaClausService santaClausService;

    @GET
    public List<Gift> list() {
        santaClausService.createGift("Momy gift");
        return santaClausService.giftList();
    }

}
