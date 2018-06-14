package br.edu.ifpb.app.reactive;

import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement
public class Livro {

    private String isbn;
    private String title;
    private String author;
    private Float price;

    public Livro() {
    }

    public Livro(String isbn, String title, String author, Float price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Livro(String isbn) {
        this.isbn = isbn;
    }

    public Livro(String title, String author, Float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
