package com.localapps.books_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AllBooksActivity extends AppCompatActivity {
private RecyclerView allBooks ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);
        allBooks = findViewById(R.id.allbooks);
        ArrayList<Book> Books = new ArrayList<>();
        Books.add(new Book(12, 2,"chesse", "mohamed","https://m.media-amazon.com/images/I/516PMbuccJL.jpg", "a very good book for studying perposses", " a very long desc but it's shorter than the first one you already know"));
        Books.add(new Book(12, 3,"chesse", "mohamed","https://www.richdad.com/MediaLibrary/RichDad/Images/books/rich-dad-poor-dad/rdpd-front-cover-20th(882x1332-144dpi).jpg", "a very good book for studying perposses", " a very long desc but it's shorter than the first one you already know"));
        CustomAdapter adapter = new CustomAdapter(Books,this);
        allBooks.setAdapter(adapter);
allBooks.setLayoutManager(new LinearLayoutManager(this));

     }


}