package com.example.bottomnavbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyClassActivity extends AppCompatActivity {

    String[] countries = {"Бразилия", "Аргентина", "Колумбия", "Чили", "Уругвай"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_class);
    }


    public void setHome(View view) {
        Intent intent = new Intent(this, JournalActivity.class);
        startActivity(intent);
    }

    public void setJournal(View view) {
        Intent intent = new Intent(this, ResultAcivity.class);
        startActivity(intent);
    }

    public void setResult(View view) {
        Intent intent = new Intent(this, RaspisaniyeActivity.class);
        startActivity(intent);
    }

    public void setClass(View view) {
        Intent intent = new Intent(this, MyClassActivity.class);
        startActivity(intent);
    }

    public void setProfile(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
}