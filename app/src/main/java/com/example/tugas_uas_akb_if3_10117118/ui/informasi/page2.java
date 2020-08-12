package com.example.tugas_uas_akb_if3_10117118.ui.informasi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.tugas_uas_akb_if3_10117118.R;

/** NIM : 10117118
 * Nama : Alfan Wahyudi
 * Kelas : IF-3
 * Tanggal : 12-08-2020**/

public class page2 extends Fragment {
    private int page;

    // TODO: Rename and change types and number of parameters
    public static page2 newInstance(int page) {
        page2 mPage2 = new page2();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        mPage2.setArguments(args);
        return mPage2;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("someInt", 0);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page2, container, false);
    }
}
