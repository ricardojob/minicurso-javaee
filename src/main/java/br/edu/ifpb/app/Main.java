package br.edu.ifpb.app;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.json.JsonArray;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 28/11/2017, 18:42:33
 */
public class Main {

    public static void main(String[] args) {
        ContatoJsonP contatoJsonP = new ContatoJsonP();
        List<String> lista = contatoJsonP.filterJsonArrayToList();
        lista.forEach(System.out::println);
        JsonArray array = contatoJsonP.filterJsonArrayToJsonArray();
        System.out.println("array = " + array);
        
        System.out.println(contatoJsonP.find());
        System.out.println(contatoJsonP.replace());
        System.out.println(contatoJsonP.add());

//        List<String> asList = Arrays.asList("1", "maria");
//        List<Integer> collect = asList.stream()
//                .map((t) -> t.length())
//                .collect(Collectors.toList());
//        
//        collect.forEach(System.out::println);
//        ContatoJson service = new ContatoJson();
//
//        Contato contato = new Contato();
//        contato.setNome(null);
//        contato.setIdade(23);
//        contato.setCpf("123312");
//        contato.setEmail("kkdkdkkd@asgaga.com");
//        contato.setDataDeNascimento(LocalDate.of(2018, 10, 10));
//
//        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//        Validator validator = factory.getValidator();
//        Set<ConstraintViolation<Contato>> constraintViolations
//                = validator.validate(contato);
//
//        System.out.println(constraintViolations.size());
//
//        constraintViolations.stream().forEach(System.out::println);
//
//        String serializeContato = service.serializeContato(contato);
//
//        System.out.println("serializeContato = " + serializeContato);
//
//        String valor = "{\"cpf\":\"123312\",\"idade\":23,\"telefones\":[]}";
//
//        Contato deserializeContato = service.deserializeContato(valor);
//        System.out.println("deserializeContato = " + deserializeContato);

    }
}
