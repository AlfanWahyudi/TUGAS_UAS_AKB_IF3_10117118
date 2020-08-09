package com.example.tugas_uas_akb_if3_10117118.Presenter;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugas_uas_akb_if3_10117118.Data.Model.wisataBandung;

import com.example.tugas_uas_akb_if3_10117118.R;


import java.util.ArrayList;

/** NIM : 10117118
 * Nama : Alfan Wahyudi
 * Kelas : IF-3
 * Tanggal : 12-05-2020**/

public class AdapterWisataBandung extends RecyclerView.Adapter<AdapterWisataBandung.WisataViewHolder> {
    private ArrayList<wisataBandung> listWisataBandung = new ArrayList<>();
    private Activity activity;

    public AdapterWisataBandung(Activity activity){
        this.activity = activity;
    }

    public ArrayList<wisataBandung> getListNotes(){
        return listWisataBandung;
    }

    public void setListNotes(ArrayList<wisataBandung> listNotes){
        if (listNotes.size() > 0 ){
            this.listWisataBandung.clear();
        }
        this.listWisataBandung.addAll(listNotes);

        notifyDataSetChanged();
    }

    public void addItem(wisataBandung note){
        this.listWisataBandung.add(note);
        notifyItemInserted(listWisataBandung.size() -1);
    }

    public void updateItem(int position, wisataBandung note){
        this.listWisataBandung.set(position, note);
        notifyItemChanged(position, note);
    }

    public void removeItem(int position){
        this.listWisataBandung.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, listWisataBandung.size());
    }

    @NonNull
    @Override
    public AdapterWisataBandung.WisataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_note, parent, false);
        return new WisataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterWisataBandung.WisataViewHolder holder, int position) {
        holder.tvNamaWisata.setText(listWisataBandung.get(position).getNamaWisata());
        holder.tvKategori.setText(listWisataBandung.get(position).getKategori());
        holder.tvAlamat.setText(listWisataBandung.get(position).getAlamat());
        holder.tvKeterangan.setText(listWisataBandung.get(position).getKeterangan());
        holder.imgGambar.setImageBitmap(BitmapFactory.decodeByteArray(listWisataBandung.get(position).getImg(), 0, listWisataBandung.get(position).getImg().length));
//        holder.cvNote.setOnClickListener(new CustomClickListener(position, new CustomClickListener.OnItemClickCallback() {
//            @Override
//            public void onItemClicked(View view, int position) {
//                Intent intent = new Intent(activity, TemanUpdate.class);
//                intent.putExtra(TemanUpdate.EXTRA_POSITION, position);
//                intent.putExtra(TemanUpdate.EXTRA_NOTE, listWisataBandung.get(position));
//                activity.startActivityForResult(intent, TemanUpdate.REQUEST_UPDATE);
//            }
//        }));
    }

    @Override
    public int getItemCount() {
        return listWisataBandung.size();
    }

    public class WisataViewHolder extends RecyclerView.ViewHolder{
        //final TextView tvNamaWisata, tvKategori;
        final TextView tvNamaWisata, tvKategori, tvAlamat, tvKeterangan;
        final ImageView imgGambar;
        final CardView cvNote;

        public WisataViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNamaWisata = itemView.findViewById(R.id.nama_wisata);
            tvKategori = itemView.findViewById(R.id.kategori);
            tvAlamat = itemView.findViewById(R.id.alamat);
            tvKeterangan = itemView.findViewById(R.id.keterangan);
            imgGambar = itemView.findViewById(R.id.gambar_wisata);
            cvNote = itemView.findViewById(R.id.cv_item_note);
        }
    }
}
