import java.util.Scanner;

public class tugas2_05 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        boolean running = true;

        while (running) {

            System.out.println("=======================================");
            System.out.println("         Program Menghitung Rumus      ");
            System.out.println("=======================================");
            System.out.println("Pilihan rumus :");
            System.out.println("1. hitung volume kubus ( s * s * s)");
            System.out.println("2. Hitung Luas permukaan kubus (6 * s * s )");
            System.out.println("3. Hitung keliling rusuk kubus (12 * s)");
            System.out.println("=======================================");
            
            System.out.print("Masukkan pilihan rumus anda (1/2/3): ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    hitung_volume();
                    break;
                case 2:
                    hitung_luas();
                    break;
                case 3:
                    hitung_keliling();
                    break;
                default:
                    System.out.println("Menu tidak valid! Silakan pilih lagi."); 
            }
        }
    }
    public static void hitung_volume() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sisi: ");
        double s = input.nextDouble();
        
        double v = s * s * s;
        System.out.println("volume kubus dengan sisi "+ s + " adalah " + v );
    }
    
    public static void hitung_luas() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan sisi : ");
        double s = input.nextDouble();
        
        double L = 6 *s *s;
        System.out.println("Luas permukaan kubus dengan sisi " + s + " adalah " + L);
    }
    

    public static void hitung_keliling() {
        Scanner input = new Scanner(System.in); 
        System.out.print("Masukkan sisi : ");
        double s = input.nextDouble();
        
        double K = s * 12;
        System.out.println("Keliling kubus dengan sisi " + s + " adalah " + K );
    }

}
