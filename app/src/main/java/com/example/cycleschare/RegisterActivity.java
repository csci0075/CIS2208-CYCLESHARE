package com.example.cycleschare;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private EditText confirmPasswordEditText;
    private Button register_button;

    DBHP dbHP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        dbHP = new DBHP(this);

        usernameEditText = findViewById(R.id.username_input);
        passwordEditText = findViewById(R.id.password_input);
        confirmPasswordEditText = findViewById(R.id.confirm_password_input);

        register_button = findViewById(R.id.self_register_button);
        Button goToLogon = findViewById(R.id.go_to_logon_button);

        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                String confirmPassword = confirmPasswordEditText.getText().toString();

                if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "ALERT: All fields are required", Toast.LENGTH_SHORT).show();
                } else if (!password.equals(confirmPassword)) {
                    Toast.makeText(RegisterActivity.this, "ALERT: Entered passwords do not match", Toast.LENGTH_SHORT).show();
                } else {
                    // ...
                    SQLiteDatabase db = dbHP.getWritableDatabase();

                    ContentValues values = new ContentValues();
                    values.put("username", username);
                    values.put("password", password);

                    long newRowId = db.insert("users", null, values);
                    if (newRowId != -1) {
                        Toast.makeText(RegisterActivity.this, "ALERT: Registration successful. Redirecting...", Toast.LENGTH_SHORT).show();
                        // ON SUCCESSFUL REGISTRATION: Redirect to the home page to show the bike renting locations
                        startActivity(new Intent(RegisterActivity.this, FindLocationsActivity.class));
                    } else {
                        Toast.makeText(RegisterActivity.this, "ALERT: Registration failed", Toast.LENGTH_SHORT).show();
                    }
                    db.close();
                }
            }
        });
        // ON CLICK: Redirect to Registration Page
        goToLogon.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(RegisterActivity.this, LogonActivity.class));
            }
        });
    }
}
