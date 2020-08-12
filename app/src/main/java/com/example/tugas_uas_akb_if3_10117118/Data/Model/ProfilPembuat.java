package com.example.tugas_uas_akb_if3_10117118.Data.Model;

/** NIM : 10117118
 * Nama : Alfan Wahyudi
 * Kelas : IF-3
 * Tanggal : 12-08-2020**/

public class ProfilPembuat {
    private String nim;
    private String nama;
    private String kelas;
    private String deskripsi;

    public ProfilPembuat(String nim, String nama, String kelas, String deskripsi) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.deskripsi = deskripsi;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
