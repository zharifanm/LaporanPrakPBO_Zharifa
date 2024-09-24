package Praktikum6.tugas;

/**
 *
 * @author zhari
 */
public class Pakaian extends Produk {
    public Pakaian(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public void displayInfo() {
        System.out.println("Nama Pakaian: " + getNama());
        System.out.println("Harga: " + getHarga());
    }
    public double hitungDiskon() {
        return getHarga() * 0.8; // 20% discount
    }
}

