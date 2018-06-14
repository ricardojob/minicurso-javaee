package br.edu.ifpb.app.reactive;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.sse.SseEventSource;

public class ClientAPIExample {

    public void ClientAPIExample() {

        WebTarget target = ClientBuilder.newClient().target("http://localhost:8080/app/sse/");
        try (SseEventSource source = SseEventSource.target(target).build()) {
            source.register(System.out::println);
            source.open();
        }

    }
}
