import java.util.Scanner;

public class tugas1_05 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        char kode[] = {'A','B','D','E','F','G','H','L','N','T'};
        char kota[][] = {
            {'B','A','N','T','E','N'},
            {'J','A','K','A','R','T','A'},
            {'B','A','N','D','U','N','G'},
            {'C','I','R','E','B','O','N'},
            {'B','O','G','O','R'},
            {'P','E','K','A','L','O','N','G','A','N'},
            {'S','E','M','A','R','A','N','G'},
            {'S','U','R','A','B','A','Y','A'},
            {'M','A','L','A','N','G'},
            {'T','E','G','A','L'}
        };
        System.out.println(" ==============================================");
        System.out.println("             Mencari Plat Nomor Kendaraan      ");
        System.out.println(" ==============================================");
        System.out.print("Masukkan Kode Plat Nomor: ");
        char cari = Character.toUpperCase(input05.next().charAt(0));
        boolean found = false;

        for(int i = 0; i < kode.length; i++) {
            if (Character.toUpperCase(kode[i]) == cari) {
                System.out.println("Kota dari kode plat nomor " + cari + " adalah: ");
                for (int j = 0; j < kota[i].length; j++) {
                    System.out.print(kota[i][j]);
                }
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Kode plat nomor tidak ditemukan.");
        }
    }
}
