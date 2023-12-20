package com.example.bottomnavbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.hardware.camera2.params.ColorSpaceTransform;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    public Intent intent;

    private String login, password;

    private DatabaseReference db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = FirebaseDatabase.getInstance().getReference("student");
    }

    public void change(View view) {

        intent = new Intent(this, JournalActivity.class);

        EditText loginEdit = findViewById(R.id.login);
        EditText passwordEdit = findViewById(R.id.password);

        login = loginEdit.getText().toString();
        password = passwordEdit.getText().toString();

        ValueEventListener valueEventListener = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot ds : snapshot.getChildren()) {
                    Student student = ds.getValue(Student.class);
                    if (student.getLogin().equals(login) && student.getPassword().equals(password)) {
                        intent.putExtra("id", student.getId());
                        intent.putExtra("class", student.getClasss());
                        Toast.makeText(MainActivity.this, student.getClasss(), Toast.LENGTH_SHORT).show();
                        startActivity(intent);

                    }
                    else {

                    }

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        };

        db.addValueEventListener(valueEventListener);


    }
}