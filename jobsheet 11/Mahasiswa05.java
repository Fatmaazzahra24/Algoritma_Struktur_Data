public class Mahasiswa05 {
    String nim, nama, kelas;
    double ipk;
    public Mahasiswa05(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.printf("%-10s %-10s %-5s %-4.1f\n", nama, nim, kelas, ipk);
    }
    
}
