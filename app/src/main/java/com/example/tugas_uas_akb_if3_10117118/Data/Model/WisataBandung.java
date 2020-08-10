package com.example.tugas_uas_akb_if3_10117118.Data.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class WisataBandung {
    private byte[] img;
    private int id;
    private String namaWisata;
    private String kategori;
    private String alamat;
    private String hariBuka;
    private String jamOperasional;

    public WisataBandung( int id, String namaWisata, String kategori, String alamat, String hariBuka, byte[] img, String jamOperasional) {
        this.img = img;
        this.id = id;
        this.namaWisata = namaWisata;
        this.kategori = kategori;
        this.alamat = alamat;
        this.hariBuka = hariBuka;
        this.jamOperasional = jamOperasional;
    }

    public String getHariBuka() {
        return hariBuka;
    }

    public void setHariBuka(String hariBuka) {
        this.hariBuka = hariBuka;
    }

    public String getJamOperasional() {
        return jamOperasional;
    }

    public void setJamOperasional(String jamOperasional) {
        this.jamOperasional = jamOperasional;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaWisata() {
        return namaWisata;
    }

    public void setNamaWisata(String namaWisata) {
        this.namaWisata = namaWisata;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeInt(this.id);
//        dest.writeString(this.namaWisata);
//        dest.writeString(this.kategori);
//        dest.writeString(this.alamat);
//        dest.writeByteArray(this.img);
//    }
//
//    public WisataBandung(){
//
//    }
//    public WisataBandung(Parcel in){
//        this.id = in.readInt();
//        this.namaWisata = in.readString();
//        this.kategori = in.readString();
//        this.alamat = in.readString();
//        in.readByteArray(this.img);
//    }
//    public static final Parcelable.Creator<WisataBandung> CREATOR = new Parcelable.Creator<WisataBandung>(){
//
//        @Override
//        public WisataBandung createFromParcel(Parcel source) {
//            return new WisataBandung(source);
//        }
//
//        @Override
//        public WisataBandung[] newArray(int size) {
//            return new WisataBandung[size];
//        }
//    };
}
