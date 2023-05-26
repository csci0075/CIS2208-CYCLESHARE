package com.example.cycleschare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

public class FirstTutorialPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_tutorial_page);

        // ON CLICK: Go back to start page
        Button return_button = findViewById(R.id.return_button);
        return_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstTutorialPageActivity.this, MainActivity.class));
            }
        });

        TextView PageTitle = findViewById(R.id.PageTitle);

        TextView EmojiOne = findViewById(R.id.PageBodyEmojiOne);
        // [6] Tutorial on how to set text: https://developer.android.com/reference/android/widget/TextView
        EmojiOne.setText("\uD83D\uDEB2"); // Sets text to bike emoji

        TextView EmojiTwo = findViewById(R.id.PageBodyEmojiTwo);
        EmojiTwo.setText("\uD83D\uDDFA"); // Sets text to map emoji

        TextView BodyTextOne = findViewById(R.id.PageBodyTextOne);
        TextView BodyTextTwo = findViewById(R.id.PageBodyTextTwo);

        // ON CLICK: Continue Tutorial
        Button continue_button = findViewById(R.id.continue_button);
        continue_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstTutorialPageActivity.this, SecondTutorialPageActivity.class));
            }
        });
    }
}
