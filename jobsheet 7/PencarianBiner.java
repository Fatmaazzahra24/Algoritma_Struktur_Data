public class PencarianBiner {
    public static int cariBiner(int[] data, int target) {
        int kiri = 0, kanan = data.length - 1;
        while (kiri <= kanan) {
            int tengah = (kiri + kanan) / 2;
            if (data[tengah] == target) {
                return tengah; 
            } else if (data[tengah] < target) {
                kiri = tengah + 1;
            } else {
                kanan = tengah - 1; 
            }
        }
        return -1; 
    }
}