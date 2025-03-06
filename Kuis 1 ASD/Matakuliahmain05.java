import java.util.*;

public class Matakuliahmain05 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);


        Dosen05 dosen1 = new Dosen05("123456", "Dr. Fatma", 2010, "S3", "Sistem Informasi");
        Dosen05 dosen2 = new Dosen05("789012", "Prof. Azzahra", 2015, "S2", "Teknik Informatika");
        Dosen05 dosen3 = new Dosen05("345678", "Dr.Eng. Alif Hidayah", 2020, "S3", "tenologi jaringan");  


        Dosen05 tambahdosen = new Dosen05("800981", "Sahrul. S.T ", 2025, "S3", "Teknologi Informasi");
        


        Dosen05[] pengampu1 = { dosen1, dosen2, dosen3 };


        Matakuliah05 mk1 = new Matakuliah05("SIB123", "Dasar Pemograman", 3, pengampu1);
        Matakuliah05 mk2 = new Matakuliah05("SIB456", "Basis Data", 4, pengampu1);
        Matakuliah05 mk3 = new Matakuliah05("SIB1007", "Komputer jaringan", 2, pengampu1);

        System.out.println("\n=== Data Mata Kuliah Sebelum Perubahan ===");
        mk1.tampilkanInfo();
        mk2.tampilkanInfo();


        mk1.ubahNamaMK("Matematika Lanjut");
        mk2.ubahSKS(3);
        mk3.ubahNamaMK("Sistem Operasi Jaringan");



        System.out.println("\n=== Data Mata Kuliah Setelah Perubahan ===");
        mk1.tampilkanInfo();
        mk2.tampilkanInfo();    
        // ini untuk method baru yang tambah dosen
        System.out.println("\nInformasi tambah dosen 4:");
        tambahdosen.tampilkanInfo();

        input05.close();
    }
}
