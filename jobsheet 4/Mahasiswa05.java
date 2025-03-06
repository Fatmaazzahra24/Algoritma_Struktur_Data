public class Mahasiswa05 {

    public String nim;
    public String nama;
    public String programStudi;
    public float ipk; 

    public Mahasiswa05(String nim, String nama, String programStudi, float ipk) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
        this.ipk = ipk;
    }

    public void tampilkanInfo05( ) {
        System.out.println("NIM    = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Program Studi  = " + programStudi);
        System.out.println("ipk = " + ipk);
    }

    public Mahasiswa05 () {
        
    }
}