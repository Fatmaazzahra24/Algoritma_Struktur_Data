public class maxmin {
    static int [] carimaxminBF (int [] angka) {
        int max = angka [0];
        int min = angka [0]; 

        for (int i = 0; i < angka.length; i++) {
            if (angka [i] > max) {
                max = angka [i];
            } if (angka [i] < min){
                min = angka [i];
            }
        } return new int [] {max, min};
    } 


    static int[] carimaxminDC (int[] angka, int l, int r) {
        if (l == r) {
            return new int[]{angka[l], angka[l]};
        } 
        
        int mid = (l + r) / 2;
        int[] left = carimaxminDC(angka, l, mid);
        int[] right = carimaxminDC(angka, mid + 1, r);
        
        int max = (left[0] > right[0]) ? left[0] : right[0];
        int min = (left[1] < right[1]) ? left[1] : right[1];
        
        return new int[]{max, min};
    }
   

}