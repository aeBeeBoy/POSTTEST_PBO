public class SiswaPrivat extends Siswa implements AktivitasBelajar {

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
    public void tampilkanDetailTambahan() {
        System.out.println("Tutor     : " + tutorPrivat);
        System.out.println("Aktivitas : " + infoTambahan());
    }

    @Override
    public void mulaiBelajar() {
        System.out.println("Siswa privat memulai belajar bersama tutor.");
    }

    @Override
    public String infoTambahan() {
        return "Belajar privat dengan tutor " + tutorPrivat;
    }
}