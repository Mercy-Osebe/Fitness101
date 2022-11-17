package com.example.fitness101;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button under18;
    private Button over18;
    Menu menu;

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
//creating a menu option
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
//selecting from the menu options
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.under18:

                startActivity(new Intent(getApplicationContext(), FullBodyActivity.class));

                return true;

            case R.id.over18:

                startActivity(new Intent(this, Over18Activity.class));

                return true;
            case R.id.diet:

                startActivity(new Intent(this, FoodActivity.class));

                return true;
            case R.id.moreapps:
                 Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps?hl=en&gl=US"));
                startActivity(intent);

                return true;
            case R.id.share:
                Intent myIntent=new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                //unfinished
                String shareBody="This is the best app for fitness";
                String shareHub="Fitness101";
                myIntent.putExtra(Intent.EXTRA_SUBJECT,shareHub);
                myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                startActivity(Intent.createChooser(myIntent,"share using"));

                return true;
            case R.id.terms:
                 Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://policies.google.com/u/0/terms?hl=en"));
                startActivity(intent1);

                return true;
            case R.id.privacy_policy:
                Intent intent2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://trueyouweightloss.com/privacy-policy/"));
                startActivity(intent2);

                return true;

            default:

                return super.onOptionsItemSelected(item);

        }
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