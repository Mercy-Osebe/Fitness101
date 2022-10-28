package com.example.fitness101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button under18;
    private Button over18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        over18=findViewById(R.id.over18);
        over18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Over18Activity.class);
                startActivity(intent);
            }
        });
        under18=findViewById(R.id.under18);
        under18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),FullBodyActivity.class);
                startActivity(intent);
            }
        });


    }

    public void food(View view) {
        Intent intent=new Intent(getApplicationContext(),FoodActivity.class);
        startActivity(intent);
    }

    public void after18years(View view) {
        Intent intent=new Intent(getApplicationContext(),Over18Activity.class);
        startActivity(intent);
    }
//The under 18 only gets access to the full body workout
    public void before18years(View view) {
        Intent intent=new Intent(getApplicationContext(),FullBodyActivity.class);
        startActivity(intent);
    }
}