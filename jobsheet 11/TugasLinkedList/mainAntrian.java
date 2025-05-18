import java.util.Scanner;

public class mainAntrian {
    public static void main(String[] args) {
        QueueDinamis antrian = new QueueDinamis();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== MENU ANTRIAN LAYANAN =====");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil Mahasiswa");
            System.out.println("3. Tampilkan Mahasiswa Terdepan");
            System.out.println("4. Tampilkan Mahasiswa Terakhir");
            System.out.println("5. Tampilkan Jumlah Antrian  Mahasiswa");
            System.out.println("6. Tampilkan Antrian Mahasiswa");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                System.out.print("NIM : ");
                String nim = sc.nextLine();
                System.out.print("Nama : ");
                String nama = sc.nextLine();
                System.out.print("Kelas : ");
                String kelas = sc.nextLine();
                Mahasiswa05 mhs = new Mahasiswa05(nim, nama, kelas);
                antrian.enqueue(mhs);
                break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.tampilTerdepan();
                    break;
                case 4:
                    antrian.tampilTerakhir();
                    break;
                case 5:
                    antrian.tampilJumlah();
                    break;
                case 6:
                    antrian.tampilSemua();
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 8:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 7);
    }
}
