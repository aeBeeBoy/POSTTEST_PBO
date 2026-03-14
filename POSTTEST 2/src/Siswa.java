package com.smartenglish.model;

public class Siswa {

    private String id;
    private String nama;
    private int umur;
    protected String level;
    String alamat; // default

    public Siswa(String id, String nama, int umur, String level, String alamat) {

        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.level = level;
        this.alamat = alamat;
    }
    public String getId() {
        return id;
    }
    public String getNama() {
        return nama;
    }
    public int getUmur() {
        return umur;
    }
    public String getLevel() {
        return level;
    }
    public String getAlamat() {
        return alamat;
    }

    public void setId(String id) {

        if (id == null || id.isEmpty()) {

            System.out.println("ID tidak boleh kosong");
        } else {

            this.id = id;
        }
    }

    public void setNama(String nama) {

        if (nama == null || nama.isEmpty()) {

            System.out.println("Nama tidak boleh kosong");
        } else {

            this.nama = nama;
        }
    }

    public void setUmur(int umur) {

        if (umur <= 0) {

            System.out.println("Umur tidak valid");
        } else {

            this.umur = umur;
        }
    }

    public void setLevel(String level) {

        this.level = level;
    }

    public void setAlamat(String alamat) {

        this.alamat = alamat;
    }

    public void tampilkanData() {

        System.out.println("ID Siswa : " + id);
        System.out.println("Nama     : " + nama);
        System.out.println("Umur     : " + umur);
        System.out.println("Level    : " + level);
        System.out.println("Alamat   : " + alamat);
    }
}