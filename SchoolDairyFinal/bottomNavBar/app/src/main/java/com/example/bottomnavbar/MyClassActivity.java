package com.example.bottomnavbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MyClassActivity extends AppCompatActivity {

    public int who;
    public String ClassName;
    private DatabaseReference db;
    public ListView listView;
    public ArrayList<String> listData;
    public ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_class);

        Bundle extras = getIntent().getExtras();
        assert extras != null;
        who = extras.getInt("id");
        ClassName = extras.getString("class");

        listView = findViewById(R.id.birthList);
        listData = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listData);
        listView.setAdapter(adapter);

        db = FirebaseDatabase.getInstance().getReference("student");

        ValueEventListener valueEventListener = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (listData.size() > 0) listData.clear();
                for (DataSnapshot ds : snapshot.getChildren()) {
                    Student user = ds.getValue(Student.class);
                    if (user.getClasss().equals(ClassName)) {
                        listData.add(user.getFirstName() + " " +
                                user.getMiddleName() + " " +
                                user.getLastName() + " \n" + user.getBirtsday());
                    }

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        };


        db.addValueEventListener(valueEventListener);


    }

    public void setHome(View view) {
        Intent intent = new Intent(this, JournalActivity.class);
        intent.putExtra("id", who);
        startActivity(intent);
    }

    public void setJournal(View view) {
        Intent intent = new Intent(this, ResultAcivity.class);
        intent.putExtra("id", who);
        startActivity(intent);
    }

    public void setResult(View view) {
        Intent intent = new Intent(this, RaspisaniyeActivity.class);
        intent.putExtra("id", who);
        startActivity(intent);
    }

    public void setClass(View view) {
        Intent intent = new Intent(this, MyClassActivity.class);
        intent.putExtra("id", who);
        startActivity(intent);
    }

    public void setProfile(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra("id", who);
        startActivity(intent);
    }
}