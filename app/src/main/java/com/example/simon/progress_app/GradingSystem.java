package com.example.simon.progress_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GradingSystem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grading_system);
        this.setTitle(String.format("ICS 115"));
    }
    public void addSemester(View view){
        Intent intent = new Intent(this, NewCategory.class);
        startActivity(intent);
    }
}
