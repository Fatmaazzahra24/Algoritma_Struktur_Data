public class Matakuliah05 {
    public String kodeMK;
    public String namaMK;
    public int sks;
    public Dosen05[] pengampu;   

    // atribut dosen method dosen
    public String nidn;
    public String nama;
    public int tahunMasuk ;
    public String jenjangPendidikan ;
    public String prodi;

    public Matakuliah05(String nidn, String nama, int tahunMasuk, String jenjangPendidikan, String prodi) {
        this.nidn = nidn;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.jenjangPendidikan = jenjangPendidikan;
        this.prodi = prodi;
    }

    public Matakuliah05(String kodeMK, String namaMK, int sks, Dosen05[] pengampu) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.pengampu = pengampu;
    }


    public void tampilkanInfo() {
        System.out.println("\n=== Informasi Mata Kuliah ===");
        System.out.println("Kode MK       : " + kodeMK);
        System.out.println("Nama MK       : " + namaMK);
        System.out.println("SKS           : " + sks);
        System.out.println("--- Dosen Pengampu ---");
        for (Dosen05 dosen : pengampu) {
            dosen.tampilkanInfo();
        }
    }


    public void ubahNamaMK(String namaMKBaru) {
        this.namaMK = namaMKBaru;
        System.out.println("Nama Mata Kuliah telah diperbarui menjadi: " + namaMK);
    }


    public void ubahSKS(int sksBaru) {
        if (sksBaru >= 2) {
            this.sks = sksBaru;
            System.out.println("SKS telah diperbarui menjadi: " + sks);
        } else {
            System.out.println("SKS tidak valid! Minimal 2 SKS.");
        }
    }


    public void ubahDosen(Dosen05[] dosenBaru) {
        this.pengampu = dosenBaru;
        System.out.println("Dosen pengampu telah diperbarui.");
    } 

    public void tambahDosen(Dosen05 dosenBaru) {
        Dosen05[] dataBaru = new Dosen05[pengampu.length + 1];
        for (int i = 0; i < pengampu.length; i++) {
            dataBaru[i] = pengampu[i];
        }
        dataBaru[pengampu.length] = dosenBaru;
        pengampu = dataBaru;
        System.out.println("Dosen berhasil ditambahkan.");
    }
}
