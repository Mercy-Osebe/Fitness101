package com.example.fitness101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class FullBodyActivity extends AppCompatActivity {
    private static final String TAG = "FullBodyActivity";
    private int[] ids;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_body);

          ids=new int[]{
                R.id.highstepping,R.id.sidehop,R.id.squats,R.id.wallpush_up,R.id.butt_bridge,R.id.firehydrantleft,R.id.firehydrantright,
                R.id.cobrastretch,R.id.childpose,R.id.knee_to_chest_left,R.id.knee_to_chest_right,
                R.id.crunches,R.id.planks,R.id.buttkicks};
    }

    public void imageClicked(View view) {
        for (int i = 0; i < ids.length; i++) {
            if(view.getId()==ids[i]){
                int value=i+1;
                Log.i(TAG, "imageClicked: first"+ value);
                Intent intent=new Intent(getApplicationContext(),ShowFullBodyExcercisesActivity.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);

            }

        }
    }
}