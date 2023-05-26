package com.example.cycleschare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AuthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);


        Button btn1 = (Button) findViewById(R.id.log_on_button);
        Button btn2 = (Button) findViewById(R.id.register_button);

        // ON CLICK: Redirect to logon page
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(AuthActivity.this, LogonActivity.class));
            }
        });

        // ON CLICK: Red
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(AuthActivity.this, RegisterActivity.class));
            }
        });
    }
}
