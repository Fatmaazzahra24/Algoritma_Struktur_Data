import java.util.Scanner;
public class MahasiswaDemo05 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilih;
        StackTugasMahasiswa05 stack = new StackTugasMahasiswa05(5);


        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Pertama");
            System.out.println("6. Lihat Jumlah Tugas Terkumpul");
            System.out.print("Pilih menu: ");
            pilih = scan.nextInt();
            scan.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa05 mhs = new Mahasiswa05(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan.\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa05 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.print("Masukkan nilai untuk " + dinilai.nama + ": ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Tugas %s telah dinilai dengan nilai %d.\n", dinilai.nama, dinilai.nilai);
                        String biner = stack.konversDesimalkeBiner(dinilai.nilai);
                        System.out.println("Nilai dalam biner: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa05 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas\tNilai");
                    System.out.println("===================================");
                    stack.print();
                    break;

                case 5:
                    Mahasiswa05 terbawah = stack.bottom();
                    if (terbawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + terbawah.nama);
                    }
                    break; 
                case 6:
                    System.out.println("Jumlah tugas yang sudah dikumpulkan: " + stack.jumlahTugas());
                    break;
               default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih >=1 && pilih <=4);
     }
}

