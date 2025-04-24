public class MainPencarianBerurutan {
    public static void main(String[] args) {
        int[] data = {4, 2, 7, 1, 9, 3};
        int target = 7;
        int hasil = PencarianBerurutan.cariBerurutan(data, target);
        if (hasil != -1) {
            System.out.println("angka " + target +" ditemukan pada indeks: " + hasil);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}