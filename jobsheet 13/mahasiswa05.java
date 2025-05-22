public class mahasiswa05 {
    String nim, nama, kelas;
    double ipk;
    public mahasiswa05(){
    }
    public mahasiswa05(String nim, String nama, String kelas, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    
    public void tampil(){
        System.out.println("NIM : " + nim + ", Nama : " + nama + ", Kelas : " + kelas + ", IPK : " + ipk);
    }
 
}
