package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonBook_ListClick(View view){
        Intent myIntent = new Intent(this, Book_List.class);
        this.startActivity(myIntent);
    }

    public void onButtonAdd_BookClick(View view){
        Intent myIntent = new Intent(this, Add_Book.class);
        this.startActivity(myIntent);
    }

}

