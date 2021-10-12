package com.techbuddy.apachekafkaconsumer;

public class Book {
    private String bookName;
    private String isbn;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    Book(){
    }

    public Book(String bookName, String isbn) {
        this.bookName = bookName;
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
