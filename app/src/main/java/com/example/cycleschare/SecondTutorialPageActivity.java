package com.example.cycleschare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondTutorialPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_tutorial_page);

        // ON CLICK: Go back to first tutorial page
        Button return_button = findViewById(R.id.return_button);
        return_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondTutorialPageActivity.this, FirstTutorialPageActivity.class));
            }
        });

        TextView PageTitle = findViewById(R.id.PageTitle);

        TextView EmojiOne = findViewById(R.id.PageBodyEmojiOne);
        EmojiOne.setText("\uD83D\uDCB6"); // Sets text to Euro emoji

        TextView EmojiTwo = findViewById(R.id.PageBodyEmojiTwo);
        EmojiTwo.setText("\u2753"); // Sets text to Question emoji

        TextView BodyTextOne = findViewById(R.id.PageBodyTextOne);
        TextView BodyTextTwo = findViewById(R.id.PageBodyTextTwo);

        // ON CLICK: Redirect to Authentication Menu to Log In or Register
        Button continue_tutorial_button = findViewById(R.id.continue_button);
        continue_tutorial_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondTutorialPageActivity.this, AuthActivity.class));
            }
        });
    }
}