package com.example.cycleschare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cycleschare.BikeListFragment;

public class LocationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locations);

// Add the BikeListFragment to the activity
        BikeListFragment bikeListFragment = new BikeListFragment();
        getSupportFragmentManager().beginTransaction()
            .replace(R.id.fragment_container, bikeListFragment)
            .commit();

// Access the fragment's TextViews and update their text
        bikeListFragment.PageTitle.setText("HOME");
        bikeListFragment.LocationOne.setText("University of Malta (Msida) - Tal-Qroqq");
        bikeListFragment.LocationTwo.setText("Valleta Terminus (Valletta) - Near A Stops");


        // Add the BikeListFragment to the activity
        getSupportFragmentManager().beginTransaction()
            .replace(R.id.fragment_container, new BikeListFragment())
            .commit();

        // Get references to the buttons
        Button buttonHome = findViewById(R.id.open_home);
        Button buttonSupport = findViewById(R.id.open_support);

        // Set click listeners for the buttons
        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LocationsActivity.this, LocationsActivity.class));

            }
        });

        buttonSupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LocationsActivity.this, FirstTutorialPageActivity.class));
                // Handle SUPPORT button click
                // Add your desired behavior here
            }
        });
    }
}

