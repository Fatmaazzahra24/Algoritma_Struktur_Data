public class MahasiswaMain05 {
    public static void main(String[] args) {
        
        Mahasiswa05 mhs1 = new Mahasiswa05 ();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.NIM = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.5;

        mhs1.tampikanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampikanInformasi();

        Mahasiswa05 mhs2 = new Mahasiswa05("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIPK(3.30);
        mhs2.tampikanInformasi();
        
    }
}
