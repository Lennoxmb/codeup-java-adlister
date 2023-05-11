package model;

public class Quote {
private int id;
    private String quote;
    private String author;

    public Quote(int id, String quote, String author) {
        this.id = id;
        this.quote = quote;
        this.author = author;
    }

    public Quote(String quote, String author) {
        this.quote = quote;
        this.author = author;
    }

    public Quote() {
        this.id = 0;
        this.quote = "";
        this.author = "";
    }

    public int getId() {
        return id;
    }

    public String getQuote() {
        return quote;
    }

    public String getAuthor() {
        return author;
    }
}
