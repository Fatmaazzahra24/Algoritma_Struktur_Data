public class BinaryTreeArray05 {
    Mahasiswa05[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray05() {
        this.dataMahasiswa = new Mahasiswa05[10];
    }

    void populateData(Mahasiswa05 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart < idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilkanInfromasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    public void add(Mahasiswa05 data) {
        if (idxLast < dataMahasiswa.length) {
            dataMahasiswa[idxLast] = data;
            idxLast++;
        } else {
            System.out.println("Tree sudah penuh, tidak bisa menambah data.");
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart < idxLast && dataMahasiswa[idxStart] != null) {
            dataMahasiswa[idxStart].tampilkanInfromasi();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
}

