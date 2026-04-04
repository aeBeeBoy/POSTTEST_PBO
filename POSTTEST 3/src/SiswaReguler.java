public class SiswaReguler extends Siswa {

    private int jumlahPertemuan;

    public SiswaReguler(String id, String nama, int umur, String level, String alamat, int jumlahPertemuan) {
        super(id, nama, umur, level, alamat);
        this.jumlahPertemuan = jumlahPertemuan;
    }

    @Override
    public String getJenisSiswa() {
        return "Reguler";
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Pertemuan : " + jumlahPertemuan);
    }
}