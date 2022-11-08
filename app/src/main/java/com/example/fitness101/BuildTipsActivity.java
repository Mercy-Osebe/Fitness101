package com.example.fitness101;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class BuildTipsActivity extends AppCompatActivity {
    TextView textViewHeading;
    TextView textViewDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // calling the action bar
        ActionBar actionBar = getSupportActionBar();

        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.activity_build_tips);
        Intent intent=getIntent();
        String details=intent.getStringExtra("details");
        String heading=details.substring(0,details.indexOf(":-"));
        String description=details.substring(details.indexOf(":-")+1);
        textViewHeading=findViewById(R.id.textViewHeading);
        textViewHeading.setText(heading);
        textViewDescription=findViewById(R.id.textViewDescription);
        textViewDescription.setText(description);



    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        Intent intent=new Intent(getApplicationContext(),FoodActivity.class);
        startActivity(intent);
        finish();
    }
}