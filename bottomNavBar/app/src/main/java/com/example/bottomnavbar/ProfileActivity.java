package com.example.bottomnavbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int a = (int) (Math.random() * 8);

        ImageView avatar = findViewById(R.id.avatarka);

        setContentView(R.layout.activity_profile);
    }

    public void aaaa(View view) {

        int a = (int) (Math.random() * 8);

        ImageView avatar = findViewById(R.id.avatarka);

        if (a == 0) {
            avatar.setBackgroundResource(R.drawable.ava1);
        } else if (a == 1) {
            avatar.setBackgroundResource(R.drawable.ava2);
        } else if (a == 2) {
            avatar.setBackgroundResource(R.drawable.ava3);
        } else if (a == 3) {
            avatar.setBackgroundResource(R.drawable.ava4);
        } else if (a == 4) {
            avatar.setBackgroundResource(R.drawable.ava5);
        } else if (a == 5) {
            avatar.setBackgroundResource(R.drawable.ava6);
        } else if (a == 6) {
            avatar.setBackgroundResource(R.drawable.ava7);
        } else if (a == 7) {
            avatar.setBackgroundResource(R.drawable.ava8);
        } else if (a == 8) {
            avatar.setBackgroundResource(R.drawable.ava9);
        }

        String b = String.valueOf(a);
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

    public void left(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}