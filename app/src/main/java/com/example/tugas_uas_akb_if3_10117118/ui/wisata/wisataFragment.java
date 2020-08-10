package com.example.tugas_uas_akb_if3_10117118.ui.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.example.tugas_uas_akb_if3_10117118.Data.Model.WisataBandung;
import com.example.tugas_uas_akb_if3_10117118.Data.Sqlite.databaseAtribut;
import com.example.tugas_uas_akb_if3_10117118.Data.Sqlite.mapHelper;
import com.example.tugas_uas_akb_if3_10117118.Data.Sqlite.sqliteHelper;
import com.example.tugas_uas_akb_if3_10117118.Data.Sqlite.wisataBandungHelper;
import com.example.tugas_uas_akb_if3_10117118.Presenter.AdapterWisataBandung;
import com.example.tugas_uas_akb_if3_10117118.Presenter.WisataBandungAdapter;
import com.example.tugas_uas_akb_if3_10117118.R;
import com.google.android.material.snackbar.Snackbar;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class wisataFragment extends Fragment{

    private RecyclerView rvNotes;
    private wisataBandungHelper helper;
    private static final String EXTRA_STATE = "EXTRA_STATE";
    //private ListView rvNotes;
    private ArrayList<WisataBandung> mList = new ArrayList<>();
    //private WisataAdapter adapter = null;
    private AdapterWisataBandung adapter;
    private ProgressBar progressBar;
    private LinearLayoutManager linearLayoutManager;

    public wisataFragment() {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.wisata_fragment, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        //adapter = new WisataAdapter(this, R.layout.item_note, mList);
        progressBar = view.findViewById(R.id.progressbar);
        rvNotes = view.findViewById(R.id.rv_notes);
        linearLayoutManager = new LinearLayoutManager(getActivity());
        adapter = new AdapterWisataBandung(mList);
        rvNotes.setLayoutManager(linearLayoutManager);
        rvNotes.setAdapter(adapter);

        helper = wisataBandungHelper.getInstance(getActivity());
        helper.open();
        //rvNotes.setLayoutManager(new LinearLayoutManager(getActivity()));
        //rvNotes.setHasFixedSize(true);
        //adapter = new AdapterWisataBandung(getActivity());




        Cursor cursor = helper.queryAll();
        while ( cursor.moveToNext()){
            int id = cursor.getInt(0);
            String namaWisata = cursor.getString(1);
            String kategori = cursor.getString(2);
            String alamat = cursor.getString(3);
            String hariBuka = cursor.getString(4);
            byte[] img = cursor.getBlob(5);
            String jamOperasional= cursor.getString(6);

            mList.add(new WisataBandung(id, namaWisata, kategori, alamat, hariBuka, img, jamOperasional));
        }
        adapter.notifyDataSetChanged();

//        rvNotes.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
//                Cursor c = helper.queryById(String.valueOf(id));
//                ArrayList<Integer> arrID = new ArrayList<Integer>();
//                while( c.moveToNext() ){
//                    arrID.add(c.getInt(0));
//                }
//
//                return true;
//            }
//
//        });


//
//        if (savedInstanceState == null) {
//            new LoadNotesAsync(helper, this).execute();
//        } else {
//            ArrayList<WisataBandung> list = savedInstanceState.getParcelableArrayList(EXTRA_STATE);
//            if (list != null) {
//              adapter.setListNotes(list);
//            }
//        }

        return view;
    }

    public static byte[] imageViewToByte(ImageView image){
        Bitmap bitmap = ((BitmapDrawable)image.getDrawable()).getBitmap();
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        return byteArray;
    }

//    @Override
//    public void onSaveInstanceState(@NonNull Bundle outState) {
//        super.onSaveInstanceState(outState);
//        outState.putParcelableArrayList(EXTRA_STATE, adapter.getListNotes());
//    }
//
//    @Override
//    public void preExecute() {
//        new Runnable(){
//            @Override
//            public void run() {
//                progressBar.setVisibility(View.VISIBLE);
//            }
//        };
//    }
//
//    @Override
//    public void postExecute(ArrayList<WisataBandung> notes) {
//        progressBar.setVisibility(View.INVISIBLE);
//        if (notes.size() > 0) {
//            adapter.setListNotes(notes);
//        } else {
//            adapter.setListNotes(new ArrayList<WisataBandung>());
//            showSnackbarMessage("Tidak ada data saat ini");
//        }
//    }

//    private static class LoadNotesAsync extends AsyncTask<Void, Void, ArrayList<WisataBandung>> {
//        private final WeakReference<wisataBandungHelper> weakNoteHelper;
//        private final WeakReference<LoadWisataCallback> weakCallback;
//
//        private LoadNotesAsync(wisataBandungHelper noteHelper, LoadWisataCallback callback) {
//            this.weakNoteHelper = new WeakReference<>(noteHelper);
//            this.weakCallback = new WeakReference<>(callback);
//        }
//
//        @Override
//        protected void onPreExecute() {
//            super.onPreExecute();
//            weakCallback.get().preExecute();
//        }
//
//        @Override
//        protected ArrayList<WisataBandung> doInBackground(Void... voids) {
//            Cursor dataCursor = weakNoteHelper.get().queryAll();
//            return mapHelper.mapCursorToArrayList(dataCursor);
//        }
//
//        @Override
//        protected void onPostExecute(ArrayList<WisataBandung> notes) {
//            super.onPostExecute(notes);
//            weakCallback.get().postExecute(notes);
//        }
//    }
//
    @Override
    public void onDestroy() {
        super.onDestroy();
        helper.close();
    }

//    private void showSnackbarMessage(String message) {
//        Snackbar.make(rvNotes, message, Snackbar.LENGTH_SHORT).show();
//    }

}
