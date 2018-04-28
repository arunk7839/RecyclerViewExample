package com.example.lenovo.recyclerview.model;


public class Book {
    String authorName;
    String bookName;
    int imageResource;

    public Book(String authorName, String bookName, int imageResource) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.imageResource = imageResource;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }
}
