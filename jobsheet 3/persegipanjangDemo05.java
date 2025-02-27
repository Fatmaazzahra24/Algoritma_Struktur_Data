public class persegipanjangDemo05 {
    public static void main(String[] args) {
        persegiPanjang05[] arrayOfPersegiPanjang05 = new persegiPanjang05[3];

        arrayOfPersegiPanjang05[0] = new persegiPanjang05();
        arrayOfPersegiPanjang05[0].panjang = 110;
        arrayOfPersegiPanjang05[0].lebar = 30;

        arrayOfPersegiPanjang05[1] = new persegiPanjang05();
        arrayOfPersegiPanjang05[1].panjang = 80;
        arrayOfPersegiPanjang05[1].lebar = 40;

        arrayOfPersegiPanjang05[2] = new persegiPanjang05();
        arrayOfPersegiPanjang05[2].panjang = 100;
        arrayOfPersegiPanjang05[2].lebar = 20;

        System.out.println("persegi panjang ke-1, panjang:" +arrayOfPersegiPanjang05[0].panjang + ",lebar : " +
        arrayOfPersegiPanjang05[0].lebar);
        System.out.println("persegi panjang ke-2, panjang:" +arrayOfPersegiPanjang05[1].panjang + ",lebar : " + 
        arrayOfPersegiPanjang05[1].lebar);
        System.out.println("persegi panjang ke-3, panjang:" +arrayOfPersegiPanjang05[2].panjang + ",lebar : " + 
        arrayOfPersegiPanjang05[2].lebar);
    }
}
