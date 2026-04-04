import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Kursus kursus = new Kursus();
        int pilihan;

        do {
            System.out.println("\n=================================");
            System.out.println(" SISTEM MANAJEMEN DATA SISWA ");
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

                    System.out.println("Jenis Siswa:");
                    System.out.println("1. Reguler");
                    System.out.println("2. Privat");
                    System.out.print("Pilih : ");
                    int jenis = input.nextInt();
                    input.nextLine();

                    Siswa siswaBaru;

                    if (jenis == 1) {
                        System.out.print("Jumlah pertemuan : ");
                        int jumlah = input.nextInt();
                        input.nextLine();

                        siswaBaru = new SiswaReguler(id, nama, umur, level, alamat, jumlah);

                    } else {
                        System.out.print("Nama tutor : ");
                        String tutor = input.nextLine();

                        siswaBaru = new SiswaPrivat(id, nama, umur, level, alamat, tutor);
                    }

                    kursus.tambahSiswa(siswaBaru);
                    break;

                case 2:
                    kursus.tampilkanSiswa();
                    break;

                case 3:
                    System.out.print("ID siswa : ");
                    String idUpdate = input.nextLine();

                    System.out.print("Nama baru : ");
                    String namaBaru = input.nextLine();

                    System.out.print("Umur baru : ");
                    int umurBaru = input.nextInt();
                    input.nextLine();

                    System.out.print("Level baru : ");
                    String levelBaru = input.nextLine();

                    System.out.print("Alamat baru : ");
                    String alamatBaru = input.nextLine();

                    kursus.updateSiswa(idUpdate, namaBaru, umurBaru, levelBaru, alamatBaru);
                    break;

                case 4:
                    System.out.print("ID siswa : ");
                    String idHapus = input.nextLine();
                    kursus.hapusSiswa(idHapus);
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan salah!");
            }

        } while (pilihan != 5);

        input.close();
    }
}