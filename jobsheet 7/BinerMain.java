public class BinerMain{
    public static void main(String[] args) {
        int[] data = {1, 3, 5, 7, 9, 11, 13}; 
        int target = 9;
        int hasil = PencarianBiner.cariBiner(data, target);
        if (hasil != -1) {
            System.out.println("angka " + target +" ditemukan pada indeks: " + hasil);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
