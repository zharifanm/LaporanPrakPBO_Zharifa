package Praktikum6.tugas;

/**
 *
 * @author zhari
 */
public class Buku extends Produk {
    public Buku(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public void displayInfo() {
        System.out.println("Nama Buku: " + getNama());
        System.out.println("Harga: " + getHarga());
    }
    public double hitungDiskon() {
        return getHarga() * 0.9; // 10% discount
    }
}
