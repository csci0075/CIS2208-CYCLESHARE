package com.example.cycleschare;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PricingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);

        Button viewPricing = findViewById(R.id.show_pricing);

        // ON CLICK: open the home page/pane
        viewPricing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PricingActivity.this, LocationsActivity.class));

            }
        });
    }
    public void submitEmail(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:clyde.sciberras.21@um.edu.mt")); // Replace with the desired email address
        intent.putExtra(Intent.EXTRA_SUBJECT, "SUPPORT REQUEST | CYCLESHARE ");

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

}

