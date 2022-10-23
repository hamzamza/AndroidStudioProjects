package com.localapps.books_project;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Book {
    private int page, id ;
    private String name, author ,imageUrl,shortDesc, longDesc;


    public Book(int page, int id, String name, String author, String imageUrl, String shortDesc, String longDesc) {
        this.page = page;
        this.id = id;
        this.name = name;
        this.author = author;
        this.imageUrl = imageUrl;
        this.shortDesc = shortDesc;
        this.longDesc = longDesc;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public String getLongDesc() {
        return longDesc;
    }
}
