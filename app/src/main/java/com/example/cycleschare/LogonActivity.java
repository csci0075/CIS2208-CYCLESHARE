package com.example.cycleschare;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LogonActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;

    DBHP dbHP;

    // [3] Database tutorial 1 used: https://developer.android.com/training/data-storage/sqlite
    // [4] Database tutorial 2 used: https://ieeexplore.ieee.org/abstract/document/8861977
    // [5] Database tutorial 3 used: https://www.vogella.com/tutorials/AndroidSQLite/article.html
    // [6] Database tutorial 4 used: https://www.tutorialspoint.com/android/android_sqlite_database.htm

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logon);

        dbHP = new DBHP(this);

        usernameEditText = findViewById(R.id.username_input);
        passwordEditText = findViewById(R.id.password_input);

        Button logon_button = findViewById(R.id.logon_button);
        Button goToRegistration = findViewById(R.id.go_to_selfregistration_button);

        logon_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                SQLiteDatabase db = dbHP.getReadableDatabase();

                String[] projection = {"username"};
                String selection = "username = ? AND password = ?";
                String[] selectionArgs = {username, password};

                Cursor cursor = db.query("users", projection, selection, selectionArgs, null, null, null);
                if (cursor.getCount() > 0) {
                    Toast.makeText(LogonActivity.this, "ALERT: Logon was successful.Redirecting...", Toast.LENGTH_SHORT).show();
                    // ON SUCCESSFUL LOGIN: Redirect to the home page to show the bike renting locations
                    startActivity(new Intent(LogonActivity.this, FindLocationsActivity.class));
                } else {
                    Toast.makeText(LogonActivity.this, "ALERT: You have entered an invalid username or password", Toast.LENGTH_SHORT).show();
                }
                cursor.close();
                db.close();

            }
        });

        // ON CLICK: Redirect to Registration Page
        goToRegistration.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(LogonActivity.this, RegisterActivity.class));
            }
        });
    }
}
