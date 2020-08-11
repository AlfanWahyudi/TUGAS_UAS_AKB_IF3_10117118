package com.example.tugas_uas_akb_if3_10117118.ui.wisata;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.tugas_uas_akb_if3_10117118.Data.Model.WisataBandung;
import com.example.tugas_uas_akb_if3_10117118.Data.Sqlite.wisataBandungHelper;
import com.example.tugas_uas_akb_if3_10117118.Presenter.CustomClickListener;
import com.example.tugas_uas_akb_if3_10117118.R;
import com.example.tugas_uas_akb_if3_10117118.ui.Maps.Maps;

public class DetailWisata extends AppCompatActivity implements View.OnClickListener{
    public TextView detailNamaWisata, detailKategoriWisata, detailAlamatWisata, detailKeteranganWisata, detailHariBuka, detailJamOperasional;
    public ImageView detailGambarWisata;
    public ImageButton imgButtonMaps;

    private boolean isDetail = false;
    private WisataBandung mWisataBadung;
    private wisataBandungHelper wisataHelper;
    private int position;

    public static final String EXTRA_NOTE = "extra_note";
    public static final String EXTRA_POSITION = "extra_position";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_wisata);
        getSupportActionBar().hide();

        detailNamaWisata = findViewById(R.id.detail_nama_wisata);
        detailKategoriWisata = findViewById(R.id.detail_kategori);
        detailAlamatWisata = findViewById(R.id.detail_alamat);
        detailGambarWisata = findViewById(R.id.detailgambarwisata);
        detailKeteranganWisata = findViewById(R.id.detail_keterangan);
        detailHariBuka = findViewById(R.id.detail_hari_buka);
        detailJamOperasional = findViewById(R.id.detail_jam_operasional);
        imgButtonMaps = findViewById(R.id.buttonMaps);

        imgButtonMaps.setOnClickListener(new CustomClickListener(position, new CustomClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Intent intent = new Intent(DetailWisata.this, Maps.class);
                intent.putExtra(DetailWisata.EXTRA_POSITION, position);
                intent.putExtra(DetailWisata.EXTRA_NOTE, mWisataBadung);
                startActivity(intent);
            }
        }));

        wisataHelper = wisataBandungHelper.getInstance(getApplicationContext());

        mWisataBadung = getIntent().getParcelableExtra(EXTRA_NOTE);
        if (mWisataBadung != null){
            position = getIntent().getIntExtra(EXTRA_POSITION, 0);
            isDetail= true;
        }else {
            mWisataBadung = new WisataBandung();
        }



        if(isDetail){
            if(mWisataBadung != null){
                detailNamaWisata.setText(mWisataBadung.getNamaWisata());
                detailKategoriWisata.setText(mWisataBadung.getKategori());
                detailAlamatWisata.setText(mWisataBadung.getAlamat());
                detailHariBuka.setText(mWisataBadung.getHariBuka());
                detailJamOperasional.setText(mWisataBadung.getJamOperasional());
                detailKeteranganWisata.setText(mWisataBadung.getKeteranganSingkat());
                Glide.with(this)
                        .asBitmap()
                        .load(mWisataBadung.getImg())
                        .into(detailGambarWisata);

            }
        }

    }


    @Override
    public void onClick(View v) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
