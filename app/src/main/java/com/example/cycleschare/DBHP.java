package com.example.cycleschare;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHP extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "cycleshare.db";
    private static final int DATABASE_VERSION = 1;

    public DBHP(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create the necessary tables
        String createUserTableQuery = "CREATE TABLE users (id INTEGER PRIMARY KEY AUTOINCREMENT, username TEXT, password TEXT)";
        db.execSQL(createUserTableQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Handle database upgrades if needed
        // Here, you can implement logic to migrate data from the old version to the new version if necessary
    }
}
