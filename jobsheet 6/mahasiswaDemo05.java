import java.util.Scanner;

public class mahasiswaDemo05 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = input05.nextInt();
        input05.nextLine(); 
        mahasiswaBerprestasi05 listMhs = new mahasiswaBerprestasi05(jml);

        for (int i = 0; i < jml; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM   : ");
            String nim = input05.nextLine();
            System.out.print("Nama  : ");
            String nama = input05.nextLine();
            System.out.print("Kelas : ");
            String kelas = input05.nextLine();
            System.out.print("IPK   : ");
            double ipk = input05.nextDouble();
            input05.nextLine(); 

            mahasiswa05 m = new mahasiswa05(nim, nama, kelas, ipk);
            listMhs.tambah(m);
        }

        System.out.println("\nData mahasiswa sebelum sorting:");
        listMhs.tampil();

        System.out.println("\nData mahasiswa setelah sorting berdasarkan IPK (DESC) :");
        listMhs.bubbleSort();
        listMhs.tampil();

        System.out.println("\nData yang sudah terurut menggunakan Selection Sort (ASC) :");
        listMhs.selectionSort();
        listMhs.tampil();

        System.out.println("\nData yang sudah terurut menggunakan Insertion Sort  ");
        listMhs.insertionSort();
        listMhs.tampil();
    }
}
