package Praktikum6.tugas;

/**
 *
 * @author zhari
 */
public class Elektronik extends Produk {
    public Elektronik(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public void displayInfo() {
        System.out.println("Nama Elektronik: " + getNama());
        System.out.println("Harga: " + getHarga());
    }
    public double hitungDiskon() {
        return getHarga() * 0.85; // 15% discount
    }
}