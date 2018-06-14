package br.edu.ifpb.app.sse;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.sse.Sse;
import javax.ws.rs.sse.SseBroadcaster;
import javax.ws.rs.sse.SseEventSink;

@Path("/")
@Singleton
public class SseResource {

    @Context
    private Sse sse;

    private SseBroadcaster broadcaster;

    @PostConstruct
    public void initialise() {
        this.broadcaster = sse.newBroadcaster();
    }

    @GET
    @Path("subscribe")
    @Produces(MediaType.SERVER_SENT_EVENTS)
    public void subscribe(@Context SseEventSink eventSink) {
        eventSink.send(sse.newEvent("Você está inscrito"));
        broadcaster.register(eventSink);
    }

    @POST
    @Path("broadcast")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void broadcast(@FormParam("message") String message) {
        broadcaster.broadcast(sse.newEvent(message));
    }
}
