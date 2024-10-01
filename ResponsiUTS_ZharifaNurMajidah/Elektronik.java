package ResponsiUTS_ZharifaNurMajidah;

/**
 *
 * @author zhari
 */
public class Elektronik extends Produk {
    public double garansi;

    public Elektronik(String namaProduk, int harga, double garansi) {
        super(namaProduk, harga);
        this.garansi = garansi;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Garansi berlaku selama: " + garansi + " tahun");
    }
}

