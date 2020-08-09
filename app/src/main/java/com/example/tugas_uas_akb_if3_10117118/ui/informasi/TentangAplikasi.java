package com.example.tugas_uas_akb_if3_10117118.ui.informasi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tugas_uas_akb_if3_10117118.R;


public class TentangAplikasi extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tentang_aplikasi, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        return view;
    }
}
