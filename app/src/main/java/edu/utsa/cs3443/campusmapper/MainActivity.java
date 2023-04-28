package edu.utsa.cs3443.campusmapper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;

import java.io.File;

import edu.utsa.cs3443.campusmapper.controller.addCourses_btn_MainController;

public class MainActivity extends AppCompatActivity
{
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        File tempFile = new File("/data/students.csv");

        EditText t1 = findViewById(R.id.user_name_text);
        EditText t2 = findViewById(R.id.abc123_text);

        (findViewById(R.id.add_courses_btn)).setOnClickListener(new addCourses_btn_MainController(this,t1,t2));
    }
}