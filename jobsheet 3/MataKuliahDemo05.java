import java.util.*;
public class MataKuliahDemo05 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner (System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = Integer.parseInt(input05.nextLine());

        Matakuliah05[] arrayOfMatakuliah = new Matakuliah05[jumlahMatkul];
        Matakuliah05 matakuliah = new Matakuliah05();
        matakuliah.tambahData(arrayOfMatakuliah);


        System.out.println("\n =============== Data Mata Kuliah =============");
        for (Matakuliah05 matkul : arrayOfMatakuliah) {
            matkul.cetakInfo();
        }
    }  
}
