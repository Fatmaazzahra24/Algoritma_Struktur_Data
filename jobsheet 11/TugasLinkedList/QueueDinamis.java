public class QueueDinamis {
    NodeMahasiswa05 head, tail;
    int size=0;
    
    public QueueDinamis() { 
        head = tail = null;
    }
    public boolean isEmpty(){
        return head == null;
    }

    public boolean isFull() {
        return false;
    } 

    public void enqueue(Mahasiswa05 data) {
        NodeMahasiswa05 baru = new NodeMahasiswa05 (data,null);
        if (isEmpty()) {
            head= tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada yang dipanggil.");
        } else {
            System.out.println("Mahasiswa yang dipanggil:");
            head.data.tampilInformasi();
            head = head.next;
            if (head == null) {
                tail = null;
            }
        }
    }

    public void tampilTerdepan() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa paling depan:");
            head.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void tampilTerakhir() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa paling akhir:");
            tail.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void tampilJumlah() {
        int count = 0;
        NodeMahasiswa05 tmp = head;
        while (tmp != null) {
            count++;
            tmp = tmp.next;
        }
        System.out.println("Jumlah mahasiswa dalam antrian: " + count);
    }

    public void clear () {
        head = tail = null;
        System.out.println("Antrian dikosongkan.");
    }
    public void tampilSemua() {
    if (isEmpty()) {
        System.out.println("Antrian kosong.");
    } else {
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        NodeMahasiswa05 tmp = head;
        while (tmp != null) {
            System.out.printf("NIM: %s, Nama: %s, Kelas: %s\n", tmp.data.nim, tmp.data.nama, tmp.data.kelas);
            tmp = tmp.next;
        }
    }
}

}
