package com.example.tugas_uas_akb_if3_10117118.ui.wisata;

import com.example.tugas_uas_akb_if3_10117118.Data.Model.wisataBandung;

import java.util.ArrayList;

public interface LoadWisataCallback {
    void preExecute();
    void postExecute(ArrayList<wisataBandung> notes);
}
