package com.example.tugas_uas_akb_if3_10117118.Data.Model;

import android.os.Parcel;
import android.os.Parcelable;


/** NIM : 10117118
 * Nama : Alfan Wahyudi
 * Kelas : IF-3
 * Tanggal : 12-08-2020**/


public class WisataBandung implements Parcelable{
    private int id;
    private String namaWisata;
    private String kategori;
    private String alamat;
    private String hariBuka;
    private String img;
    private String jamOperasional;
    private String keteranganSingkat;
    private String latitude;
    private String longitude;


    public WisataBandung(int id, String namaWisata, String kategori, String alamat, String hariBuka, String img, String jamOperasional, String keteranganSingkat, String latitude, String longitude) {
        this.id = id;
        this.namaWisata = namaWisata;
        this.kategori = kategori;
        this.alamat = alamat;
        this.hariBuka = hariBuka;
        this.img = img;
        this.jamOperasional = jamOperasional;
        this.keteranganSingkat = keteranganSingkat;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getKeteranganSingkat() {
        return keteranganSingkat;
    }

    public void setKeteranganSingkat(String keteranganSingkat) {
        this.keteranganSingkat = keteranganSingkat;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
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
        dest.writeString(this.img);
        dest.writeString(this.hariBuka);
        dest.writeString(this.jamOperasional);
        dest.writeString(this.keteranganSingkat);
        dest.writeString(this.latitude);
        dest.writeString(this.longitude);
    }

    public WisataBandung(){

    }
    public WisataBandung(Parcel in){
        this.id = in.readInt();
        this.namaWisata = in.readString();
        this.kategori = in.readString();
        this.alamat = in.readString();
        this.img = in.readString();
        this.hariBuka = in.readString();
        this.jamOperasional = in.readString();
        this.keteranganSingkat = in.readString();
        this.latitude = in.readString();
        this.longitude = in.readString();
    }
    public static final Parcelable.Creator<WisataBandung> CREATOR = new Parcelable.Creator<WisataBandung>(){

        @Override
        public WisataBandung createFromParcel(Parcel source) {
            return new WisataBandung(source);
        }

        @Override
        public WisataBandung[] newArray(int size) {
            return new WisataBandung[size];
        }
    };
}
