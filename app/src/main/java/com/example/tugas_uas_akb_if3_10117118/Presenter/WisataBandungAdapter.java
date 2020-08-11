package com.example.tugas_uas_akb_if3_10117118.Presenter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.example.tugas_uas_akb_if3_10117118.Data.Model.WisataBandung;
import com.example.tugas_uas_akb_if3_10117118.R;
import com.example.tugas_uas_akb_if3_10117118.ui.wisata.wisataFragment;

import java.util.ArrayList;

public class WisataBandungAdapter extends BaseAdapter {

    private wisataFragment context;
    private int layout;
    private ArrayList<WisataBandung> list;

    public WisataBandungAdapter(wisataFragment context, int layout, ArrayList<WisataBandung> list) {
        this.context = context;
        this.layout = layout;
        this.list = list;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private class ViewHolder{
        TextView tvNamaWisata, tvKategori, tvAlamat, tvKeterangan;
        ImageView imgGambar;
        CardView cvNote;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        ViewHolder viewHolder = new ViewHolder();

        if (view == null){
            LayoutInflater inflater = (LayoutInflater) context.getLayoutInflater();
            view = inflater.inflate(layout,null);
            viewHolder.tvNamaWisata = view.findViewById(R.id.nama_wisata);
            viewHolder.tvKategori = view.findViewById(R.id.kategori);
            viewHolder.tvAlamat = view.findViewById(R.id.alamat);
           // viewHolder.tvKeterangan = view.findViewById(R.id.keterangan);
            viewHolder.imgGambar = view.findViewById(R.id.gambar_wisata);
            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }

        WisataBandung mWisataBandung = list.get(position);

        viewHolder.tvNamaWisata.setText(mWisataBandung.getNamaWisata());
        viewHolder.tvKategori.setText(mWisataBandung.getKategori());
        viewHolder.tvAlamat.setText(mWisataBandung.getAlamat());
        //viewHolder.tvKeterangan.setText(mWisataBandung.getKeterangan());

//        byte[] recordImg = mWisataBandung.getImg();
//        Bitmap bitmap = BitmapFactory.decodeByteArray(recordImg,0,recordImg.length);
//        viewHolder.imgGambar.setImageBitmap(bitmap);


        return view;
    }
}
