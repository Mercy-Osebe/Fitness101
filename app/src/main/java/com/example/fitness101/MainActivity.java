package com.example.fitness101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }

    public void food(View view) {
        Intent intent=new Intent(getApplicationContext(),FoodActivity.class);
        startActivity(intent);
    }

    public void after18years(View view) {
        Intent intent=new Intent(getApplicationContext(),Over18Activity.class);
        startActivity(intent);
    }

    public void before18years(View view) {
        Intent intent=new Intent(getApplicationContext(),Under18Activity.class);
        startActivity(intent);
    }
}