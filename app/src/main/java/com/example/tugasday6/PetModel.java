package com.example.tugasday6;

public class PetModel {
    public String jenis;
    public String umur;
    public String jenisKelamin;
    public String harga;
    public String deskripsi;
    public int gambar;

    public PetModel(String jenis, String umur, String jenisKelamin, String harga, String deskripsi, int gambar) {
        this.jenis = jenis;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.harga = harga;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
