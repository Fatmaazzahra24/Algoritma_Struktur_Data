
public class BinaryTreeArrayMain05 {
    public static void main(String[] args) {
        BinaryTreeArray05 bta = new BinaryTreeArray05(); 

        Mahasiswa05 mhs1 = new Mahasiswa05("244160121", "Ali", "A", 3.57);
        Mahasiswa05 mhs2 = new Mahasiswa05("244160185", "Candra", "C", 3.41);
        Mahasiswa05 mhs3 = new Mahasiswa05("244160221", "Badr", "B", 3.75);
        Mahasiswa05 mhs4 = new Mahasiswa05("244160220", "Dewi", "A", 3.35);
        Mahasiswa05 mhs5 = new Mahasiswa05("244160131", "Dedi", "A", 3.48);
        Mahasiswa05 mhs6 = new Mahasiswa05("244160205", "Shan", "B", 3.66);
        Mahasiswa05 mhs7 = new Mahasiswa05("244160170", "Fizi", "B", 3.86);
        Mahasiswa05 mhs8 = new Mahasiswa05("244160200", "Gina", "C", 3.55);

        Mahasiswa05[] dataMahasiswa = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6;

        bta.populateData(dataMahasiswa, idxLast);

        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);

        System.out.println("\nPre-order traversal:");
        bta.traversePreOrder(0);
    }
}
