package com.example.tugas_uas_akb_if3_10117118.Data.Sqlite;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static android.provider.BaseColumns._ID;
import static com.example.tugas_uas_akb_if3_10117118.Data.Sqlite.databaseAtribut.TABLE_NAME;

public class wisataBandungHelper {
    private static String DATABASE_TABLE = TABLE_NAME;
    private static wisataBandungHelper INSTANCE;
    private static sqliteHelper databaseHelper;
    private static TambahDataWisata mTambahDataWisata;
    private static SQLiteDatabase db;

    private wisataBandungHelper(Context context) {
        databaseHelper  = new sqliteHelper(context);
        mTambahDataWisata = new TambahDataWisata(context);
    }

    public static wisataBandungHelper getInstance(Context context){
        if (INSTANCE == null){
            synchronized (SQLiteOpenHelper.class){
                if (INSTANCE == null){
                    INSTANCE = new wisataBandungHelper(context);
                }
            }
        }
        return INSTANCE;
    }

    public void open() throws SQLException {
        db = databaseHelper.getWritableDatabase();
    }

    public void close(){
        databaseHelper.close();

        if (db.isOpen()){
            db.close();
        }
    }



    public Cursor queryAll(){
        return db.query(
                DATABASE_TABLE,
                null,
                null,
                null,
                null,
                null,
                _ID + " DESC");

    }
    public Cursor queryById(String id){
        return db.query(
                DATABASE_TABLE,
                null,
                _ID + " = ?",
                new String[]{id},
                null,
                null,
                null,
                null);
    }

}
