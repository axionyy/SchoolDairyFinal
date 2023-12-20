package com.example.bottomnavbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ProfileActivity extends AppCompatActivity {
    public int who;
    public String ClassName;
    public DatabaseReference db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        TextView firstNameE = findViewById(R.id.firstName);
        TextView middleNameE = findViewById(R.id.middleName);
        TextView lastNameE = findViewById(R.id.lastName);
        TextView classsE = findViewById(R.id.className);
        TextView birthE = findViewById(R.id.birthday);

        init();





        Bundle extras = getIntent().getExtras();
        ClassName = extras.getString("class");
        who = extras.getInt("id");




        db = FirebaseDatabase.getInstance().getReference("student");

        ValueEventListener valueEventListener = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot ds : snapshot.getChildren()){
                    Student student = ds.getValue(Student.class);

                    if (student.getId() == who){

                        firstNameE.setText(student.getFirstName());
                        middleNameE.setText(student.getMiddleName());
                        lastNameE.setText(student.getLastName());
                        classsE.setText(student.getClasss());
                        birthE.setText(student.getBirtsday());
                        aaaa();

                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        };
        db.addValueEventListener(valueEventListener);



        ImageView avatar = findViewById(R.id.avatarka);



    }

    public void init(){

    }


    public void aaaa() {

        int a = who % 9;
        //int a = (int) (Math.random() * 8);

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

    public void left(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("id", who);
        intent.putExtra("class", ClassName);
        startActivity(intent);
    }
}