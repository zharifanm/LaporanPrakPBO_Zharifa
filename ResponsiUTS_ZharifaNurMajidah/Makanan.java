package ResponsiUTS_ZharifaNurMajidah;
/**
 *
 * @author zhari
 */
public class Makanan extends Produk {
    public String tanggalKadaluarsa;

    public Makanan(String namaProduk, int harga, String tanggalKedaluwarsa) {
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKedaluwarsa;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tanggal Kadaluarsa makanan: " + tanggalKadaluarsa);
    }
}
