package com.example.cycleschare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FindLocationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_findlocations);


        Button buttonSupport = findViewById(R.id.open_support);

        // ON CLICK: Open the support page
        buttonSupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FindLocationsActivity.this, SupportActivity.class));
            }
        });
    }
}

