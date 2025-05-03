public class StackSurat05 {
    surat05[] stack;
    int top;
    int size;

    public StackSurat05(int size) {
        this.size = size;
        stack = new surat05[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(surat05 surat) {
        if (!isFull()) {
            stack[++top] = surat;
            System.out.println("Surat dari " + surat.namaMahasiswa + " diterima.");
        } else {
            System.out.println("Stack surat penuh!");
        }
    }

    public surat05 pop() {
        if (!isEmpty()) {
            surat05 s = stack[top--];
            System.out.println("Memproses surat dari: " + s.namaMahasiswa);
            return s;
        } else {
            System.out.println("Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public surat05 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }
    public void cariSurat(String nama) {
        boolean ditemukan = false;
        System.out.println("===== Hasil Pencarian Surat =====");
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                ditemukan = true;
                System.out.println("ID Surat     : " + stack[i].idSurat);
                System.out.println("Nama         : " + stack[i].namaMahasiswa);
                System.out.println("Kelas        : " + stack[i].kelas);
                System.out.println("Jenis Izin   : " + (stack[i].jenisIzin == 'S' ? "Sakit" : "Izin"));
                System.out.println("Durasi       : " + stack[i].durasi + " hari");
                System.out.println("-------------------------------");
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ditemukan surat atas nama: " + nama);
        }
    }
}
