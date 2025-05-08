public class AntrianKRS {
    mahasiswaKRS[] data;
    int front;
    int rear;
    int size;
    int max;
    int jumlahProses = 0;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new mahasiswaKRS[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void clearAntrian() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian KRS berhasil dikosongkan! ");
        } else {
            System.out.println("Antrian KRS masih kosong! ");
        }
    }

    public void tambahAntrianKRS(mahasiswaKRS mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah proses KRS.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Tidak cukup mahasiswa untuk diproses.");
            return;
        }
        System.out.println("Memproses KRS untuk dua mahasiswa:");
        for (int i = 0; i < 2; i++) {
            mahasiswaKRS mhs = data[front];
            System.out.println((i + 1) + ". " + mhs.nim + " - " + mhs.nama + " - " + mhs.prodi + " - ");
            front = (front + 1) % max;
            size--;
            jumlahProses++;
        }
    } 

    public int getJumlahProses() {
        return 30-jumlahProses;
    }

    public void tampilkanSemmuanya() {
        if (isEmpty()) {
            System.out.println("Antrian prosess KRS masih kosong! ");
            return;
        } else {
            System.out.println("Daftar Mahasiswa dalam Antrian KRS");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ".  ");
                data[index].tampilkanData();
            }
        }
    }

    public void lihatTerdepan2() {
        if (size == 0) {
            System.out.println("Antrian kosong.");
        } else if (size == 1) {
            System.out.println("Hanya 1 mahasiswa dalam antrian:");
            data[front].tampilkanData();
        } else {
            System.out.println("2 Mahasiswa terdepan:");
            data[front].tampilkanData();
            int kedua = (front + 1) % max;
            data[kedua].tampilkanData();
        }
    }

    public void lihatBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa di antrian paling belakang:");
            data[rear].tampilkanData();
        }
    }

    public void jumlahAntrianBelumProses() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }

    public void jumlahSudahKRS() {
        System.out.println("Jumlah mahasiswa yang sudah KRS: " + jumlahProses);
    }

    String getJumlahAntrian() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}