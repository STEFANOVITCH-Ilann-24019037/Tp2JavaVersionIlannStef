package fr.IlannStefanovitch.Tp2.Exo4_5;


import fr.IlannStefanovitch.Tp2.Exo1_3.Author1;

public class Book {
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    public Book(String isbn , String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;

    }
    public Book(String isbn , String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public String getAuthorName() {
        return author.toString();
    }
    public String toString() {
        return "Book [name " + name + ", author " + author.toString() + ", price " + price + ", qty " + qty + "]";
    }




}
