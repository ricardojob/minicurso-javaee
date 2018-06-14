package br.edu.ifpb.app.reactive;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class LivroRepository {

    private List<Livro> livros = new ArrayList<>();

    public List<Livro> getAllLivros() {
        return livros;
    }

    @PostConstruct
    public void initiate() {
        livros.add(new Livro("Java Fun", "Alex Theedom", 10f));
        livros.add(new Livro("Java 101", "Alex Theedom", 10f));
        livros.add(new Livro("Java Expert", "Alex Theedom", 10f));
        livros.add(new Livro("Java EE 8", "Alex Theedom", 10f));
    }
    

    public Livro saveBook(Livro book) {
        livros.add(book);
        return book;
    }

    public Livro updateBook(Livro book) {
        livros.add(book);
        return book;
    }

    public Livro deleteBookByIsbn(String isbn) {
        int i = livros.indexOf(new Livro(isbn));
        return livros.remove(i);
    }

    public List<Livro> searchBook(String keyword, int limit) {
        return new ArrayList<>();
    }

    public List<Livro> getAllNewBooks() {
        return new ArrayList<>();
    }

    public List<Livro> getBookBy(String author, String category, String language) {
        return new ArrayList<>();
    }
}
