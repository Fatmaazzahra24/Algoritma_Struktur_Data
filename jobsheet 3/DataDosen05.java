import java.util.Scanner;

public class DataDosen05 {
    static Scanner scan = new Scanner(System.in);

    static void dataSemuaDosen(Dosen05[] dosen) {  
        System.out.println("\n===== Data Semua Dosen =====");
        for (Dosen05 d : dosen) {
            System.out.println("Kode          : " + d.kode);
            System.out.println("Nama          : " + d.nama);
            System.out.println("Jenis Kelamin : " + (d.jenkel ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + d.usia);
            System.out.println("========================\n");
        }
    }

    static void jumlahDosenPerjenkel(Dosen05[] dosen) {  
        int jmlP = 0, jmlL = 0;
        String jenis;
        System.out.print("Cari Dosen Berdasarkan Jenis Kelamin (Pria / Wanita) : ");
        jenis = scan.nextLine();

        System.out.println("\nDosen dengan jenis kelamin " + jenis);
        for (Dosen05 d : dosen) {
            if (jenis.equalsIgnoreCase("Pria") && d.jenkel) {
                jmlL++;
                System.out.println("Kode          : " + d.kode);
                System.out.println("Nama          : " + d.nama);
                System.out.println("Jenis Kelamin : " + jenis);
                System.out.println("Usia          : " + d.usia);
            } else if (jenis.equalsIgnoreCase("Wanita") && !d.jenkel) {
                jmlP++;
                System.out.println("Kode          : " + d.kode);
                System.out.println("Nama          : " + d.nama);
                System.out.println("Jenis Kelamin : " + jenis);
                System.out.println("Usia          : " + d.usia);
                System.out.println();
            }
        }
    }

    static void rerataUsiaDosenPerjenkel(Dosen05[] dosen) {
        int jmlUsia = 0, jmlDosen = 0;
        float rerata;
        String jenis;
        System.out.print("\nMasukkan jenis kelamin dosen untuk mencari rerata usia : ");
        jenis = scan.nextLine();

        for (Dosen05 d : dosen) {
            if ((jenis.equalsIgnoreCase("Pria") && d.jenkel) ||
                (jenis.equalsIgnoreCase("Wanita") && !d.jenkel)) {
                jmlUsia += d.usia;
                jmlDosen++;
            }
        }
        
        if (jmlDosen > 0) {
            rerata = (float) jmlUsia / jmlDosen;
            System.out.println("\nRata-rata usia dosen " + jenis + " : " + rerata);
        } else {
            System.out.println("\nTidak ada dosen dengan jenis kelamin " + jenis);
        }
    }

    static void infoDosenTertua(Dosen05[] dosen) {
        int indexTertua = 0;
        for (int i = 1; i < dosen.length; i++) {
            if (dosen[i].usia > dosen[indexTertua].usia) {
                indexTertua = i;
            }
        }
        System.out.println("\nDosen Tertua adalah " + dosen[indexTertua].nama + " dengan umur " + dosen[indexTertua].usia);
    }

    static void infoDosenTermuda(Dosen05[] dosen) {
        int indexTermuda = 0;
        for (int i = 1; i < dosen.length; i++) {
            if (dosen[i].usia < dosen[indexTermuda].usia) {
                indexTermuda = i;
            }
        }
        System.out.println("\nDosen Termuda adalah " + dosen[indexTermuda].nama + " dengan umur " + dosen[indexTermuda].usia);
    }
}
