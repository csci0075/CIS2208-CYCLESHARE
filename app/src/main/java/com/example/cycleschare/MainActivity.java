package com.example.cycleschare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Calendar; // in order to be able to make the greeting work

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Greeting = findViewById(R.id.Greeting);

        int currentTime = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        if (currentTime >= 5 && currentTime < 12) {
            Greeting.setText("Good Morning");
        } else if (currentTime >= 12 && currentTime < 17) {
            Greeting.setText("Good Afternoon");
        } else if (currentTime >= 17 && currentTime < 21) {
            Greeting.setText("Good Evening");
        } else {
            Greeting.setText("Good Night");
        }

        // ON CLICK: Redirect to Tutorial
        Button begin_tutorial_button = findViewById(R.id.begin_tutorial_button);
        begin_tutorial_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FirstTutorialPageActivity.class));
            }
        });

        // ON CLICK: Redirect to Authentication Menu to Log In or Register
        Button goto_authentication_button = findViewById(R.id.goto_authentication_button);
        goto_authentication_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, AuthActivity.class));
            }
        });
    }
}