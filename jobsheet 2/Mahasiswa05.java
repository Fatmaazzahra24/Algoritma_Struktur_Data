public class Mahasiswa05 {

    String nama ;
    String NIM ;
    String kelas ;
    double ipk;

    void tampikanInformasi () {
        System.out.println("Nama :" +nama);
        System.out.println("NIM :" + NIM);
        System.out.println("IPK : " + ipk);
        System.out.println("kelas : " +kelas);
    }
    void ubahKelas (String KelasBaru) {
        kelas = KelasBaru;
    }
    void  updateIPK (double  ipkbaru) {
        ipk = ipkbaru;
    }
    String nilaiKinerja () {

        if (ipk >=  0.0 && ipk <= 4.0) {
            
            if (ipk >= 3.5) {
                return "Kinerja sangat baik";
            } else if (ipk >= 3.0) {
                return  " Kinerja Baik" ;
            } else if (ipk >= 2.0) {
                return  " Kinerja Cukup " ;
            }else  {
                return  " Kinerja Baik" ;
            }
        } else {
          return  "IPK tidak valid! harus berada direntang 0.0  sampai 4.0";   
        }
    }

}