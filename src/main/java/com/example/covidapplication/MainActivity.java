package com.example.covidapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.media.MediaPlayer;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// Declared & assigned variables
public class  MainActivity extends AppCompatActivity {
    private TextView countLabel;
    private TextView symptomLabel;
    private Button yesBtn;
    private Button noBtn;

    private int yesCount = 0;



    ArrayList<ArrayList<String>> symptomArray=new ArrayList<>();
    // Symptoms asked to user
    String[][] symptomData = {
            {"Are you experiencing chills or a fever?"},
            {"Are you experiencing a cough?"},
            {"Are you experiencing shortness of breath or difficulty breathing?"},
            {"Are you experiencing fatigue?"},
            {"Are you experiencing muscle or body aches?"},
            {"Are you experiencing a headache?"},
            {"Are you experiencing new loss of taste or smell?"},
            {"Are you experiencing a sore throat?"},
            {"Are you experiencing congestion or runny nose?"},
            {"Are you experiencing nausea or vomiting?"},
            {"Are you experiencing diarrhea?"},
            {"Have you been in contact with someone tested COVID positive recently?"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countLabel = findViewById(R.id.countLabel);
        symptomLabel = findViewById(R.id.symptomLabel);
        yesBtn = findViewById(R.id.yesBtn);
        noBtn = findViewById(R.id.noBtn);
    }
}