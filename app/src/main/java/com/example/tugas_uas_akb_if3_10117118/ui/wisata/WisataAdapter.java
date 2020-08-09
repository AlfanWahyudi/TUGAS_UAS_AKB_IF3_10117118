package com.example.tugas_uas_akb_if3_10117118.ui.wisata;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.example.tugas_uas_akb_if3_10117118.Data.Model.wisataBandung;
import com.example.tugas_uas_akb_if3_10117118.R;

import java.util.ArrayList;

//public class WisataAdapter extends BaseAdapter {
//
//    private wisataFragment mContext;
//    private int layout;
//    private ArrayList<wisataBandung> recordList;
//
//    public WisataAdapter(wisataFragment context, int layout, ArrayList<wisataBandung> recordList) {
//        mContext = context;
//        this.layout = layout;
//        this.recordList = recordList;
//    }
//
//    @Override
//    public int getCount() {
//        return recordList.size();
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return recordList.get(position);
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return position;
//    }
//
//    private class ViewHolder{
//        TextView tvNamaWisata, tvKategori, tvAlamat, tvKeterangan;
//        ImageView imgGambar;
//        CardView cvNote;
//    }
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        View row = convertView;
//        ViewHolder holder = new ViewHolder();
//
//        if(row==null){
//            LayoutInflater inflater = (LayoutInflater) mContext.get
//            row = inflater.inflate(layout,null);
//            holder.tvNamaWisata = row.findViewById(R.id.nama_wisata);
//            holder.tvKategori = row.findViewById(R.id.kategori);
//            holder.tvAlamat = row.findViewById(R.id.alamat);
//            holder.tvKeterangan = row.findViewById(R.id.keterangan);
//            holder.imgGambar = row.findViewById(R.id.gambar_wisata);
//            row.setTag(holder);
//        }else{
//            holder = (ViewHolder) row.getTag();
//        }
//
//        wisataBandung mWisataBandung = recordList.get(position);
//        holder.tvNamaWisata.setText(mWisataBandung.getNamaWisata());
//        holder.tvKategori.setText(mWisataBandung.getKategori());
//        holder.tvAlamat.setText(mWisataBandung.getAlamat());
//        holder.tvKeterangan.setText(mWisataBandung.getKeterangan());
//
//        byte[] recordImage = mWisataBandung.getImg();
//        Bitmap bitmap = BitmapFactory.decodeByteArray(recordImage,0,recordImage.length);
//        holder.imgGambar.setImageBitmap(bitmap);
//
//        return row;
//    }
//}
