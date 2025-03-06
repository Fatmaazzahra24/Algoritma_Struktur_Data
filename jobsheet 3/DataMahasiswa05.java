public class DataMahasiswa05 {
    public static void dataSemuaMahasiswa (Mahasiswa05 [] arrayMhs ) {
        System.out.println("============ DATA MAHASISWA ==============");;
        for (int i = 0;i < arrayMhs.length;i++) {
            System.out.println("Data Mahasiswa ke - " + (i+1));
            System.out.println("NIM                   :" + arrayMhs[i].nim) ;
            System.out.println("Nama                  :" + arrayMhs[i].nama) ;
            System.out.println("Program Studi         :" + arrayMhs[i].programStudi) ;
            System.out.println("IPK                   :" + arrayMhs[i].ipk) ;
            
        }
    }

    public static void jummlahMahasiswaPerProdi (Mahasiswa05 [] arrayMhs) {
        int sib = 0, ti = 0, mi = 0;
        for (int i = 0; i < arrayMhs.length; i++) {
            if (arrayMhs[i].programStudi.equalsIgnoreCase("sib")) {
                sib++;
            } else if (arrayMhs[i].programStudi.equalsIgnoreCase("ti")) {
                ti++;
            } else if (arrayMhs[i].programStudi.equalsIgnoreCase("mi")) {
              mi++;  
            }
        }
        System.out.println("========================= ");
        System.out.println("\n Data Junlah Mahasiswa per Prodi ");
        System.out.println("SIB         = " +sib);
        System.out.println("TI         = " + ti);
        System.out.println("MI         = " + mi);
    } 

    public static void cariMahasiswaByProdi(Mahasiswa05[] arrayMhs, String programStudi) {
        System.out.println("Data mahasiswa dengan program studi : " + programStudi);
        boolean cariMhs = false;

        for (int i = 0; i < arrayMhs.length; i++) {
            if (arrayMhs[i].programStudi.equalsIgnoreCase(programStudi)) {
                arrayMhs[i].cetakData05();
                System.out.println("----------------------------------------");
                cariMhs = true;
            }
            if (!cariMhs) {
                System.out.println("Silahkan input ulang program studi dengan benar !");
            }
        } 
    }  

    public static void ipkTertinggiPerProdi(Mahasiswa05[] arrayMhs){
        float ipkSIB = 0, ipkTI = 0, ipkMI = 0;
        for(int i = 0; i < arrayMhs.length; i++){
            if (arrayMhs[i].programStudi.equalsIgnoreCase("sib") && arrayMhs[i].ipk > ipkSIB) { 
                ipkSIB = arrayMhs[i].ipk;
            } 
             if (arrayMhs[i].programStudi.equalsIgnoreCase("ti") && arrayMhs[i].ipk > ipkTI) {
                ipkTI = arrayMhs[i].ipk;
            }
            if (arrayMhs[i].programStudi.equalsIgnoreCase("mi") && arrayMhs[i].ipk > ipkMI) {
                ipkMI = arrayMhs[i].ipk;
            }
        }

        System.out.println("\nIpk tertinggi tiap program studi : ");
        System.out.println("SIB : " + ipkSIB);
        System.out.println("TI  : " + ipkTI);
        System.out.println("MI  : " + ipkMI);
    }
}
