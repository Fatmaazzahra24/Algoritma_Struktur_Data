public class Dosen05 {

    public String nidn;
    public String nama;
    public int tahunMasuk ;
    public String jenjangPendidikan ;
    public String prodi;

    public Dosen05(String nidn, String nama, int tahunMasuk, String jenjangPendidikan, String prodi) {
        this.nidn = nidn;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.jenjangPendidikan = jenjangPendidikan;
        this.prodi = prodi;
    } 

    public Dosen05 () {

    }

    void tampilkanInfo(){
        System.out.println("NID                     : " + nidn);
        System.out.println("Nama Dosen              : " + nama);
        System.out.println("Tahun Masuk             : " + tahunMasuk);  
        System.out.println("Jenjang Pendidikan      : "+ jenjangPendidikan);
        System.out.println("Program Pendidikan      : "+ prodi);
        System.out.println("----------------------------------------");
    } 

    public void ubahProdi(String prodiBaru) {
        this.prodi = prodiBaru;
        System.out.println("Program Studi telah diperbarui menjadi: " + prodi);
    } 

    public void ubahPendidikan(String jenjangBaru) {
        this.jenjangPendidikan = jenjangBaru;
        System.out.println("Jenjang pendidikan telah diperbarui menjadi: " + jenjangPendidikan);
    }
}