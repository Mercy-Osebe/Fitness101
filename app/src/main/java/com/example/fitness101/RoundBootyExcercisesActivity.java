package com.example.fitness101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RoundBootyExcercisesActivity extends AppCompatActivity {

    String buttonClickValue;
    Button startBtn;
    private CountDownTimer countDownTimer;
    TextView mtextView;
    private boolean MTimeRunning;
    private long MTimeLeftMills;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_show_flat_stomach_excercises);
        Intent intent=getIntent();
        buttonClickValue=intent.getStringExtra("value");
        int intValue=Integer.parseInt(buttonClickValue);
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
        startBtn=findViewById(R.id.startBtn);
        mtextView=findViewById(R.id.timeBtn);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(MTimeRunning){
                    stopTimer();

                }
                else{
                    startTimer();

                }
            }
        });
    }
    private void stopTimer(){

//        introduce two options for restarting the timer and continuing the timer.

        countDownTimer.cancel();
        MTimeRunning=false;
        startBtn.setText("Continue");
    }
    private void startTimer(){
        final CharSequence value1=mtextView.getText();
        String num1=value1.toString();
        String num2=num1.substring(0,2);
        String num3=num1.substring(3,5);
        final int number=Integer.parseInt(num2)*60+Integer.parseInt(num3);
        MTimeLeftMills=number* 1000L;
        countDownTimer=new CountDownTimer(MTimeLeftMills,1000) {
            @Override
            public void onTick(long l) {
                MTimeLeftMills=l;
                updateTimer();

            }

            @Override
            public void onFinish() {
                //the new value has been set to 1 you can make this dynamic ie user controlled.
                //this onfinish countdown ushers the next intent/activity in the activities menu list

                int newValue=Integer.parseInt(buttonClickValue)+1;
                if(newValue<=7){
                    //ShowFullBodyExcercisesActivity.this is same as getApplicationContext()
                    Intent intent=new Intent(getApplicationContext(),ShowFullBodyExcercisesActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    intent.putExtra("value",String.valueOf(newValue));
                    startActivity(intent);
                }
                else{
                    newValue=1;
                    Intent intent=new Intent(getApplicationContext(),ShowFullBodyExcercisesActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    intent.putExtra("value",String.valueOf(newValue));
                    startActivity(intent);


                }

            }
            //.start() starts the timer.
        }.start();
        startBtn.setText("Pause");
        MTimeRunning=true;
    }
    private void updateTimer() {
        int minutes = (int) MTimeLeftMills / 60000;
        int seconds = (int) MTimeLeftMills / 1000;
        String timeLeftText = "";
        //the less than 10 condition is just to ensure that we insert the zero before the minutes left.

        if (minutes < 10) {
            timeLeftText = "0";
            timeLeftText = timeLeftText + minutes + ":";
        }
        String timeLeftSec;
        if (seconds >= 10 && seconds <= 59) {
            timeLeftSec = "";
            timeLeftSec = timeLeftSec + seconds;
            timeLeftText += timeLeftSec;
            mtextView.setText(timeLeftText);

        } else if (seconds < 10) {

            timeLeftSec = "0";
            timeLeftSec = timeLeftSec + seconds;
            timeLeftText += timeLeftSec;
            mtextView.setText(timeLeftText);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}