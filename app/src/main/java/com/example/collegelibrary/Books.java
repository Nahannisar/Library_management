package com.example.collegelibrary;

public class Books {

    private String bookName;
    private String description;
    private String author;
    private String fullDescription;

    public Books(String bookName, String author, String description, String fullDescription)
    {
        this.author=author;
        this.description=description;
        this.bookName=bookName;
        this.fullDescription=fullDescription;
    }


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }
}
