package ResponsiUTS_ZharifaNurMajidah;
/**
 *
 * @author zhari
 */
public class PegawaiKontrak extends Pegawai {
    public int lamaKontrak;

    public PegawaiKontrak(String namaPegawai, int gaji, int lamaKontrak) {
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Lama Kontrak: " + lamaKontrak + " bulan");
        System.out.println("Status: Pegawai Kontrak");
    }
}
