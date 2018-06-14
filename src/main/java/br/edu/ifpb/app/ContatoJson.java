package br.edu.ifpb.app;

import javax.json.bind.JsonbBuilder;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 28/11/2017, 18:05:34
 */
public class ContatoJson {

    public String serializeContato(Contato contato) {
        return JsonbBuilder.create().toJson(contato);
    }

    public Contato deserializeContato(String contato) {
        return JsonbBuilder.create()
                .fromJson(contato, Contato.class);
    }
}
