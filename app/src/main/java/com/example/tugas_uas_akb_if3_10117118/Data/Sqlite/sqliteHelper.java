package com.example.tugas_uas_akb_if3_10117118.Data.Sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class sqliteHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "WisataBandungRaya";
    private static final int DATABASE_VERSION = 1;
    private static final String SQL_CREATE_TABLE_NOTE = String.format("CREATE TABLE %s"
                    + " (%s INTEGER PRIMARY KEY AUTOINCREMENT," +
                    " %s TEXT NOT NULL," +
                    " %s TEXT NOT NULL," +
                    " %s TEXT NOT NULL," +
                    " %s TEXT NOT NULL," +
                    " %s TEXT NOT NULL," +
                    " %s TEXT NOT NULL," +
                    " %s TEXT NOT NULL," +
                    " %s TEXT NOT NULL," +
                    " %s TEXT NOT NULL)",
            databaseAtribut.TABLE_NAME,
            databaseAtribut.NoteColumns._ID,
            databaseAtribut.NoteColumns.nama_wisata,
            databaseAtribut.NoteColumns.kategori_wisata,
            databaseAtribut.NoteColumns.alamat_wisata,
            databaseAtribut.NoteColumns.hari_buka,
            databaseAtribut.NoteColumns.gambar_wisata,
            databaseAtribut.NoteColumns.jam_operasional,
            databaseAtribut.NoteColumns.keterangan_singkat,
            databaseAtribut.NoteColumns.latitude,
            databaseAtribut.NoteColumns.longitude);

    public sqliteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_TABLE_NOTE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + databaseAtribut.TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String namaWisata, String kategori, String alamat, String hariBuka,
                              String img, String jamOperasional, String keteranganSingkat,
                              String latitude, String longitude){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(databaseAtribut.NoteColumns.nama_wisata,namaWisata);
        values.put(databaseAtribut.NoteColumns.kategori_wisata,kategori);
        values.put(databaseAtribut.NoteColumns.alamat_wisata,alamat);
        values.put(databaseAtribut.NoteColumns.hari_buka,hariBuka);
        values.put(databaseAtribut.NoteColumns.gambar_wisata,img);
        values.put(databaseAtribut.NoteColumns.jam_operasional,jamOperasional);
        values.put(databaseAtribut.NoteColumns.keterangan_singkat, keteranganSingkat);
        values.put(databaseAtribut.NoteColumns.latitude, latitude);
        values.put(databaseAtribut.NoteColumns.longitude, longitude);
        long result = db.insert(databaseAtribut.TABLE_NAME,null,values);
        if(result == -1){
            return false;
        }else{
            return true;
        }
    }
}
