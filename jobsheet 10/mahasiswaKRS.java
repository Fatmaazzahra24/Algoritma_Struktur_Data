public class mahasiswaKRS {
        String nim;
        String nama;
        String prodi;

        public mahasiswaKRS (String nim, String nama, String prodi) {
            this.nim = nim;
            this.nama = nama;
            this.prodi = prodi;
        } 
    
        public void tampilkanData() {
            System.out.println(nim + " -" + nama + " -" + prodi + " -" );
        }    
}
