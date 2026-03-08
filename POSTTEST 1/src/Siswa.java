public class Siswa {

    private String id;
    private String nama;
    private int umur;
    private String level;

    public Siswa(String id, String nama, int umur, String level) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.level = level;
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

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void tampilkanData() {
        System.out.println("ID Siswa  : " + id);
        System.out.println("Nama      : " + nama);
        System.out.println("Umur      : " + umur);
        System.out.println("Level     : " + level);
        System.out.println("-----------------------");
    }
}