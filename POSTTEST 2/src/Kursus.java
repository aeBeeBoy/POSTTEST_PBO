package com.smartenglish.service;

import java.util.ArrayList;
import com.smartenglish.model.Siswa;

public class Kursus {

    private ArrayList<Siswa> daftarSiswa = new ArrayList<>();

    public void tambahSiswa(Siswa siswa) {

        daftarSiswa.add(siswa);
        System.out.println("Data siswa berhasil ditambahkan.");
    }

    public void tampilkanSiswa() {

        if (daftarSiswa.isEmpty()) {

            System.out.println("Data siswa masih kosong.");
            return;
        }

        System.out.println("\n===== DAFTAR SISWA =====");

        int no = 1;

        for (Siswa s : daftarSiswa) {

            System.out.println("\nSiswa ke-" + no);
            s.tampilkanData();
            no++;
        }
    }

    public void updateSiswa(String id, String namaBaru, int umurBaru, String levelBaru) {

        for (Siswa s : daftarSiswa) {

            if (s.getId().equalsIgnoreCase(id)) {

                s.setNama(namaBaru);
                s.setUmur(umurBaru);
                s.setLevel(levelBaru);

                System.out.println("Data siswa berhasil diupdate.");
                return;
            }
        }

        System.out.println("ID siswa tidak ditemukan.");
    }

    public void hapusSiswa(String id) {

        for (int i = 0; i < daftarSiswa.size(); i++) {

            if (daftarSiswa.get(i).getId().equalsIgnoreCase(id)) {

                daftarSiswa.remove(i);
                System.out.println("Data siswa berhasil dihapus.");
                return;
            }
        }

        System.out.println("ID siswa tidak ditemukan.");
    }

    public void jumlahSiswa() {

        System.out.println("Jumlah siswa saat ini : " + daftarSiswa.size());
    }
}