package ex2dot2;

import java.util.Arrays;

public class Book {
    private final String name;
    private final Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.authors = authors;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
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

    public String getAuthorNames() {
        return Arrays.stream(authors).map(Author::getName).reduce((a, b) -> a + "," + b) + "";
    }

    public String getAuthorEmails() {
        return Arrays.stream(authors).map(Author::getEmail).reduce((a, b) -> a + "," + b) + "";
    }

    @Override
    public String toString() {
        return "Book[name=" + name + ",author=" + Arrays.toString(authors) + ",price=" + price + ",qty=" + qty + "]";
    }
}
