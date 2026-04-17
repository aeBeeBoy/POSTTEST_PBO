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
                System.out.println("Data umum siswa berhasil diupdate.");
                return;
            }
        }
        System.out.println("ID tidak ditemukan.");
    }

    public void updateSiswa(String id, String nama, int umur, String level, String alamat, int jumlahPertemuan) {
        for (Siswa s : daftarSiswa) {
            if (s.getId().equals(id) && s instanceof SiswaReguler) {
                s.setNama(nama);
                s.setUmur(umur);
                s.setLevel(level);
                s.setAlamat(alamat);
                ((SiswaReguler) s).setJumlahPertemuan(jumlahPertemuan);
                System.out.println("Data siswa reguler berhasil diupdate.");
                return;
            }
        }
        System.out.println("ID siswa reguler tidak ditemukan.");
    }

    public void updateSiswa(String id, String nama, int umur, String level, String alamat, String tutorPrivat) {
        for (Siswa s : daftarSiswa) {
            if (s.getId().equals(id) && s instanceof SiswaPrivat) {
                s.setNama(nama);
                s.setUmur(umur);
                s.setLevel(level);
                s.setAlamat(alamat);
                ((SiswaPrivat) s).setTutorPrivat(tutorPrivat);
                System.out.println("Data siswa privat berhasil diupdate.");
                return;
            }
        }
        System.out.println("ID siswa privat tidak ditemukan.");
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