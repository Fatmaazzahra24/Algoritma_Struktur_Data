import java.util.*;
public class QueueMain {
    public static void menu(){
        System.out.println ("Masukkan Operasi yang diinginkan: ");
        System.out.println("1. Enqueue ");
        System.out.println("2. Dequeue ");
        System.out.println("3. Print ");
        System.out.println("4. Peek ");
        System.out.println("5. Clear ");
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print ("Masukkan Kapasitas Queue: ");
        int n = sc.nextInt();
        Queue Q = new Queue(n);
        int pilih = 0;

        do { 
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1: 
                    System.out.print ("Masukkan data baru: ");
                    int datamasuk = sc.nextInt();
                    Q.Enqueue(datamasuk);
                    break;
                case 2:
                    int datakeluar = Q.Dequeue();
                    if (datakeluar !=0) {
                        System.out.print("data yang dikeluarkan: " + datakeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
            }
        } while (pilih == 1 ||pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
