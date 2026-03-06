import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Kursus kursus = new Kursus();

        int pilihan;

        do {

            System.out.println("\n===== SISTEM MANAJEMEN DATA SISWA =====");
            System.out.println("Kursus Bahasa Inggris Smart English");
            System.out.println("1. Tambah Data Siswa");
            System.out.println("2. Tampilkan Data Siswa");
            System.out.println("3. Update Data Siswa");
            System.out.println("4. Hapus Data Siswa");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch(pilihan){

                case 1:

                    System.out.print("ID Siswa : ");
                    String id = input.nextLine();

                    System.out.print("Nama : ");
                    String nama = input.nextLine();

                    System.out.print("Umur : ");
                    int umur = input.nextInt();
                    input.nextLine();

                    System.out.print("Level (Beginner/Intermediate/Advanced) : ");
                    String level = input.nextLine();

                    Siswa siswa = new Siswa(id,nama,umur,level);

                    kursus.tambahSiswa(siswa);

                    break;

                case 2:

                    kursus.tampilkanSiswa();

                    break;

                case 3:

                    System.out.print("Masukkan ID siswa yang akan diupdate : ");
                    String idUpdate = input.nextLine();

                    System.out.print("Nama Baru : ");
                    String namaBaru = input.nextLine();

                    System.out.print("Umur Baru : ");
                    int umurBaru = input.nextInt();
                    input.nextLine();

                    System.out.print("Level Baru : ");
                    String levelBaru = input.nextLine();

                    kursus.updateSiswa(idUpdate,namaBaru,umurBaru,levelBaru);

                    break;

                case 4:

                    System.out.print("Masukkan ID siswa yang akan dihapus : ");
                    String idHapus = input.nextLine();

                    kursus.hapusSiswa(idHapus);

                    break;

                case 5:

                    System.out.println("Program selesai.");

                    break;

                default:
                    System.out.println("Pilihan tidak valid.");

            }

        } while(pilihan != 5);
    }
}