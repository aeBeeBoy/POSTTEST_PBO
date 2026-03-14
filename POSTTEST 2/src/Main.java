package com.smartenglish.main;

import java.util.Scanner;
import com.smartenglish.model.Siswa;
import com.smartenglish.service.Kursus;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Kursus kursus = new Kursus();
        int pilihan;

        do {

            System.out.println("\n=================================");
            System.out.println(" SISTEM MANAJEMEN DATA SISWA ");
            System.out.println(" Kursus Bahasa Inggris Smart English ");
            System.out.println("=================================");
            System.out.println("1. Tambah Data Siswa");
            System.out.println("2. Tampilkan Data Siswa");
            System.out.println("3. Update Data Siswa");
            System.out.println("4. Hapus Data Siswa");
            System.out.println("5. Exit");
            System.out.print("Pilih menu : ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:

                    System.out.println("\n=== Tambah Data Siswa ===");

                    System.out.print("ID Siswa : ");
                    String id = input.nextLine();

                    System.out.print("Nama : ");
                    String nama = input.nextLine();

                    System.out.print("Umur : ");
                    int umur = input.nextInt();
                    input.nextLine();

                    System.out.print("Level : ");
                    String level = input.nextLine();

                    System.out.print("Alamat : ");
                    String alamat = input.nextLine();

                    Siswa siswaBaru = new Siswa(id, nama, umur, level, alamat);

                    kursus.tambahSiswa(siswaBaru);

                    break;

                case 2:

                    kursus.tampilkanSiswa();
                    break;

                case 3:

                    System.out.println("\n=== Update Data Siswa ===");

                    System.out.print("Masukkan ID siswa : ");
                    String idUpdate = input.nextLine();

                    System.out.print("Nama Baru : ");
                    String namaBaru = input.nextLine();

                    System.out.print("Umur Baru : ");
                    int umurBaru = input.nextInt();
                    input.nextLine();

                    System.out.print("Level Baru : ");
                    String levelBaru = input.nextLine();

                    kursus.updateSiswa(idUpdate, namaBaru, umurBaru, levelBaru);

                    break;

                case 4:

                    System.out.println("\n=== Hapus Data Siswa ===");

                    System.out.print("Masukkan ID siswa : ");
                    String idHapus = input.nextLine();

                    kursus.hapusSiswa(idHapus);

                    break;

                case 5:

                    System.out.println("\nProgram selesai.");

                    break;

                default:
                    System.out.println("Pilihan tidak valid!");

            }

        } while (pilihan != 5);

        input.close();
    }
}