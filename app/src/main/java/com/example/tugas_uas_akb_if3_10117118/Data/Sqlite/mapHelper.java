package com.example.tugas_uas_akb_if3_10117118.Data.Sqlite;

import android.database.Cursor;

import com.example.tugas_uas_akb_if3_10117118.Data.Model.WisataBandung;

import java.util.ArrayList;

public class mapHelper{
    public static ArrayList<WisataBandung> mapCursorToArrayList(Cursor wisataBandungCursor){
        ArrayList<WisataBandung> wisataBandungList =new ArrayList<>();

        while (wisataBandungCursor.moveToNext()){
            int id = wisataBandungCursor.getInt(wisataBandungCursor.getColumnIndexOrThrow(databaseAtribut.NoteColumns._ID));
            String namaWisata = wisataBandungCursor.getString(wisataBandungCursor.getColumnIndexOrThrow(databaseAtribut.NoteColumns.nama_wisata));
            String kategori = wisataBandungCursor.getString(wisataBandungCursor.getColumnIndexOrThrow(databaseAtribut.NoteColumns.kategori_wisata));
            String alamat = wisataBandungCursor.getString(wisataBandungCursor.getColumnIndexOrThrow(databaseAtribut.NoteColumns.alamat_wisata));
            String hariBuka = wisataBandungCursor.getString(wisataBandungCursor.getColumnIndexOrThrow(databaseAtribut.NoteColumns.hari_buka));
            String img = wisataBandungCursor.getString(wisataBandungCursor.getColumnIndexOrThrow(databaseAtribut.NoteColumns.gambar_wisata));
            String jamOperasional = wisataBandungCursor.getString(wisataBandungCursor.getColumnIndexOrThrow(databaseAtribut.NoteColumns.jam_operasional));
            String keteranganSingkat = wisataBandungCursor.getString(wisataBandungCursor.getColumnIndexOrThrow(databaseAtribut.NoteColumns.keterangan_singkat));
            String latitude = wisataBandungCursor.getString(wisataBandungCursor.getColumnIndexOrThrow(databaseAtribut.NoteColumns.latitude));
            String longitude = wisataBandungCursor.getString(wisataBandungCursor.getColumnIndexOrThrow(databaseAtribut.NoteColumns.longitude));
            wisataBandungList.add(new WisataBandung(id, namaWisata, kategori, alamat, hariBuka, img, jamOperasional, keteranganSingkat, latitude, longitude));
        }

    return wisataBandungList;
    }
}
