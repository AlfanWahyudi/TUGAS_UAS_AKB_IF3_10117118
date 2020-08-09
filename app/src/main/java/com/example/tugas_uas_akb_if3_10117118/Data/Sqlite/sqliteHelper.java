package com.example.tugas_uas_akb_if3_10117118.Data.Sqlite;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;


public class sqliteHelper extends SQLiteAssetHelper {
    private static final String DATABASE_NAME = "WisataBandung.db";
    private static final int DATABASE_VERSION = 1;

    public sqliteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

}
