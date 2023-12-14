package com.example.bottomnavbar;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RaspisaniyeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_raspisanye);
    }







    public void setHome(View view){
        Intent intent = new Intent(this, JournalActivity.class);
        startActivity(intent);
    }

    public void setJournal(View view){
        Intent intent = new Intent(this, ResultAcivity.class);
        startActivity(intent);
    }

    public void setResult(View view){
        Intent intent = new Intent(this, RaspisaniyeActivity.class);
        startActivity(intent);
    }

    public void setClass(View view){
        Intent intent = new Intent(this, MyClassActivity.class);
        startActivity(intent);
    }

    public void setProfile(View view){
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
}