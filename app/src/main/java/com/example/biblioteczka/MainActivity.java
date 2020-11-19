package com.example.biblioteczka;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Button btnAllBooks, btnAlreadyRead, btnWantToRead, btnCurrentlyReading, btnAbout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        btnAllBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllBooksActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initViews() {
        btnAllBooks = findViewById(R.id.btnAllBooks);
        btnAbout = findViewById(R.id.btnAbout);
        btnCurrentlyReading = findViewById(R.id.btnCurrentlyReading);
        btnWantToRead = findViewById(R.id.btnWantToRead);
        btnAlreadyRead = findViewById(R.id.btnAlreadyRead);
    }
}