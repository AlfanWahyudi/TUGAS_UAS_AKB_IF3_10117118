package com.example.tugas_uas_akb_if3_10117118.ui.profilPembuat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tugas_uas_akb_if3_10117118.R;

public class profilPembuatFragment extends Fragment {

    //private ProfilPembuatViewModel mViewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
//        mViewModel =
//                ViewModelProviders.of(this).get(ProfilPembuatViewModel.class);
        View root = inflater.inflate(R.layout.profil_pembuat_fragment, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
//        final TextView textView = root.findViewById(R.id.text_notifications);
//        mViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }

}
