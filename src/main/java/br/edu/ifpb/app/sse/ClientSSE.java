package br.edu.ifpb.app.sse;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.sse.SseEventSource;

public class ClientSSE {

    public static WebTarget target;

    public static void main(String[] args) {
        target = ClientBuilder.newClient().target(args[0]);
        consumeEventsViaSubscription();
    }

    private static void consumeEventsViaSubscription() {
        try (final SseEventSource eventSource
                = SseEventSource.target(target)
                        .build()) {

                    eventSource.register(System.out::println);
                    eventSource.open();

                    for (int counter = 0; counter < 5; counter++) {
                        target.request().post(Entity.text("mensagem " + counter));
                    }

                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
    }
}
