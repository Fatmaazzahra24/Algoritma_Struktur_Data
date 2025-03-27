import java.util.Scanner;

public class mahasiswaDemo05 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        System.out.print("Masukkan jumlah data mahasiswa: ");
        int jumlMhs = input05.nextInt();
        input05.nextLine();  

        mahasiswaBerprestasi05 listMhs = new mahasiswaBerprestasi05(jumlMhs); 

        for (int i = 0; i < jumlMhs; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM   : ");
            String nim = input05.nextLine();
            System.out.print("Nama  : ");
            String nama = input05.nextLine();
            System.out.print("Kelas : ");
            String kelas = input05.nextLine();
            System.out.print("IPK   : ");
            double ip = input05.nextDouble();
            input05.nextLine(); 
            System.out.println("---------------------------------");
            listMhs.tambah(new mahasiswa05(nim, nama, kelas, ip));
        }

        listMhs.tampil();
        System.out.println("---------------------------------");
        System.out.println("Pencarian Data dengan Sequential Search");
        System.out.print("Masukkan IPK yang dicari: ");
        double cari = input05.nextDouble();

        int posisi = listMhs.sequentialSearch(cari);
        listMhs.tampilPosisi(cari, posisi);
        listMhs.tampilDataSearch(cari, posisi);

        System.out.println("---------------------------------");
        System.out.println("Pencarian Data dengan Binary Search");
        System.out.print("Masukkan IPK yang dicari: ");
        double cari2 = input05.nextDouble();

        int posisi2 = listMhs.findBinarySearch(cari2, 0, jumlMhs - 1);
        listMhs.tampilPosisi(cari2, posisi2);
        listMhs.tampilDataSearch(cari2, posisi2);

        input05.close();
    }
}
