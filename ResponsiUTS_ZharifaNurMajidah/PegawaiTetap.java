package ResponsiUTS_ZharifaNurMajidah;
/**
 *
 * @author zhari
 */
public class PegawaiTetap extends Pegawai {
    public int tunjangan;

    public PegawaiTetap(String namaPegawai, int gaji, int tunjangan) {
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Status: Pegawai Tetap");
    }
}
