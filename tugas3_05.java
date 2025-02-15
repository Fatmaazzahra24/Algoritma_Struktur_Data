import java.util.Scanner;
public class tugas3_05 {
    static Scanner input05 = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Masukkan jumlah Mata Kuliah :");
        int JumlahMK = input05.nextInt();
        input05.nextLine();

        String[] namaMatkul = new String [JumlahMK];
        int [] sks = new int [JumlahMK];
        int [] Semester = new int [JumlahMK];
        String[] CariJadwalHari = new String[JumlahMK];

        for (int i = 0; i < JumlahMK; i++) {
            System.out.print("Masukkan daftar Mata Kuliah ke-" + (i+1) + " : ");
            namaMatkul[i]= input05.nextLine();
            System.out.print("Masukkan jumlah SKS mata kuliah ke-" + (i+1) + " : ");
            sks[i]=input05.nextInt();
            System.out.print("Masukkan semester mata kuliah ke-" + (i + 1) + ": ");
            Semester[i] = input05.nextInt();
            input05.nextLine(); // 
            System.out.print("Masukkan hari kuliah (senin-jumat) ke-" + (i + 1) + ": ");
            CariJadwalHari[i] = input05.nextLine();
        }

        boolean menu = true;
        while (menu) {
            System.out.println("=======================================");
            System.out.println("   Program Menghitung Jadwal Kuliah    ");
            System.out.println("=======================================");
            System.out.println("Pilihan menu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari tertentu");
            System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester tertentu");
            System.out.println("4. Cari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.println("=======================================");

            System.out.print("Masukkan pilihan anda (1/2/3/4/5): ");
            int pilihan = input05.nextInt();
            input05.nextLine(); 


            switch (pilihan) {
                case 1:
                    tampilSemuaJadwal(namaMatkul, sks, Semester, CariJadwalHari);
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah yang ingin ditampilkan: ");
                    String hari = input05.nextLine();
                    tampilkanJadwalBerdasarkanHari(namaMatkul, sks, Semester, CariJadwalHari, hari);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang ingin ditampilkan: ");
                    int sem = input05.nextInt();
                    tampilkanJadwalBerdasarkanSemester(namaMatkul, sks, Semester, CariJadwalHari, sem);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang ingin dicari: ");
                    String nama = input05.nextLine();
                    cariMataKuliah(namaMatkul, sks, Semester, CariJadwalHari, nama);
                    break;
                case 5:
                    menu = false;
                    break;
                default:
                    System.out.println("Menu tidak valid! Silakan pilih lagi."); 
                }
        }
    
    }

    public static void tampilSemuaJadwal(String[] namaMatkul, int[] sks, int[] semester, String[] CariJadwalHari) {
        System.out.println(" Berikut adalah Seluruh jadwal kuliah:");
        System.out.printf("%-30s %-10s %-10s %-10s%n", "Nama Matkul", " SKS ", " Semester ", " Hari");

        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.printf("%-30s %-10d %-10d %-10s%n", namaMatkul[i], sks[i], semester[i], CariJadwalHari[i]);
        }
    }

    public static void tampilkanJadwalBerdasarkanHari(String[] namaMatkul, int[] sks, int[] semester, String[] CariJadwalHari, String hari) {
        boolean ditemukan = false;
        
        for (int i = 0; i < namaMatkul.length; i++) {
            if (CariJadwalHari[i].equalsIgnoreCase(hari)) {
                System.out.println("Berikut Jadwal kuliah pada hari " + hari + ":");
                System.out.printf("%-30s %-10s %-10s%n", "Nama Matkul", "SKS", "Semester");
                System.out.printf("%-30s %-10d %-10d%n", namaMatkul[i], sks[i], semester[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Jadwal Kuliah pada hari " + hari + " tidak ada.");
        }
    }
    

    public static void tampilkanJadwalBerdasarkanSemester(String[] namaMatkul, int[] sks, int[] semester, String[] CariJadwalHari, int semesterDicari) {
        boolean ditemukan = false;
        for (int i = 0; i < namaMatkul.length; i++) {
            if (semester[i] == semesterDicari) {
                System.out.println("Berikut Jadwal kuliah pada semester " + semesterDicari + ":");
                System.out.printf("%-30s %-10s %-10s %-10s%n", "Nama Matkul", " SKS ", "Semester", " Hari");
                System.out.printf("%-30s %-10d %-10d %-10s%n", namaMatkul[i], sks[i], semester[i], CariJadwalHari[i]);
                ditemukan=true;
            }
        }
        if (!ditemukan){
            System.out.println("Jadwal Kuliah pada semester " + semesterDicari+ " tidak ada");
        }
    }

    public static void cariMataKuliah(String[] namaMatkul, int[] sks, int[] semester, String[] CariJadwalHari, String namaDicari) {
        boolean ditemukan = false;
        
        for (int i = 0; i < namaMatkul.length; i++) {
            if (namaMatkul[i].equalsIgnoreCase(namaDicari)) {
                System.out.println("Hasil pencarian mata kuliah dengan nama '" + namaDicari + "':");
                System.out.printf("%-30s %-10s %-10s %-10s%n", "Nama Matkul", " SKS ", " Semester ", " Hari");
                System.out.printf("%-30s %-10d %-10d %-10s%n", namaMatkul[i], sks[i], semester[i],CariJadwalHari[i]);
                ditemukan=true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata Kuliah tidak dapat ditemukan!!");
        }
    }
} 

