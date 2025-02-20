import java.util.*;

public class Array_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] mataKuliah = { "Pancasila", "KTI", "CTPS","Matematika Dasar",
                                "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman","K3" };

        int[] bobotSKS = { 2, 2, 3, 3, 2, 3, 3, 3 };
        double[] nilaiAngka = new double[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];
        double[] bobotNilai = new double[mataKuliah.length];

        double totalNilai = 0;
        int totalSKS = 0; 

        System.out.println("------------------------------");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("------------------------------");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print(" Masukkan nilai untuk mata kuliah " + mataKuliah[i] + ": ");
            nilaiAngka[i] = input.nextDouble();

            if (nilaiAngka[i] >= 85) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.0;
            } else if (nilaiAngka[i] >= 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.0;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.0;
            } else if (nilaiAngka[i] >= 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.0;  
            }
            
            totalNilai += bobotNilai[i] * bobotSKS[i];
            totalSKS += bobotSKS[i];
        }

        System.out.println("---------------------");
        System.out.println(" Hasil Konversi Nilai ");
        System.out.println("---------------------");
        System.out.printf("%-30s %-12s %-12s %-12s %-12s%n", "Nama Matkul", "Nilai Angka", "Nilai Huruf", "Bobot Nilai", "SKS");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-30s %-12.2f %-12s %-12.2f %-12d%n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i], bobotSKS[i]);
        }

        double ipSemester = totalNilai / totalSKS;
        System.out.println(" IP : "+ ipSemester);
    }
}
