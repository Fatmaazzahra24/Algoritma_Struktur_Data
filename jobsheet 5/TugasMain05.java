import java.util.Scanner;
public class TugasMain05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};
        int [] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84}; 

        int maksimalUTS = Tugas05.cariMaksimum(nilaiUTS, 0,nilaiUAS.length -1);
        int minimalUTS = Tugas05.cariMinimum(nilaiUTS, 0, nilaiUTS.length -1);
        double ratarataUAS = Tugas05.hitungRataRata(nilaiUAS);

        System.out.println("Nilai UTS tertinggi :   " +maksimalUTS);
        System.out.println("Nilai UTS terendah  :   " +minimalUTS);
        System.out.println("Rata-rata nilai UAS :  " +ratarataUAS);
    }
}
