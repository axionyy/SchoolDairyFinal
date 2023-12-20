package com.example.bottomnavbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class JournalActivity extends AppCompatActivity {

    public int who;
    public String ClassName;

    String[] days = {"Сегодня", "Вчера", "Позавчера"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journal);

        Bundle extras = getIntent().getExtras();
        who = extras.getInt("id");
        ClassName = extras.getString("class");


        Spinner spinner = findViewById(R.id.spinner_today);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, days);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    public void setHome(View view) {
        Intent intent = new Intent(this, JournalActivity.class);
        intent.putExtra("id", who);
        intent.putExtra("class", ClassName);
        startActivity(intent);
    }

    public void setJournal(View view) {
        Intent intent = new Intent(this, ResultAcivity.class);
        intent.putExtra("id", who);
        intent.putExtra("class", ClassName);
        startActivity(intent);
    }

    public void setResult(View view) {
        Intent intent = new Intent(this, RaspisaniyeActivity.class);
        intent.putExtra("id", who);
        intent.putExtra("class", ClassName);
        startActivity(intent);
    }

    public void setClass(View view) {
        Intent intent = new Intent(this, MyClassActivity.class);
        intent.putExtra("id", who);
        intent.putExtra("class", ClassName);
        startActivity(intent);
    }

    public void setProfile(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra("id", who);
        intent.putExtra("class", ClassName);
        startActivity(intent);
    }

}
