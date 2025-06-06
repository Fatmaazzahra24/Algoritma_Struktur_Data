public class AntrianLinkedList {
    nodeKendaraan head, tail;
    int size = 0;

    public boolean isEmpty() {
        return head == null;
    }
    public void tambahAntrian(kendaraan data) {
        nodeKendaraan input = new nodeKendaraan(data);
        if (isEmpty()) {
            head = tail = input;
        } else {
            tail.next = input; // → node baru ditempatkan setelah node terakhir.
            tail = input;     // → tail diperbarui untuk menunjuk ke node baru.
        }
        size++;
        System.out.println("Kendaraan " + data.platNomor + " telah ditambahkan ke antrian.");
    }   

    public kendaraan layaniAntrian() { //melayani kendaraan dari antrian/menghapus node 
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada kendaraan yang bisa dilayani.");
            return null;
        }
        kendaraan data = head.data; // Ambil data kendaraan pada node terdepan (head) dari antrian.
        head = head.next; // Pindahkan penunjuk head ke node berikutnya.Ini artinya, node lama di bagian depan sudah "keluar" dari antrian.
        size--;
        if (head == null) {
            tail = null; // Jika antrian menjadi kosong
        }
        return data;
    }

    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        nodeKendaraan current = head; // current digunakan untuk menelusuri node dari depan antrian (head) sampai habis.
        int no = 1; // no bisa digunakan jika kamu ingin memberi nomor urutan (meskipun di kode ini belum dipakai).
        System.out.println("Daftar Kendaraan dalam Antrian:");
        while (current != null) { // Selama masih ada node (current tidak null), lakukan:
        System.out.println("Plat Nomor: " + current.data.platNomor);
        System.out.println("Tipe: " + current.data.tipe);
        System.out.println("Merk: " + current.data.merk);
        System.out.println(); 
        current = current.next;
    }
    }
    public int jumlahAntrian() {  
        return size;
    }   
}
