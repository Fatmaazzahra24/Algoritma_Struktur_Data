public class DosenMain05 {
    public static void main(String[] args) {

        Dosen05 dosen1 = new Dosen05("123456", "Dr. fatma", 2010, "S3", "Sistem Informasi");
        Dosen05 dosen2 = new Dosen05("789012", "Prof. azzahra", 2015, "S2", "Teknik Informatika");


        System.out.println("\nInformasi Dosen 1:");
        dosen1.tampilkanInfo();

        System.out.println("\nInformasi Dosen 2:");
        dosen2.tampilkanInfo();


        dosen1.ubahProdi("Teknologi Informasi");
        dosen2.ubahPendidikan("S3");


        System.out.println("\nSetelah Perubahan:");
        dosen1.tampilkanInfo();
        dosen2.tampilkanInfo();
    }
}
