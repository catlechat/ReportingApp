package com.ivan.repportingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.analytics.FirebaseAnalytics;


public class About extends AppCompatActivity {

    private Button btn_back;

    private FirebaseAnalytics mFirebaseAnalytics;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        btn_back = findViewById(R.id.btn_back);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);


        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ANALYTICS
                String message = "visited_about";
                mFirebaseAnalytics.setUserProperty("visited_about", message);
                Intent i = new Intent(About.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
