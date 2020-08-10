package com.example.tugas_uas_akb_if3_10117118.Data.Sqlite;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;


public class sqliteHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "WisataBandung.db";
    private static final int DATABASE_VERSION = 1;
   // private static SQLiteDatabase db;

    public sqliteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

//    public Cursor getData(String sql){
//        SQLiteDatabase database = getReadableDatabase();
//        return database.rawQuery(sql, null);
//    }
    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS wisataBandung" );
        onCreate(db);
    }
}
