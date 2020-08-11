package com.example.tugas_uas_akb_if3_10117118.Data.Sqlite;

import android.provider.BaseColumns;

public class databaseAtribut {
    static String TABLE_NAME = "WisataBandung";

    public static final class NoteColumns implements BaseColumns {
        public static String nama_wisata = "nama_wisata";
        public static String kategori_wisata = "kategori_wisata";
        public static String alamat_wisata= "alamat_wisata";
        public static String hari_buka= "hari_buka";
        public static String gambar_wisata = "url_gambar_wisata";
        public static String jam_operasional = "jam_operasional";

    }
}
