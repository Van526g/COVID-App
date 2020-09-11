package com.example.covidapplication;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;


public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }
    public void  startApp(View view){
        int startOption;
        // There should be 4 buttons in the start activity: Symptom Survey, Daily Tracker, Admin Dashboard, & More Info on COVID
        switch(view.getId()){
            case R.id.symptomSurvey:
                startOption = 0;
                break;
            case R.id.dailyTracker:
                startOption = 1;
                break;
            case R.id.adminDash:
                startOption = 2;
                break;
            case R.id.infoCOVID:
                startOption = 3;
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());
        }
        Intent intent=new Intent(getApplicationContext(), MainActivity.class);
        intent.putExtra("START_OPTION",startOption);
        startActivity(intent);
    }

}

