import java.util.*;
public class DosenDemo05 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
        int jmlDsn;
        System.out.print("Masukan Jumlah Dosen : ");
        jmlDsn= input.nextInt();
        input.nextLine();

        Dosen05 [] arrayDosen = new Dosen05[jmlDsn];

        for (int i = 0 ; i < jmlDsn ; i++) {
            System.out.print("BIODATA DOSEN KE -" + (i+1) + "\n");
            arrayDosen[i] = new Dosen05();
            arrayDosen[i].tambahData();
    }
    
    System.out.println("Data Dosen yang di tambahkan : " + jmlDsn);
    System.out.println("=================================");


    System.out.println("\n===== Data Semua Dosen =====");
    DataDosen05.dataSemuaDosen(arrayDosen); 
    DataDosen05.jumlahDosenPerjenkel(arrayDosen);
    DataDosen05.rerataUsiaDosenPerjenkel(arrayDosen);
    DataDosen05.infoDosenTertua(arrayDosen);
    DataDosen05.infoDosenTermuda(arrayDosen); 
        
    
 }
}