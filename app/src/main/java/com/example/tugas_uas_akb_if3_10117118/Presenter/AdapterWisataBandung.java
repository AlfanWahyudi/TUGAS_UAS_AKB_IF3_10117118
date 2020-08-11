package com.example.tugas_uas_akb_if3_10117118.Presenter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.tugas_uas_akb_if3_10117118.Data.Model.WisataBandung;
import com.example.tugas_uas_akb_if3_10117118.R;

import java.util.ArrayList;
import java.util.List;

/** NIM : 10117118
 * Nama : Alfan Wahyudi
 * Kelas : IF-3
 * Tanggal : 12-05-2020**/

public class AdapterWisataBandung extends RecyclerView.Adapter<AdapterWisataBandung.WisataViewHolder> {
    private ArrayList<WisataBandung> mListWisataBandung = new ArrayList<>();
    private Activity activity;
    private Context mContext;


    public AdapterWisataBandung(Activity activity){
        this.activity = activity;
    }

    public ArrayList<WisataBandung> getListNotes(){
        return mListWisataBandung;
    }


    public void setListNotes(List<WisataBandung> listNote){
        if (listNote.size() > 0 ){
            this.mListWisataBandung.clear();
        }
            this.mListWisataBandung.addAll(listNote);
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public AdapterWisataBandung.WisataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_note, parent, false);
        return new WisataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterWisataBandung.WisataViewHolder holder, final int position) {
        holder.tvNamaWisata.setText(mListWisataBandung.get(position).getNamaWisata());
        holder.tvKategori.setText(mListWisataBandung.get(position).getKategori());
        holder.tvAlamat.setText(mListWisataBandung.get(position).getAlamat());
        holder.tvHariBuka.setText(mListWisataBandung.get(position).getHariBuka());
        holder.tvJamOperasional.setText(mListWisataBandung.get(position).getJamOperasional());

        Glide.with(activity)
                .asBitmap()
                .load(mListWisataBandung.get(position).getImg())
                .into(holder.imgGambar);
       // holder.imgGambar.setImageBitmap(BitmapFactory.decodeByteArray(mListWisataBandung.get(position).getImg(), 0, mListWisataBandung.get(position).getImg().length));
//        holder.cvNote.setOnClickListener(new CustomClickListener(position, new CustomClickListener.OnItemClickCallback() {
//            @Override
//            public void onItemClicked(View view, int position) {
//                Intent intent = new Intent(activity, DetailWisata.class);
//                intent.putExtra(DetailWisata.EXTRA_POSITION, position);
//                intent.putExtra("list_wisata", (Serializable) mListWisataBandung.get(position));
//                activity.startActivity(intent);
//            }
//        }));
    }

    @Override
    public int getItemCount() {
        return mListWisataBandung.size();
    }

    public class WisataViewHolder extends RecyclerView.ViewHolder {
        //final TextView tvNamaWisata, tvKategori;
        final TextView tvNamaWisata, tvKategori, tvAlamat, tvHariBuka, tvJamOperasional;
        final ImageView imgGambar;
        final CardView cvNote;


        public WisataViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNamaWisata = itemView.findViewById(R.id.nama_wisata);
            tvKategori = itemView.findViewById(R.id.kategori);
            tvAlamat = itemView.findViewById(R.id.alamat);
            tvHariBuka = itemView.findViewById(R.id.hari_buka);
            tvJamOperasional = itemView.findViewById(R.id.jam_operasional);
            imgGambar = itemView.findViewById(R.id.gambar_wisata);
            cvNote = itemView.findViewById(R.id.cv_item_note);


        }

    }
}
