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
    private static SQLiteDatabase db;

    private wisataBandungHelper(Context context) {
        databaseHelper  = new sqliteHelper(context);

        //databaseHelper.insertData(namaWisata,kategoriWisata,alamatWisata,hariBuka,gamabarWisata,jamOperasional);
        databaseHelper.insertData("Farmhouse Lembang",
                "Taman",
                "Jl. Raya Lembang No.108, Gudangkahuripan, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391",
                "Senin-Minggu",
                "https://alampriangan.com/wp-content/uploads/2016/12/farmhouse-lembang.jpg",
                "8AM-8PM");

        databaseHelper.insertData("Curug Cinulang Cicalengka",
                "Air terjun",
                "Jl. Curug CinulangKec. Cicalengka, Bandung, Jawa Barat 40395",
                "Senin-Minggu",
                "https://www.bastianrental.com/wp-content/uploads/2018/12/wisata-bandung-curug-cinulang-cicalengka-selfie-hits-1080x540.jpg",
                "8AM-5PM");

        databaseHelper.insertData("Gunung Tangkuban Perahu",
                "Gunung",
                "Cikahuripan, Lembang, Kabupaten Bandung Barat, Jawa Barat",
                "Senin-Minggu",
                "https://yourbandung.com/wp-content/uploads/2019/07/030315-GUNUNG-TANGKUBAN-PARAHU0065.jpg",
                "8AM-5PM");

        databaseHelper.insertData("Kawah Putih Ciwidey",
                "Kawah, Kawah belerang",
                "Sugihmukti, Kec. Pasirjambu, Bandung, Jawa Barat",
                "Senin-Minggu",
                "https://cdn0-production-images-kly.akamaized.net/_l6SHhXRTDHyZ3NW-UZtDYaFL-o=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2784457/original/045292900_1555906786-iStock-1065331334.jpg",
                "8AM-5PM");

        databaseHelper.insertData("Museum Geologi Bandung",
                "Museum",
                "Jl. Diponegoro No.57, Cihaur Geulis, Kec. Cibeunying Kaler, Kota Bandung, Jawa Barat 40122",
                "Senin-Minggu",
                "https://www.wisataidn.com/wp-content/uploads/2020/07/Lokasi-Museum-Geologi-Bandung-750x450.jpg",
                "8AM-5PM");

        databaseHelper.insertData("Danau Situ Patenggang",
                "Danau",
                "Patengan, Kec. Rancabali, Bandung, Jawa Barat",
                "Senin-Minggu",
                "https://wisatapedi.com/wp-content/uploads/2015/06/danau-situ-patenggang-bandung.jpg",
                "8AM-6PM");

        databaseHelper.insertData("Curug Cimahi",
                "Air terjun",
                "Jl. Kolonel Masturi No.325, Kertawangi, Kec. Cisarua, Kabupaten Bandung Barat, Jawa Barat 40551",
                "Senin-Minggu",
                "https://wisatabagus.com/wp-content/uploads/2020/02/curug-cimahi.jpg",
                "8AM-6PM");

        databaseHelper.insertData("Taman Hutan Raya Ir. H. Djuanda",
                "Taman",
                "Kompleks Tahura, Jl. Ir. H. Juanda No.99, Ciburial, Kec. Cimenyan, Bandung, Jawa Barat 40198",
                "Senin-Minggu",
                "https://tourbandung.id/wp-content/uploads/2019/05/Lokasi-Taman-Hutan-Raya-Ir.-H.-Juanda-1030x541.jpg",
                "7AM-6PM");

        databaseHelper.insertData("Taman Buru Kareumbi Masigit",
                "Taman",
                "Desa Leuwiliang, Tanjungwangi, Cicalengka, Tanjungwangi, Kec. Cicalengka, Bandung, Jawa Barat 40395",
                "Senin-Minggu",
                "https://www.hargatiket.net/wp-content/uploads/2019/11/Taman-Buru-Masigit-Kareumbi.jpg",
                "24 Jam");

        databaseHelper.insertData("Ciwidey Valley Hot Spring Water Park",
                "Taman air",
                "Jl. Barutunggul KM. 17, Ciwidey, Alamendah, Rancabali, Alamendah, Kec. Rancabali, Bandung, Jawa Barat 40973",
                "Senin-Sabtu",
                "https://tempatasik.com/wp-content/uploads/2019/09/harga-tiket-masuk-ciwidey-valley.jpg",
                "none");

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
