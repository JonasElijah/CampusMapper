package edu.utsa.cs3443.campusmapper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;

import edu.utsa.cs3443.campusmapper.controller.Button1_MainController;

public class MainActivity extends AppCompatActivity
{

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText t1 = findViewById(R.id.name_enter_text);
        EditText t2 = findViewById(R.id.abc123_enter_text);

        (findViewById(R.id.add_courses_btn)).setOnClickListener(new Button1_MainController(this,t1,t2));
    }
}