package com.example.simon.progress_app;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView tv_Semester;
    Typeface f1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_Semester = (TextView) findViewById(R.id.tvSemester);

        f1 = Typeface.createFromAsset(getAssets(), "geometrix.ttf");

        tv_Semester.setTypeface(f1);
    }

    public void addSemester(View view){
        Intent intent = new Intent(this, CategoryPage.class);
        startActivity(intent);
    }
}
