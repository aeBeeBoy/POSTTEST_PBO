public class SiswaPrivat extends Siswa {

    private String tutorPrivat;

    public SiswaPrivat(String id, String nama, int umur, String level, String alamat, String tutorPrivat) {
        super(id, nama, umur, level, alamat);
        this.tutorPrivat = tutorPrivat;
    }

    @Override
    public String getJenisSiswa() {
        return "Privat";
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Tutor : " + tutorPrivat);
    }
}