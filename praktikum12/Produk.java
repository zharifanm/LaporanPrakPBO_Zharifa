package praktikum12;
 
import java.io.Serializable;

public class Produk implements Serializable {
    private static final long serialVersionUID = 1L;
    private String namaProduk;
    private double harga;
    private int stok;

    public Produk(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk + 
                ", Harga: " + harga + ", Stok: " + stok);
 }
}
