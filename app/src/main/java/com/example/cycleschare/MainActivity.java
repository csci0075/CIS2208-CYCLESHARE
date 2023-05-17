package com.example.cycleschare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity {
    TextView Greeting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Backend of 'Begin' button to go to the next activity
        Button btn = findViewById(R.id.begin_button);

        Greeting = findViewById(R.id.Greeting);

        // Update the greeting based on the current time
        updateTimeBasedGreeting();

        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, AuthActivity.class));
            }
        });
    }

    private void updateTimeBasedGreeting() {
        Calendar calendar = Calendar.getInstance();
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);

        if (hourOfDay >= 0 && hourOfDay < 12) {
            Greeting.setText("Good Morning!");
        } else if (hourOfDay >= 12 && hourOfDay < 18) {
            Greeting.setText("Good Afternoon!");
        } else {
            Greeting.setText("Good Evening!");
        }
    }
}
