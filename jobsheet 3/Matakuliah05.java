import java.util.Scanner;

public class Matakuliah05 {
    
    public Scanner input05 = new Scanner (System.in);
    String kode, nama, dummy;
    int sks, jumlahJam;

    public Matakuliah05 (String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode ;
        this.nama= nama;
        this.sks= sks;
        this.jumlahJam= jumlahJam;
    }

    public Matakuliah05() {

    }

    public void tambahData (Matakuliah05[] arrayOfMatakuliah05) {
        for (int i = 0; i < arrayOfMatakuliah05.length; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i+1) + " : ");
            System.out.print("Kode          : ");
            String kode = input05.nextLine();
            System.out.print("Nama          : ");
            String nama = input05.nextLine();
            System.out.print("SKS           : ");
            int sks = Integer.parseInt(input05.nextLine());
            System.out.print("Jumlah jam    : ");
            int jumlahJam = Integer.parseInt(input05.nextLine());
            System.out.println("---------------------------------");
    
            // Simpan data ke dalam array
            arrayOfMatakuliah05[i] = new Matakuliah05(kode, nama, sks, jumlahJam);
        }
    }
    public void cetakInfo() {
        System.out.println("Kode Matakuliah: " + this.kode);
        System.out.println("Nama Matakuliah: " + this.nama);
        System.out.println("SKS            : " + this.sks);
        System.out.println("Jumlah Jam     : " + this.jumlahJam);
        System.out.println("--------------------------------------------");
    }
}

