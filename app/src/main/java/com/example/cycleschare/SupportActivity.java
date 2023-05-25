package com.example.cycleschare;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SupportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);

        Button viewPricing = findViewById(R.id.show_pricing);
        Button viewHome = findViewById(R.id.open_home);

        // ON CLICK: Open the pricing page/pane
        viewPricing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SupportActivity.this, PricingActivity.class));
            }
        });

        // ON CLICK: Open the home page/pane
        viewPricing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SupportActivity.this, FindLocationsActivity.class));
            }
        });
    }
    public void submitEmail(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:clyde.sciberras.21@um.edu.mt"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "SUPPORT REQUEST | CYCLESHARE ");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}

