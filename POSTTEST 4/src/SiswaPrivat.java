public class SiswaPrivat extends Siswa {

    private String tutorPrivat;
    private final int biayaPrivat = 300000;

    public SiswaPrivat(String id, String nama, int umur, String level, String alamat, String tutorPrivat) {
        super(id, nama, umur, level, alamat);
        this.tutorPrivat = tutorPrivat;
    }

    public String getTutorPrivat() {
        return tutorPrivat;
    }

    public void setTutorPrivat(String tutorPrivat) {
        this.tutorPrivat = tutorPrivat;
    }

    @Override
    public String getJenisSiswa() {
        return "Privat";
    }

    @Override
    public double hitungBiaya() {
        return biayaPrivat;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Tutor     : " + tutorPrivat);
    }
}