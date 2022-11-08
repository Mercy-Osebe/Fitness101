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
        int value=Integer.parseInt(over18ClickedValue);
        switch(value){
            case 1:
                setContentView(R.layout.activity_full_body);
                break;
            case 2:
                setContentView(R.layout.activity_flat_stomach);
                break;
            case 3:
                setContentView(R.layout.activity_round_booty);
                break;
//            case 4:
//                setContentView(R.layout.activity_thigh_work);
//                break;
//            case 5:
//                setContentView(R.layout.activity_toned_arms);
//                break;
//            case 6:
//                setContentView(R.layout.activity_splits);
//                break;


        }

    }
}