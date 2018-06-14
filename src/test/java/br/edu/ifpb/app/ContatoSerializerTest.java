package br.edu.ifpb.app;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 28/11/2017, 18:11:45
 */
public class ContatoSerializerTest {

    @Test
    public void givenJSON_shouldDeserializeBook() {
        ContatoJson jsonBindingExample = new ContatoJson();
        Contato contato = jsonBindingExample.deserializeContato("{}");
        Contato result = new Contato();

//        Assert.assertEquals(contato, result);
    }

    @Test
    public void givenBookObject_shouldSerializeToJSONString() {
        ContatoJson jsonBindingExample = new ContatoJson();
        Contato contato = new Contato();

        String json = jsonBindingExample.serializeContato(contato);
        String result = "{}";
//        Assert.assertEquals(contato, result);
    }

}
