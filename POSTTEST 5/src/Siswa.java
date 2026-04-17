public abstract class Siswa {

    private String id;
    private String nama;
    private int umur;
    private String level;
    private String alamat;

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

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Abstract method
    public abstract String getJenisSiswa();
    public abstract double hitungBiaya();
    public abstract void tampilkanDetailTambahan();

    // Method biasa dalam abstract class
    public void tampilkanData() {
        System.out.println("ID      : " + id);
        System.out.println("Nama    : " + nama);
        System.out.println("Umur    : " + umur);
        System.out.println("Level   : " + level);
        System.out.println("Alamat  : " + alamat);
        System.out.println("Jenis   : " + getJenisSiswa());
        System.out.println("Biaya   : Rp" + hitungBiaya());
        tampilkanDetailTambahan();
    }
}