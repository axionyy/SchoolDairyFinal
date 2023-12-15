package com.example.bottomnavbar;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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

    public void mon(View view){
        CustomDialogFragment dialog = new CustomDialogFragment();

        TextView textView = findViewById(R.id.monday);

        String title = textView.getText().toString();

        String message =
                "Плавание: 10:15 большой бассейн\n\n" +
                        "Футбол: 11:20 малый спортивный зал\n\n" +
                        "Консультация по информатике: 13:15 кабинет информатики 311";

        dialog.CustomDialogFragmentt(title, message);

        dialog.show(getSupportFragmentManager(), "custom");
    }
    public void tue(View view){
        CustomDialogFragment dialog = new CustomDialogFragment();

        TextView textView = findViewById(R.id.tusday);

        String title = textView.getText().toString();

        String message =
                "Баскетбол: 15:20 большой спортивный зал\n\n" +
                        "Футбол: 12:10 стадион";

        dialog.CustomDialogFragmentt(title, message);

        dialog.show(getSupportFragmentManager(), "custom");
    }

    public void wen(View view){
        CustomDialogFragment dialog = new CustomDialogFragment();

        TextView textView = findViewById(R.id.wensday);

        String title = textView.getText().toString();

        String message =
                "Водное поло: 14:15 большой бассейн\n\n" +
                        "Волейбол: 16:40 малый спортзал";

        dialog.CustomDialogFragmentt(title, message);

        dialog.show(getSupportFragmentManager(), "custom");
    }
    public void thu(View view){
        CustomDialogFragment dialog = new CustomDialogFragment();

        TextView textView = findViewById(R.id.thursday);

        String title = textView.getText().toString();

        String message =
                "Гимнастика: 13:20 зал хореографии\n\n" +
                        "Футбол: 11:35 малый спортивный зал\n\n" +
                        "Плавание: 11:55 малый бассейн";

        dialog.CustomDialogFragmentt(title, message);

        dialog.show(getSupportFragmentManager(), "custom");
    }
    public void fri(View view){
        CustomDialogFragment dialog = new CustomDialogFragment();

        TextView textView = findViewById(R.id.friday);

        String title = textView.getText().toString();

        String message =
                "Волейбол: 13:30 малый спортивный зал\n\n" +
                        "Баскетбол:15:00 большой спортзал\n\n" +
                        "Консультация по информатике: 14:40 кабинет информатики 311";

        dialog.CustomDialogFragmentt(title, message);

        dialog.show(getSupportFragmentManager(), "custom");
    }
    public void sat(View view){
        CustomDialogFragment dialog = new CustomDialogFragment();

        TextView textView = findViewById(R.id.saturday);

        String title = textView.getText().toString();

        String message =
                "Плавание: 11:00 малый бассейн\n\n" +
                        "Гимнастика: 12:00 зал хореографии\n\n" +
                        "Водное поло: 09:00 большой бассейн";

        dialog.CustomDialogFragmentt(title, message);

        dialog.show(getSupportFragmentManager(), "custom");
    }
    public void sun(View view){
        CustomDialogFragment dialog = new CustomDialogFragment();

        TextView textView = findViewById(R.id.sunday);

        String title = textView.getText().toString();

        String message =
                "Выходной";

        dialog.CustomDialogFragmentt(title, message);

        dialog.show(getSupportFragmentManager(), "custom");
    }

}