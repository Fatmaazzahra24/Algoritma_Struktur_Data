import java.util.*;
public class Dosen05 {

    Scanner input = new Scanner(System.in);
    public String kode, nama;
    public boolean jenkel;
    public int usia;

    public Dosen05(){

    }
    public Dosen05 (String kode, String nama, boolean jenkel, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenkel = jenkel;
        this.usia= usia;
    }

    void tambahData (){
        System.out.print("Masukkan Kode Dosen :");
        kode = input.nextLine();
        System.out.print("Masukkan Nama Dosen :");
        nama = input.nextLine();
        System.out.print("Masukkan Jenis Kelamin (Pria/Wanita) :");
        jenkel = input.next().equalsIgnoreCase("Pria") ? true : false;
        input.nextLine();
        System.out.print("Masukkan Usia Dosen :");
        usia = input.nextInt();
        System.out.println("----------------------------------------");

    }

    void tampilData(){
        System.out.println("Kode Dosen    : " + kode);
        System.out.println("Nama Dosen    : " + nama);
        System.out.println("Jenis Kelamin : " + (jenkel ? "Pria" : "Wanita"));
        System.out.println("Usia          : "+ usia);
        System.out.println("----------------------------------------");
    }
}