import java.util.*;
public class MahasiswaDemo05 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner (System.in);
        Mahasiswa05 [] arrayOfMahasiswa = new Mahasiswa05[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa05 ();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1) + " :" );
            System.out.print("NIM         : ");
            arrayOfMahasiswa[i].nim = input05.nextLine();
            System.out.print("Nama         : ");
            arrayOfMahasiswa[i].nama = input05.nextLine();
            System.out.print("Kelas         : ");
            arrayOfMahasiswa[i].kelas = input05.nextLine();
            System.out.print("IPK         : ");
            dummy =input05.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("======================================");
        }

        System.out.println("\n ================ DATA MAHASISWA =========== ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1) + " : ");
            arrayOfMahasiswa[i].cetakInfo();
        }

    }
}

