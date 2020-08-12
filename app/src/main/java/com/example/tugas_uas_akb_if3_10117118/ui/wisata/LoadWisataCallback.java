package com.example.tugas_uas_akb_if3_10117118.ui.wisata;

import com.example.tugas_uas_akb_if3_10117118.Data.Model.WisataBandung;

import java.util.ArrayList;

/** NIM : 10117118
 * Nama : Alfan Wahyudi
 * Kelas : IF-3
 * Tanggal : 12-08-2020**/

public interface LoadWisataCallback {
    void preExecute();
    void postExecute(ArrayList<WisataBandung> notes);
}
