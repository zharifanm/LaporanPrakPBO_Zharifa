package Praktikum6.tugas;

/**
 *
 * @author zhari
 */
public class Main2 {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        Buku buku = new Buku("Buku Teknologi Informasi", 100000);
        Elektronik elektronik = new Elektronik("Kulkas", 5000000);
        Pakaian pakaian = new Pakaian("Baju batik", 200000);

        keranjang.addProduk(buku);
        keranjang.addProduk(elektronik);
        keranjang.addProduk(pakaian);

        System.out.println("Keranjang Belanja:");
        keranjang.displayKeranjang();
    }
}
