// menyimpan objek kendaraan struktur : 
public class kendaraan {
    String platNomor;
    String tipe; 
    String merk;
    
    public kendaraan(String platNomor, String tipe, String merk) {
        this.platNomor = platNomor;
        this.tipe = tipe;
        this.merk = merk;
    }

    public void tampilkanInfo() { 
        System.out.println("Plat Nomor: " + platNomor);
        System.out.println("Tipe: " + tipe);
        System.out.println("Merk: " + merk);
    }
}

//dibuat 3 file karena fungsi dari masing-masing file berbeda, dan jika ada 1 yg error tidak usah diubah smw