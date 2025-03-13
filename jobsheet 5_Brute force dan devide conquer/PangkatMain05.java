import  java.util.*;
public class PangkatMain05 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print("Masukkan jumlah elemen  : ");
    int elemen = input.nextInt();

    Pangkat05 [] png = new Pangkat05[elemen];
    for (int i = 0; i < elemen; i++) {
        System.out.print("masukkan nilai basis elemen ke- " +( i +1) + " : ");
        int basis = input.nextInt();
        System.out.print("masukkan nilai pangkat elemen ke- " +( i +1) + " : ");
        int pangkat = input.nextInt();
        png[i] = new Pangkat05 (basis,pangkat);
    }

    System.out.println("HASIL PANGKAT BRUTEFORCE : ");
    for (Pangkat05 p : png) { 
        System.out.println(p.nilai+ "^" +p.pangkat + " : " + p.pangkatBF());
    }
    System.out.println("HASIL PANGKAT DEVIDE AND CONQUER :");
    for (Pangkat05 p : png) {
        System.out.println(p.nilai+ "^" +p.pangkat + ":" + p.pangkatDC(p.nilai, p.pangkat));
        
    }
    }
}
