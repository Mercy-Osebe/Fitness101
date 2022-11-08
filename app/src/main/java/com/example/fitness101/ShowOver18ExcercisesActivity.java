package com.example.fitness101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ShowOver18ExcercisesActivity extends AppCompatActivity {
    String over18ClickedValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_show_over18_excercises);
        Intent intent=getIntent();
        over18ClickedValue= intent.getStringExtra("valueID");
        int value = Integer.parseInt(over18ClickedValue);


        switch(value){
            case R.id.fullbody:
                setContentView(R.layout.activity_full_body);
                break;
            case R.id.flattummy:
                setContentView(R.layout.activity_flat_stomach);
                break;
            case R.id.roundbooty:
                setContentView(R.layout.activity_round_booty);
                break;
            case R.id.thighwork:
                setContentView(R.layout.activity_thigh_work);
                break;
            case R.id.tonedarms:
                setContentView(R.layout.activity_toned_arms);
                break;
            case R.id.splits:
                setContentView(R.layout.activity_splits);
                break;


        }

    }
}