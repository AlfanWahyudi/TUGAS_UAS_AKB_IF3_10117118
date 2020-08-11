package com.example.tugas_uas_akb_if3_10117118.ui.Maps;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.example.tugas_uas_akb_if3_10117118.Data.Model.WisataBandung;
import com.example.tugas_uas_akb_if3_10117118.Data.Sqlite.wisataBandungHelper;
import com.example.tugas_uas_akb_if3_10117118.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Maps extends FragmentActivity implements OnMapReadyCallback {

    private boolean isMaps = false;
    private WisataBandung mWisataBadung;
    private wisataBandungHelper wisataHelper;
    private int position;

    public static final String EXTRA_NOTE = "extra_note";
    public static final String EXTRA_POSITION = "extra_position";


    private GoogleMap mMap;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        wisataHelper = wisataBandungHelper.getInstance(getApplicationContext());

        mWisataBadung = getIntent().getParcelableExtra(EXTRA_NOTE);
        if (mWisataBadung != null){
            position = getIntent().getIntExtra(EXTRA_POSITION, 0);
            isMaps= true;
        }else {
            mWisataBadung = new WisataBandung();
        }
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        if (isMaps) {

            // Add a marker in Sydney and move the camera
            LatLng sydney = new LatLng(Double.valueOf(mWisataBadung.getLatitude()), Double.valueOf(mWisataBadung.getLongitude()));
            mMap.addMarker(new MarkerOptions().position(sydney).title(mWisataBadung.getNamaWisata()));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(15),200,null);
        }


    }
}