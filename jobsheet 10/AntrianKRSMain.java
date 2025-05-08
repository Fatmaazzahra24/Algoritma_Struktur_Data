import java.util.Scanner;

public class AntrianKRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);

        int pilihan;
        do {
            System.out.println("\n==== Menu Antrian KRS Mahasiswa ====");
            System.out.println("1. Tambahkan Mahasiswa ke Antrian");
            System.out.println("2. Proses 2 Mahasiswa (KRS)");
            System.out.println("3. Lihat 2 Antrian Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Lihat Mahasiswa di Paling Belakang");
            System.out.println("6. Jumlah Mahasiswa dalam Antrian");
            System.out.println("7. Jumlah Mahasiswa yang Sudah KRS");
            System.out.println("8. Jumlah Mahasiswa yang belum melalukan proses KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    if (antrian.isFull()) {
                        System.out.println("Antrian penuh. Tidak bisa menambahkan mahasiswa.");
                        break;
                    }
                    System.out.print("NIM     : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama    : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi   : ");
                    String prodi = sc.nextLine();
                    mahasiswaKRS mhs = new mahasiswaKRS(nim, nama, prodi);
                    antrian.tambahAntrianKRS(mhs);
                    break;
                case 2:
                    antrian.prosesKRS();
                    break;
                case 3:
                    antrian.lihatTerdepan2();
                    break;
                case 4:
                    antrian.tampilkanSemmuanya();
                    break;
                case 5:
                    antrian.lihatBelakang();
                    break;
                case 6:
                    antrian.jumlahAntrianBelumProses();
                    break;
                case 7:
                    antrian.jumlahSudahKRS();
                    break;
                case 8:
                    System.out.println("Jumlah mahasiswa yang belum melakukan proses KRS: " + antrian.getJumlahProses() + " orang.");
                    break;
                case 9:
                    antrian.clearAntrian();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
    
}


