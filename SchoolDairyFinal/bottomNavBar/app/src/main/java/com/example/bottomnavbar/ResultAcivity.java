package com.example.bottomnavbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ResultAcivity extends AppCompatActivity {

    public int who;
    public String ClassName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle extras = getIntent().getExtras();
        ClassName = extras.getString("class");
        who = extras.getInt("id");


    }

    public void setHome(View view){
        Intent intent = new Intent(this, JournalActivity.class);
        intent.putExtra("id", who);
        intent.putExtra("class", ClassName);
        startActivity(intent);
    }

    public void setJournal(View view){
        Intent intent = new Intent(this, ResultAcivity.class);
        intent.putExtra("id", who);
        intent.putExtra("class", ClassName);
        startActivity(intent);
    }

    public void setResult(View view){
        Intent intent = new Intent(this, RaspisaniyeActivity.class);
        intent.putExtra("id", who);
        intent.putExtra("class", ClassName);
        startActivity(intent);
    }

    public void setClass(View view){
        Intent intent = new Intent(this, MyClassActivity.class);
        intent.putExtra("id", who);
        intent.putExtra("class", ClassName);
        startActivity(intent);
    }

    public void setProfile(View view){
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra("id", who);
        intent.putExtra("class", ClassName);
        startActivity(intent);
    }
}