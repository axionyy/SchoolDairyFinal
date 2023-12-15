package com.example.bottomnavbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class JournalActivity extends AppCompatActivity {

    String[] days = {"Сегодня", "Вчера", "Позавчера"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journal);

        Spinner spinner = findViewById(R.id.spinner_today);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, days);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
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
