package com.example.tugas_uas_akb_if3_10117118.ui.profilPembuat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.tugas_uas_akb_if3_10117118.R;

public class profilPembuatFragment extends Fragment {


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.profil_pembuat_fragment, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();

        return root;
    }

}
