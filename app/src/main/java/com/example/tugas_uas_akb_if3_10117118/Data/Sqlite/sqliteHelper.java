package com.example.tugas_uas_akb_if3_10117118.Data.Sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class sqliteHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "wisataBandungRaya.db";
    private static final int DATABASE_VERSION = 1;

    public sqliteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
