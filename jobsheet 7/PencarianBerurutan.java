public class PencarianBerurutan {
    public static int cariBerurutan(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i; // Data ditemukan
            }
        }
        return -1; // Data tidak ditemukan
    }
}