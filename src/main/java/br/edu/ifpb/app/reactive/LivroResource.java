package br.edu.ifpb.app.reactive;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

 
@Path("/livros")
public class LivroResource {

    @Inject
    private LivroRepository livroRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllLivros() {
        List<Livro> books = livroRepository.getAllLivros();
        GenericEntity<List<Livro>> list = new GenericEntity<List<Livro>>(books) {
        };
        return Response.ok(list).build();
    }

}