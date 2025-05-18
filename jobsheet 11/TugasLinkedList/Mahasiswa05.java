public class Mahasiswa05 {
    String nim, nama, kelas;

    public Mahasiswa05(String nim, String nama, String kelas, double d) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;

    }

    public void tampilInformasi() {
        System.out.printf("%-10s %-10s %-5s\n", nama, nim, kelas);
    }
    
}
