package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Add_Book extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_book);
    }

    public void onAdd_BookClick(View view) {
        EditText year = findViewById(R.id.editTextYear);
        EditText title = findViewById(R.id.editTextTitle);
        EditText author = findViewById(R.id.editTextAuthor);

        if(year.getText().toString().equals("")||
                title.getText().toString().equals("")||
                author.getText().toString().equals("")) return;

        Book_List.books.add(new String[]{year.getText().toString(),
                title.getText().toString(),
                author.getText().toString()});
    }

    public void onAdd_BookReturnButtonClick(View view){
        Intent myIntent = new Intent(this, Main_Activity.class);
        this.startActivity(myIntent);
    }
}
