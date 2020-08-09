package com.example.tugas_uas_akb_if3_10117118.Data.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class wisataBandung implements Parcelable {
    private byte[] img;
    private int id;
    private String namaWisata;
    private String kategori;
    private String alamat;
    private String keterangan;



    public wisataBandung(int id, String namaWisata, String kategori, String alamat, String keterangan, byte[] img) {
        this.img = img;
        this.id = id;
        this.namaWisata = namaWisata;
        this.kategori = kategori;
        this.alamat = alamat;
        this.keterangan = keterangan;
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

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.namaWisata);
        dest.writeString(this.kategori);
        dest.writeString(this.alamat);
        dest.writeByteArray(this.img);
    }

    public wisataBandung(){

    }
    public wisataBandung(Parcel in){
        this.id = in.readInt();
        this.namaWisata = in.readString();
        this.kategori = in.readString();
        this.alamat = in.readString();
        in.readByteArray(this.img);
    }
    public static final Parcelable.Creator<wisataBandung> CREATOR = new Parcelable.Creator<wisataBandung>(){

        @Override
        public wisataBandung createFromParcel(Parcel source) {
            return new wisataBandung(source);
        }

        @Override
        public wisataBandung[] newArray(int size) {
            return new wisataBandung[size];
        }
    };
}
