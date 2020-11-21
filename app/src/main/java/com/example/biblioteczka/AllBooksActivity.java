package com.example.biblioteczka;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AllBooksActivity extends AppCompatActivity {

    private RecyclerView booksRecView;
    private BookRecViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);

        adapter = new BookRecViewAdapter(this);
        booksRecView = findViewById(R.id.booksRecView);

        booksRecView.setAdapter(adapter);
        booksRecView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1,"Wiedzmin Krew Elfow", "Andrzej Sapkowski", 295, "https://cf1-taniaksiazka.statiki.pl/images/large/0F7/9788375780659.jpg", "Miecz czary i szpiegowska intryga"));
        books.add(new Book(2,"Wiedzmin Ostatnie Zyczenie", "Andrzej Sapkowski", 332, "https://cf1-taniaksiazka.statiki.pl/images/large/123/68007901377KS.jpg", "Otawrcie wiedźmińskiej sagi"));
        adapter.setBooks(books);

    }
}