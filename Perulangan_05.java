import java.util.*;
public class Perulangan_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan NIM anda : ");
        Long nim = input.nextLong();

        long duaDigitAakhir = nim % 100;

        if (duaDigitAakhir < 10) {
            duaDigitAakhir += 10;
        }

        for (int i = 1; i <= duaDigitAakhir; i++) {
            if (i != 6 && i != 10) {
                if (i % 2 == 0) {
                    System.out.print(i);
                } else {
                    System.out.print(" * ");
                }
            }
        }
    }
}
