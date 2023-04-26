package edu.utsa.cs3443.campusmapper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CoursesActivity extends AppCompatActivity
{

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        Intent intent = getIntent();
        ArrayList<String[]> data = new ArrayList<String[]>();
        String user_name = intent.getStringExtra("name");
        String user_abc123 = intent.getStringExtra("abc123");
        data.add(new String[]{user_name, user_abc123});
        TextView welcomeText = findViewById(R.id.textView3), abcText = findViewById(R.id.textView8);
        welcomeText.setText("Welcome " + user_name);
        abcText.setText("("+user_abc123+")");
    }
}