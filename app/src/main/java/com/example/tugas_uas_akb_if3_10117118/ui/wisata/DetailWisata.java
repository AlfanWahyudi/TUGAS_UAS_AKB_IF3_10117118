package com.example.tugas_uas_akb_if3_10117118.ui.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.tugas_uas_akb_if3_10117118.Data.Model.wisataBandung;
import com.example.tugas_uas_akb_if3_10117118.Data.Sqlite.wisataBandungHelper;
import com.example.tugas_uas_akb_if3_10117118.R;

public class DetailWisata extends AppCompatActivity implements View.OnClickListener{
    public TextView detailNamaWisata, detailKategoriWisata, detailAlamatWisata, detalKeteranganWisata;
    public ImageView detailGambarWisata;
    public ImageButton ImgButtonMaps;

    private boolean isDetail = false;
    private wisataBandung mWisataBadung;
    private wisataBandungHelper wisataHelper;
    private int position;

    public static final String EXTRA_NOTE = "extra_note";
    public static final String EXTRA_POSITION = "extra_position";
    public static final int REQUEST_UPDATE = 200;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_wisata);
        getSupportActionBar().hide();
        detailNamaWisata = findViewById(R.id.detail_nama_wisata);
        detailKategoriWisata = findViewById(R.id.detail_kategori);
        detailAlamatWisata = findViewById(R.id.detail_alamat);
        detailKategoriWisata = findViewById(R.id.detail_keterangan);
        detailGambarWisata = findViewById(R.id.detailgambarwisata);
        ImgButtonMaps = findViewById(R.id.buttonMaps);
        ImgButtonMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        wisataHelper = wisataBandungHelper.getInstance(getApplicationContext());

        //mWisataBadung = getIntent().getParcelableExtra(EXTRA_NOTE);
        if (mWisataBadung != null){
            position = getIntent().getIntExtra(EXTRA_POSITION, 0);
            isDetail= true;
        }else {
            mWisataBadung = new wisataBandung();
        }

        if(isDetail){
            if (mWisataBadung != null){
                detailNamaWisata.setText(mWisataBadung.getNamaWisata());
                detailKategoriWisata.setText(mWisataBadung.getKategori());
                detailAlamatWisata.setText(mWisataBadung.getAlamat());
                detailGambarWisata.setImageBitmap(BitmapFactory.decodeByteArray(mWisataBadung.getImg(), 0, mWisataBadung.getImg().length));
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
