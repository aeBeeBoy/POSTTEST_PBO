import java.util.ArrayList;

public class Kursus {

    private ArrayList<Siswa> daftarSiswa = new ArrayList<>();

    public void tambahSiswa(Siswa siswa) {
        daftarSiswa.add(siswa);
        System.out.println("Data berhasil ditambahkan.");
    }

    public void tampilkanSiswa() {
        if (daftarSiswa.isEmpty()) {
            System.out.println("Data kosong.");
            return;
        }

        int no = 1;
        for (Siswa s : daftarSiswa) {
            System.out.println("\nSiswa ke-" + no);
            s.tampilkanData();
            no++;
        }
    }

    public void updateSiswa(String id, String nama, int umur, String level, String alamat) {
        for (Siswa s : daftarSiswa) {
            if (s.getId().equals(id)) {
                s.setNama(nama);
                s.setUmur(umur);
                s.setLevel(level);
                s.setAlamat(alamat);
                System.out.println("Data diupdate.");
                return;
            }
        }
        System.out.println("ID tidak ditemukan.");
    }

    public void hapusSiswa(String id) {
        for (int i = 0; i < daftarSiswa.size(); i++) {
            if (daftarSiswa.get(i).getId().equals(id)) {
                daftarSiswa.remove(i);
                System.out.println("Data dihapus.");
                return;
            }
        }
        System.out.println("ID tidak ditemukan.");
    }
}