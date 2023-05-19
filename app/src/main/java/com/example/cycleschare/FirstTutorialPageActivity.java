package com.example.cycleschare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FirstTutorialPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_tutorial_page);

        TextView PageTitle = findViewById(R.id.PageTitle);

        TextView PricingText = findViewById(R.id.PageBodyTextTwo);
    }
}