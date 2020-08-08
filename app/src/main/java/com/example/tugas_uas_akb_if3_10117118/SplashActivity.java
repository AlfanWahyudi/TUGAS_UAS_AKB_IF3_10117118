package com.example.tugas_uas_akb_if3_10117118;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    /** NIM : 10117118
     * Nama : Alfan Wahyudi
     * Kelas : IF-3
     * Tanggal : 12-05-2020**/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // langsung pindah ke MainActivity atau activity lain begitu memasuki
        // splash screen ini
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
