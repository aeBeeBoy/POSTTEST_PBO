public class SiswaReguler extends Siswa {

    private int jumlahPertemuan;
    private final int biayaPerPertemuan = 50000;

    public SiswaReguler(String id, String nama, int umur, String level, String alamat, int jumlahPertemuan) {
        super(id, nama, umur, level, alamat);
        this.jumlahPertemuan = jumlahPertemuan;
    }

    public int getJumlahPertemuan() {
        return jumlahPertemuan;
    }

    public void setJumlahPertemuan(int jumlahPertemuan) {
        this.jumlahPertemuan = jumlahPertemuan;
    }

    @Override
    public String getJenisSiswa() {
        return "Reguler";
    }

    @Override
    public double hitungBiaya() {
        return jumlahPertemuan * biayaPerPertemuan;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Pertemuan : " + jumlahPertemuan);
    }
}