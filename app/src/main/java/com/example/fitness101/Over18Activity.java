package com.example.fitness101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

public class Over18Activity extends AppCompatActivity {
    private static final String TAG = "Over18Activity";
    private LinearLayout fullbody;
    int[] over18Ids;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_over18);
        over18Ids= new int[]{R.id.fullbody, R.id.flattummy, R.id.roundbooty, R.id.thighwork, R.id.tonedarms, R.id.splits};
    }

    public void activityImageClicked(View view) {
            int valueID = view.getId();
            Intent intent = new Intent(getApplicationContext(), ShowOver18ExcercisesActivity.class);
            intent.putExtra("valueID",String.valueOf(valueID));
            startActivity(intent);

            Log.d(TAG, "activityImageClicked: "+valueID);

    }
}