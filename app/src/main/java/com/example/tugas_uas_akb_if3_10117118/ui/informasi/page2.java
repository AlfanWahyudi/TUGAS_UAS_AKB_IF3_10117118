package com.example.tugas_uas_akb_if3_10117118.ui.informasi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tugas_uas_akb_if3_10117118.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link page2#newInstance} factory method to
 * create an instance of this fragment.
 */
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
