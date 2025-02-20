public class dosenMain05 {
    public static void main(String[] args) {
        dosen05 dosen1 = new dosen05();
        dosen1.idDosen = "D005";
        dosen1.Nama = "Fatma Azzahra Alif Hidayah";
        dosen1.statusAktif = false;
        dosen1.tahunGabung = 2005;
        dosen1.bidangKeahlian = "back end";
        dosen1.tampikanInformasi();

        dosen1.setStatusAktif(true);
        dosen1.ubahKeahlian("pemograman java");
        System.out.println("masa kerja : " + dosen1.hitungMasaKerja(2025)+ " tahun");
        dosen1.tampikanInformasi();
        System.out.println("=====================================================================");

        dosen05 dosen2 = new dosen05("D001", "Ramadhani", true, 2015, "Kecerdasan Buatan");
        dosen2.tampikanInformasi();
        


        dosen2.setStatusAktif(false);
        dosen2.ubahKeahlian("Machine Learning");
        System.out.println("Masa Kerja: " + dosen2.hitungMasaKerja(2025) + " tahun");
        dosen2.tampikanInformasi();
        System.out.println("=====================================================================");
    }
}
