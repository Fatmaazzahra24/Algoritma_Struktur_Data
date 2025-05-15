public class SLLMain05 {
    public static void main(String[] args) {
        SingleLinkedList05 sll = new SingleLinkedList05();
        Mahasiswa05 mhs1 = new Mahasiswa05 ("24212200","Alvaro", "1A", 4.0);
        Mahasiswa05 mhs2 = new Mahasiswa05 ("23212201","Bimon", "2B", 3.8);
        Mahasiswa05 mhs3 = new Mahasiswa05 ("22212202","Cintia", "3C", 3.5);
        Mahasiswa05 mhs4 = new Mahasiswa05 ("21212203","Dirga", "4D", 3.6);
        
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2,mhs2);
        sll.print();

        System.out.println("data index 1: ");
        sll.getData(1);
        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

    }
}

/*Scanner sc = new Scanner(System.in);
SingleLinkedList05 sll = new SingleLinkedList05();
int pilihan; 



do {
    System.out.println("\n=== MENU LINKED LIST MAHASISWA ===");
    System.out.println("1. Tambah Data Mahasiswa");
    System.out.println("2. Tampilkan Data");
    System.out.println("3. Keluar");
    System.out.print("Pilih menu (1-3): ");
    pilihan = sc.nextInt();
    sc.nextLine(); 

    switch (pilihan) {
        case 1:
            System.out.println("\nInput Data Mahasiswa:");
            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa05 mhs = new Mahasiswa05(nim, nama, kelas, ipk);

            System.out.println("\nTambah ke:");
            System.out.println("1. Awal");
            System.out.println("2. Akhir");
            System.out.println("3. Setelah Nama Tertentu");
            System.out.println("4. Pada Indeks Tertentu");
            System.out.print("Pilihan: ");
            int posisi = sc.nextInt();
            sc.nextLine(); 

            switch (posisi) {
                case 1:
                    sll.addFirst(mhs);
                    break;
                case 2:
                    sll.addLast(mhs);
                    break;
                case 3:
                    System.out.print("Masukkan nama setelah siapa data disisipkan: ");
                    String keyNama = sc.nextLine();
                    sll.insertAfter(keyNama, mhs);
                    break;
                case 4:
                    System.out.print("Masukkan indeks (mulai dari 0): ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    sll.insertAt(index, mhs);
                    break;
                default:
                    System.out.println("Pilihan posisi tidak valid.");
            }
            break;

        case 2:
        System.out.println("\nData Mahasiswa dalam Linked List:");
        sll.print();
        if (!sll.isEmpty()) {
            try {
                System.out.println("Data index ke-1:");
                sll.getData(1);
            } catch (Exception e) {
                System.out.println("Data index ke-1 tidak tersedia (kurang dari 2 data).");
            }
            System.out.println("Data mahasiswa bernama Bimon berada pada index : " + sll.indexOf("Bimon"));
        } else {
            System.out.println("Linked List masih kosong, tidak bisa mencari data.");
        }
    
        break;
    

        case 3:
            System.out.println("Terima kasih. Program selesai.");
            break;

        default:
            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
    }

} while (pilihan != 3);*/