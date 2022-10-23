package com.example.recycling_vuew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView contactsRecView;
    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            contactsRecView = (RecyclerView) findViewById(R.id.recycle);
        ArrayList<Contacts> contacts = new ArrayList<>();
        contacts.add(new Contacts("hamza","emaail","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQN-Kert_15FQ6upOEe9M7P36Ya7XktlnxP5TqFpAbA&s"));
        contacts.add(new Contacts("mohamed","emaail","https://images.unsplash.com/photo-1438761681033-6461ffad8d80?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8cGVyc29ufGVufDB8fDB8fA%3D%3D&w=1000&q=80"));
        contacts.add(new Contacts("hassan","emaail","https://st.depositphotos.com/1269204/1219/i/600/depositphotos_12196477-stock-photo-smiling-men-isolated-on-the.jpg"));
        contacts.add(new Contacts("abdelouahed","emaail","https://thumbs.dreamstime.com/b/nice-to-talk-smart-person-indoor-shot-attractive-interesting-caucasian-guy-smiling-broadly-nice-to-112345489.jpg"));
        ContactRecycleAddapter adapter = new ContactRecycleAddapter(this);
        adapter.setContacts(contacts);
        contactsRecView.setAdapter(adapter);
        contactsRecView.setLayoutManager(new GridLayoutManager(this,1));
        }
}