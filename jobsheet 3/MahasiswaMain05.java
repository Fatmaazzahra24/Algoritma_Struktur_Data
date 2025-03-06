import  java.util.Scanner;
public class MahasiswaMain05 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        int jmlMhs ;
        System.out.print("Masukkan jumlah mahasiswa   : ");
        jmlMhs = input05.nextInt();
        input05.nextLine();
        
        Mahasiswa05 [] arrayMhs = new Mahasiswa05[jmlMhs] ; 
        System.out.println("Masukkan Data Mahasiswa ");
        for (int i = 0 ; i < jmlMhs; i++) {
            System.out.println("mahasiswa ke - " + (i + 1)) ;
            System.out.print(" masukkan  NIM : ");
            String nim = input05.nextLine();
            System.out.print(" masukkan nama : ");
            String nama = input05.nextLine();
            System.out.print("masukkan program studi : ");
            String programStudi  = input05.nextLine();
            System.out.print("masukkan ipk :");
            float ipk = input05.nextFloat();
            input05.nextLine();

            arrayMhs[i] = new Mahasiswa05(nim, nama, programStudi, ipk);
        }


        System.out.println("\n ================= Data Mahasiswa ==============");
        for (Mahasiswa05 mhs : arrayMhs) {
            mhs.cetakData05();
            System.out.println();
        }


        DataMahasiswa05.dataSemuaMahasiswa(arrayMhs);
        DataMahasiswa05.jummlahMahasiswaPerProdi(arrayMhs);
        System.out.print("\nMasukkan Program Studi yang ingin dicari (SIB/TI/MI): ");
        String cariProdi = input05.nextLine();
        DataMahasiswa05.cariMahasiswaByProdi(arrayMhs, cariProdi);
        DataMahasiswa05.ipkTertinggiPerProdi(arrayMhs);

    }    

}
