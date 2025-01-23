package fr.IlannStefanovitch.Tp2.Exo4_5;


import fr.IlannStefanovitch.Tp2.Exo1_3.Author;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;

    }
    public Book(String name, Author[] author, double price, int qty) {
        this.name = name;
        this.authors = author;
        this.price = price;
        this.qty = qty;
    }
    public String getName() {
        return name;
    }
    public Author[] getAuthor() {
        return authors;
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
    public String toString() {
        StringBuilder authorsString = new StringBuilder();
        authorsString.append("{");
        for (int i = 0; i < authors.length; i++) {
            authorsString.append(authors[i].toString());
            if (i < authors.length - 1) {
                authorsString.append(",");
            }
        }
        authorsString.append("}");
        return "Book[name=" + name + ",authors=" + authorsString.toString() + ",price=" + price + ",qty=" + qty + "]";
    }
    public String[] getAuthorNames() {
        String[] authorNames = new String[authors.length];
        for (int i = 0; i < authors.length; i++) {
            authorNames[i] = authors[i].getName();
        }
        return authorNames;
    }
    public String[] getAuthorEmails() {
        String[] authorEmails = new String[authors.length];
        for (int i = 0; i < authors.length; i++) {
            authorEmails[i] = authors[i].getEmail();
        }
        return authorEmails;
    }
    public char[] getAuthorGenders() {
        char[] authorGenders = new char[authors.length];
        for (int i = 0; i < authors.length; i++) {
            authorGenders[i] = authors[i].getGender();
        }
        return authorGenders;
    }
}
