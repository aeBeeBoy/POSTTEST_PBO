import java.util.ArrayList;

public class Kursus {

    ArrayList<Siswa> daftarSiswa = new ArrayList<>();

    public void tambahSiswa(Siswa siswa){
        daftarSiswa.add(siswa);
        System.out.println("Data siswa berhasil ditambahkan.");
    }

    public void tampilkanSiswa(){

        if(daftarSiswa.isEmpty()){
            System.out.println("Data siswa masih kosong.");
        } else {

            for(Siswa s : daftarSiswa){
                s.tampilkanData();
            }
        }
    }

    public void updateSiswa(String id, String namaBaru, int umurBaru, String levelBaru){

        for(Siswa s : daftarSiswa){

            if(s.getId().equals(id)){
                s.setNama(namaBaru);
                s.setUmur(umurBaru);
                s.setLevel(levelBaru);

                System.out.println("Data berhasil diupdate.");
                return;
            }
        }

        System.out.println("ID siswa tidak ditemukan.");
    }

    public void hapusSiswa(String id){

        for(Siswa s : daftarSiswa){

            if(s.getId().equals(id)){
                daftarSiswa.remove(s);
                System.out.println("Data berhasil dihapus.");
                return;
            }
        }

        System.out.println("ID siswa tidak ditemukan.");
    }
}