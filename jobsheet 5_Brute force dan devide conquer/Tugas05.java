public class Tugas05 { 

    static int cariMaksimum(int arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        int lmaks = cariMaksimum(arr, l, mid);
        int rmaks = cariMaksimum(arr, mid + 1, r);
        if (lmaks > rmaks) {
            return lmaks;
        } else {
            return rmaks;
        } 
    }
    
    static int cariMinimum(int arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        int lmin = cariMinimum(arr, l, mid);
        int rmin = cariMinimum(arr, mid + 1, r); 
        if (lmin < rmin) {
            return lmin;
        } else{
            return rmin;
        }
    }
    
    static double hitungRataRata(int arr[]) {
        int jumlah = 0;
        for (int nilai : arr) {
            jumlah += nilai;
        }
        return (double) jumlah / arr.length;
    }
}
