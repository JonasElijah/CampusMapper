package edu.utsa.cs3443.campusmapper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

import edu.utsa.cs3443.campusmapper.controller.EnterCourse_CoursesActivity;
import edu.utsa.cs3443.campusmapper.controller.to_map_btn_CoursesActivity;

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

        ((TextView)findViewById(R.id.welcome_lbl)).setText("Welcome " + user_name);
        ((TextView)findViewById(R.id.abc123_lbl)).setText("("+user_abc123+")");

        data.add(new String[]{user_name, user_abc123});

        (findViewById(R.id.enter_course_btn)).setOnClickListener(new EnterCourse_CoursesActivity(data, findViewById(R.id.dept_code_text),findViewById(R.id.course_num_text),findViewById(R.id.name_text),findViewById(R.id.room_text)));
        (findViewById(R.id.to_map_btn)).setOnClickListener(new to_map_btn_CoursesActivity(CoursesActivity.this, data));
    }
}