public class dosen05 {

    String idDosen ;
    String Nama ;
    Boolean statusAktif ;
    int tahunGabung;
    String bidangKeahlian;

    public dosen05 () {
        
    }
    void tampikanInformasi () {
        System.out.println("Id Dosen        :" +idDosen);
        System.out.println("Nama            :" + Nama);
        if (statusAktif == true) {
            System.out.println("Status Aktif    : Aktif");
        } else {
            System.out.println("Status Aktif    : Tidak Aktif");
        }
        System.out.println("tahun bergabung : " +tahunGabung);
        System.out.println("bidang keahlian :" + bidangKeahlian);
        System.out.println("---------------------------------");
    }
    void setStatusAktif (Boolean status) {
        this.statusAktif = status; 
        if (status == true) {
            System.out.println("status aktif diubah menjadi : aktif");
        } else {
            System.out.println("status aktif telah diubah menjadi : tidak aktif");
        }
    }
    int  hitungMasaKerja (int tahunSekarang  ) {
        return tahunSekarang - tahunGabung;
    }
    public void ubahKeahlian (String Bidang) {
        this.bidangKeahlian = Bidang;
        System.out.println("bidang keahlian telah diubah menjadi : " + bidangKeahlian);
        
    } 
    public  dosen05 (String idDosen, String Nama, boolean  statusAktif,int tahunGabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.Nama = Nama;
        this.statusAktif =statusAktif;
        this.tahunGabung = tahunGabung;
        this.bidangKeahlian=bidangKeahlian;
    }
}
