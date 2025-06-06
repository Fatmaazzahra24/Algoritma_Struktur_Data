import java.util.Scanner;
public class SPBU_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        kendaraan tambahantrian = new kendaraan("N 9999 AA", "Motor", "Honda");
        kendaraan k2 = new kendaraan("AG 1234 XY", "Mobil", "Toyota");

        // Membuat node untuk masing-masing kendaraan
        nodeKendaraan node1 = new nodeKendaraan(tambahantrian);
        nodeKendaraan node2 = new nodeKendaraan(k2);

        // Sambungkan node pertama ke node kedua
        node1.next = node2;
        AntrianLinkedList antrianKendaraan = new AntrianLinkedList(); 
        queueTransaksi antrianTransaksi = new queueTransaksi(10);
        
        int pilihan;

        do { 
            System.out.println("\n========= Menu SPBU ==========");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Plat Nomor Kendaraan: ");
                    String platNomor = sc.nextLine();
                    System.out.print("Masukkan Tipe Kendaraan: ");
                    String tipe = sc.nextLine();
                    System.out.print("Masukkan Merk Kendaraan: ");
                    String merk = sc.nextLine();
                    kendaraan tambahAntrian = new kendaraan(platNomor, tipe, merk);
                    antrianKendaraan.tambahAntrian(tambahAntrian); 
                    break;
                case 2:
                    System.out.println(" ======= Antrian Kendaraan =======");
                    antrianKendaraan.tampilkanAntrian();
                    break; 
                case 3:
                    System.out.println("jumlah kendaraan dalam antrian: " + antrianKendaraan.jumlahAntrian());
                    break;
                case 4: 
                    kendaraan dilayani = antrianKendaraan.layaniAntrian(); // Memanggil method layaniAntrian() dari objek antrianKendar
                    if (dilayani != null) { // Jika ada kendaraan yang dilayani
                        System.out.println("Petugas Melayani " + dilayani.platNomor); // Menampilkan plat nomor kendaraan yang sedang dilayani
                        BBM bbm = new BBM(); // Membuat objek BBM untuk mengisi bahan bakar
                        TransaksiPengisian transaksi = new TransaksiPengisian(dilayani, bbm, bbm.jumlahLiter); // Membuat objek TransaksiPengisian dengan kendaraan yang dilayani, objek BBM, dan jumlah liter yang diisi
                        antrianTransaksi.enqueue(transaksi); // Menambahkan transaksi ke antrian transaksi
                        System.out.println(">> Transaksi berhasil dicatat:");  
                        transaksi.tampilkan();
                    }
                    break;
                    
                case 5:
                    System.out.println("======== Riwayat Transaksi ========");
                    antrianTransaksi.tampilkanTransaksi();
                    break;
                default:
                System.out.println("Pilihan tidak valid, silakan coba lagi.");

            }
            
        } while (pilihan != 0);
    }   
}