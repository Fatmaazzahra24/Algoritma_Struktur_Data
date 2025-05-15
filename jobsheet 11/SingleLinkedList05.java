public class SingleLinkedList05 {
    NodeMahasiswa05 head;
    NodeMahasiswa05 tail;

    boolean isEmpty() {
        return head == null;
    }
    public void print () {
        if (!isEmpty()) {
            NodeMahasiswa05 tmp = head;
            System.out.println("Isi Linked List:");
            System.out.printf("%-10s %-10s %-5s %-4s\n", "Nama", "NIM", "Kelas", "IPK");
            while (tmp != null) {
                tmp.data.tampilInformasi();  
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked list kosong!");
        }
    }
    
    public void addFirst(Mahasiswa05 data) {
        NodeMahasiswa05 ndInput = new NodeMahasiswa05(data, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    } 
    public void addLast(Mahasiswa05 input) {
        NodeMahasiswa05 ndInput = new NodeMahasiswa05(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void insertAfter(String key, Mahasiswa05 input) {
        NodeMahasiswa05 ndInput = new NodeMahasiswa05(input, null);
        NodeMahasiswa05 tmp = head;
        do { 
            if (tmp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = tmp.next;
                tmp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            } 
            tmp = tmp.next;
        } while (tmp != null);
    }
    public void insertAt (int index,Mahasiswa05 input) {
        if (index < 0) {
            System.out.println("Index salah!");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa05 tmp = head;
            for (int i = 0; i < index - 1; i++) {
                tmp = tmp.next;
            }
            tmp.next = new NodeMahasiswa05(input, tmp.next);
            if (tmp.next.next == null) {
                tail = tmp.next;
            }
        }
    }
}
