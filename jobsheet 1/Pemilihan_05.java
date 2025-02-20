import java.util.*;
public class Pemilihan_05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("PROGRAM MENGHITUNG NILAI AKHIR ");
        System.out.println("===============================");

        System.out.print("masukkan nilai tugas :");
        int nilai_tugas = input.nextInt();
        System.out.print("masukkan nilai kuis : ");
        int nilai_kuis = input.nextInt();
        System.out.print("masukkan nilai UTS : ");
        int nilai_UTS = input.nextInt();
        System.out.print("masukkan nilai UAS : ");
        int nilai_UAS = input.nextInt();
        
        String kualifikasi, nilai_huruf; 

        if (nilai_tugas >= 0 && nilai_tugas <= 100 && nilai_kuis >= 0 && nilai_kuis <= 100 && nilai_UTS >= 0 && nilai_UTS <= 100 && nilai_UAS >= 0 && nilai_UAS <= 100 ) {
           double nilai_akhir = (nilai_tugas * 0.20 ) + (nilai_kuis * 0.20) + ( nilai_UTS * 0.30) + ( nilai_UAS * 0.30);
           System.out.println("nilai akhir maahasiswa : " + nilai_akhir);

            if (nilai_akhir >= 85) {
                nilai_huruf = "A";
                kualifikasi = "Sangat Baik";
            } else if (nilai_akhir >= 73) {
                nilai_huruf = "B+";
                kualifikasi = "Lebih dari Baik";
            } else if (nilai_akhir >= 65) {
                nilai_huruf = "B";
                kualifikasi = "Baik ";
            } else if (nilai_akhir >= 60) {
                nilai_huruf = "C+";
                kualifikasi = "Lebih dari Cukup ";
            } else if (nilai_akhir >= 50){
                nilai_huruf = "C";
                kualifikasi = "Cukup";
            } else if (nilai_akhir >= 39){
                nilai_huruf = "D";
                kualifikasi = "Kurang";
            } else {
                nilai_huruf = "E";
                kualifikasi = "Gagal";  
            }

            System.out.println("niali huruf : " + nilai_huruf);
            System.out.println("kualifikasi : " + kualifikasi);

            if (nilai_akhir <= 39 ) {
                System.out.println("ANDA TIDAK LULUS");
            } else {
                System.out.println("SELAMAT ANDA LULUS!");
            }

        } else {
            System.out.println("nilai tidak valid! nilai harus diantara 0-100");
        }
    }
}