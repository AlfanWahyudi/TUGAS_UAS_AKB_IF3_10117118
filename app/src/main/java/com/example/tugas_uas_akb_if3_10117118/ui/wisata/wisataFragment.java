package com.example.tugas_uas_akb_if3_10117118.ui.wisata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.example.tugas_uas_akb_if3_10117118.Data.Model.wisataBandung;
import com.example.tugas_uas_akb_if3_10117118.Data.Sqlite.mapHelper;
import com.example.tugas_uas_akb_if3_10117118.Data.Sqlite.wisataBandungHelper;
import com.example.tugas_uas_akb_if3_10117118.Presenter.AdapterWisataBandung;
import com.example.tugas_uas_akb_if3_10117118.R;
import com.google.android.material.snackbar.Snackbar;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class wisataFragment extends Fragment implements LoadWisataCallback{

    private RecyclerView rvNotes;
    private wisataBandungHelper helper;
    private static final String EXTRA_STATE = "EXTRA_STATE";
    private ListView mListView;
    //private ArrayList<wisataBandung> mList;
    //private WisataAdapter adapter = null;
    private AdapterWisataBandung adapter;
    private ProgressBar progressBar;

    public wisataFragment() {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.wisata_fragment, container, false);
        //((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        //mList = new ArrayList<>();
        //adapter = new WisataAdapter(this, R.layout.item_note, mList);
        progressBar = view.findViewById(R.id.progressbar);
        rvNotes = view.findViewById(R.id.rv_notes);
        rvNotes.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvNotes.setHasFixedSize(true);
        adapter = new AdapterWisataBandung(getActivity());
        rvNotes.setAdapter(adapter);

        helper = wisataBandungHelper.getInstance(getActivity());
        helper.open();

        if (savedInstanceState == null) {
            new LoadNotesAsync(helper, this).execute();
        } else {
            ArrayList<wisataBandung> list = savedInstanceState.getParcelableArrayList(EXTRA_STATE);
            if (list != null) {
              adapter.setListNotes(list);
            }
        }
////        final TextView textView = root.findViewById(R.id.text_home);
////        mWisataViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
////            @Override
////            public void onChanged(@Nullable String s) {
////                textView.setText(s);
////            }
////        });
        return view;
    }

//    @Override
//    public void onSaveInstanceState(@NonNull Bundle outState) {
//        super.onSaveInstanceState(outState);
//        outState.putParcelableArrayList(EXTRA_STATE, adapter.getListNotes());
//    }
//
    @Override
    public void preExecute() {
        new Runnable(){
            @Override
            public void run() {
                progressBar.setVisibility(View.VISIBLE);
            }
        };
    }

    @Override
    public void postExecute(ArrayList<wisataBandung> notes) {
        progressBar.setVisibility(View.INVISIBLE);
        if (notes.size() > 0) {
            adapter.setListNotes(notes);
        } else {
            adapter.setListNotes(new ArrayList<wisataBandung>());
            showSnackbarMessage("Tidak ada data saat ini");
        }
    }

    private static class LoadNotesAsync extends AsyncTask<Void, Void, ArrayList<wisataBandung>> {
        private final WeakReference<wisataBandungHelper> weakNoteHelper;
        private final WeakReference<LoadWisataCallback> weakCallback;

        private LoadNotesAsync(wisataBandungHelper noteHelper, LoadWisataCallback callback) {
            this.weakNoteHelper = new WeakReference<>(noteHelper);
            this.weakCallback = new WeakReference<>(callback);
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            weakCallback.get().preExecute();
        }

        @Override
        protected ArrayList<wisataBandung> doInBackground(Void... voids) {
            Cursor dataCursor = weakNoteHelper.get().queryAll();
            return mapHelper.mapCursorToArrayList(dataCursor);
        }

        @Override
        protected void onPostExecute(ArrayList<wisataBandung> notes) {
            super.onPostExecute(notes);
            weakCallback.get().postExecute(notes);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        helper.close();
    }

    private void showSnackbarMessage(String message) {
        Snackbar.make(rvNotes, message, Snackbar.LENGTH_SHORT).show();
    }
}
