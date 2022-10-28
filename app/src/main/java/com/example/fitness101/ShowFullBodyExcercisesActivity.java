package com.example.fitness101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ShowFullBodyExcercisesActivity extends AppCompatActivity {
    String buttonValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_full_body_excercises);
        Intent intent=getIntent();
        buttonValue=intent.getStringExtra("value");
        int intValue=Integer.parseInt(buttonValue);
        switch (intValue){
            case 1:
                setContentView(R.layout.highstepping_activity);
                break;
            case 2:
                setContentView(R.layout.sidehop_activity);
                break;
            case 3:
                setContentView(R.layout.squats_activity);
                break;
            case 4:
                setContentView(R.layout.wallpush_up_activity);
                break;
            case 5:
                setContentView(R.layout.butt_bridge_activity);
                break;
            case 6:
                setContentView(R.layout.firehydrant_left_activity);
                break;
            case 7:
                setContentView(R.layout.firehydrant_right_activity);
                break;
            case 8:
                setContentView(R.layout.cobrastretch_activity);
                break;
            case 9:
                setContentView(R.layout.childpose_activity);
                break;
            case 10:
                setContentView(R.layout.knee_to_chest_lest_activity);
                break;
            case 11:
                setContentView(R.layout.knee_to_chest_right_activity);
                break;
            case 12:
                setContentView(R.layout.crunches_activity);
                break;
            case 13:
                setContentView(R.layout.planks_activity);
                break;
            case 14:
                setContentView(R.layout.buttkicks_activity);
                break;



        }

    }
}