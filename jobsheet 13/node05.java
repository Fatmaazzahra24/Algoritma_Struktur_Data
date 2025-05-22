public class node05 {
    mahasiswa05 data;
    node05 prev;
    node05 next;
    
    public node05(mahasiswa05 data){
        this.data = data;
        prev = null;
        next = null;
    }
    public node05(node05 prev, mahasiswa05 data, node05 next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
