public class maxminMain {

    public static void main(String[] args) {
        int [] angka = {3,5,7,9,25,29,1,10};
        int [] hasilBF = maxmin.carimaxminBF(angka);
        System.out.println("hasil minimal BF : " +hasilBF[1]);
        System.out.println("hasil maksimal  BF: " +hasilBF[0]);

        int [] hasilDC = maxmin.carimaxminDC(angka,0, angka.length - 1);
        System.out.println("hasil minimal DC : " +hasilDC[1]);  
        System.out.println("hasil maksimal DC : " +hasilDC[0]);
    }

}