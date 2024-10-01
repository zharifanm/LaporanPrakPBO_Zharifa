package ResponsiUTS_ZharifaNurMajidah;
/**
 *
 * @author zhari
 */
public class Produk {
    private String namaProduk;
    private int harga;

    //Constructor
    public Produk(String namaProduk, int harga) { 
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    //Getter & setter
    public String getNamaProduk() {
        return namaProduk;
    }
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    public double getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public void tampilkanInfo() {
        System.out.println("\nNama Produk: " + namaProduk);
        System.out.println("Harga: Rp. " + harga);
    }
}

