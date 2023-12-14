package com.example.bottomnavbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.hardware.camera2.params.ColorSpaceTransform;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHelper db = new DatabaseHelper(this);
    }

    public void change(View view) {

        EditText loginEdit = findViewById(R.id.login);
        EditText passwordEdit = findViewById(R.id.password);

        String login = loginEdit.getText().toString();
        String password = passwordEdit.getText().toString();

        Map<String, String> logpas = new HashMap<String, String>();

        logpas.put("admin", "admin");
        logpas.put("9v-12", "Comissarov1!");
        logpas.put("9a-21", "Sakicheva1!");
        logpas.put("9s-17", "Morozova1!");
        logpas.put("1", "1");
        logpas.put("", "");

        if (logpas.containsKey(login)){
            if (logpas.get(login).equals(password)){
                Intent intent = new Intent(this, JournalActivity.class);
                startActivity(intent);
            }
            else {
                Snackbar.make(view, "пароль введён не правильно", Snackbar.LENGTH_LONG).show();
            }
        }
        else{
            loginEdit.setBackgroundColor(Color.rgb(120, 20, 0));
            Snackbar.make(view, "логин введён не правильно", Snackbar.LENGTH_LONG).show();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }



    }
}