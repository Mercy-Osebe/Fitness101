package com.example.fitness101;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FoodActivity extends AppCompatActivity {
    ListView listView;
    private static final String TAG = "FoodActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        // calling the action bar
        ActionBar actionBar = getSupportActionBar();

        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);

        listView=findViewById(R.id.listView);
        String [] titleStory=getResources().getStringArray(R.array.title_story);
        String[] detailStory=getResources().getStringArray(R.array.details_story);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(getApplicationContext(),R.layout.list_row,R.id.row_text,titleStory);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String details=detailStory[i];
                Intent intent=new Intent(getApplicationContext(),BuildTipsActivity.class);
                intent.putExtra("details",details);
                startActivity(intent);
                
            }
        });

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
}