package com.example.simon.progress_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NewCourse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_course);
    }
    public void addCourse(View view){
        Intent intent = new Intent(this, GradingSystem.class);
        startActivity(intent);
    }
}
