package com.example.tugas_uas_akb_if3_10117118.Data.Sqlite;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.BaseColumns;

import com.example.tugas_uas_akb_if3_10117118.Data.Model.wisataBandung;

import java.util.ArrayList;

public class mapHelper implements BaseColumns {
    public static ArrayList<wisataBandung> mapCursorToArrayList(Cursor wisataBandungCursor){
        ArrayList<wisataBandung> wisataBandungList =new ArrayList<>();

        while (wisataBandungCursor.moveToNext()){
//            int id = wisataBandungCursor.getInt(0);
//            String namaWisata = wisataBandungCursor.getString(1);
//            String kategori = wisataBandungCursor.getString(2);
//            String alamat = wisataBandungCursor.getString(3);
//            String keterangan = wisataBandungCursor.getString(4);
//            byte[] img = wisataBandungCursor.getBlob(5);
            int id = wisataBandungCursor.getInt(wisataBandungCursor.getColumnIndexOrThrow(databaseAtribut.NoteColumns.ID_wisata));
            String namaWisata = wisataBandungCursor.getString(wisataBandungCursor.getColumnIndexOrThrow(databaseAtribut.NoteColumns.nama_wisata));
            String kategori = wisataBandungCursor.getString(wisataBandungCursor.getColumnIndexOrThrow(databaseAtribut.NoteColumns.kategori_wisata));
            String alamat = wisataBandungCursor.getString(wisataBandungCursor.getColumnIndexOrThrow(databaseAtribut.NoteColumns.alamat_wisata));
            String keterangan = wisataBandungCursor.getString(wisataBandungCursor.getColumnIndexOrThrow(databaseAtribut.NoteColumns.keterangan_wisata));
            byte[] img = wisataBandungCursor.getBlob(wisataBandungCursor.getColumnIndexOrThrow(databaseAtribut.NoteColumns.gambar_wisata));
            wisataBandungList.add(new wisataBandung(id, namaWisata, kategori, alamat, keterangan, img));

        }

    return wisataBandungList;
    }
}
