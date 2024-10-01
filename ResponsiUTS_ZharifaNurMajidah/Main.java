package ResponsiUTS_ZharifaNurMajidah;
/**
 *
 * @author zhari
 */
public class Main {
    public static void main(String[] args) {
        // Buat objek Produk dengan polimorfisme
        Produk elektronik = new Elektronik("Kamera Sony", 12500000, 1.5);
        Produk makanan = new Makanan("Mochi Daifuku", 15000, "2024-01-10");
        
        // Tampilkan info produk
        System.out.println("--------------------");
        System.out.println("Produk");
        System.out.println("--------------------");
        elektronik.tampilkanInfo();
        makanan.tampilkanInfo();
        System.out.println();


        // Buat objek Pegawai dengan polimorfisme 
        Pegawai tetap = new PegawaiTetap("Zharifa", 10000000, 1500000);
        Pegawai kontrak = new PegawaiKontrak("Juyeon", 4000000, 36);
        
        // Tampilkan info pegawai
        System.out.println("--------------------");
        System.out.println("Pegawai");
        System.out.println("--------------------");
        tetap.tampilkanInfo();
        kontrak.tampilkanInfo();
    }
}
