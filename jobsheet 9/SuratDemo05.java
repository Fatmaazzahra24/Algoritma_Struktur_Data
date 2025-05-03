import java.util.Scanner;

public class SuratDemo05 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackSurat05 stack = new StackSurat05(10);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat berdasarkan Nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt(); input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = input.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = input.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = input.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = input.next().charAt(0); input.nextLine();
                    System.out.print("Durasi Izin (hari): ");
                    int durasi = input.nextInt(); input.nextLine();
                    stack.push(new surat05(id, nama, kelas, jenis, durasi));
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    surat05 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("===== Surat Terakhir =====");
                        System.out.println("ID Surat     : " + terakhir.idSurat);
                        System.out.println("Nama         : " + terakhir.namaMahasiswa);
                        System.out.println("Kelas        : " + terakhir.kelas);
                        System.out.println("Jenis Izin   : " + (terakhir.jenisIzin == 'S' ? "Sakit" : "Izin"));
                        System.out.println("Durasi       : " + terakhir.durasi + " hari");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = input.nextLine();
                    stack.cariSurat(cari);
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }
}
