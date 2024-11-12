package praktikum11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zhari
 */
class Klub {
    private String namaKlub;
    private List<Anggota> anggotaList;
    public Klub(String namaKlub) {
        this.namaKlub = namaKlub;
        this.anggotaList = new ArrayList<>();
    }
    
    public void tambahAnggota(Anggota anggota) {
        anggotaList.add(anggota);
    }
    
    public void infoKlub() {
        System.out.println("Nama Klub: " + namaKlub);
        for (Anggota anggota : anggotaList) {
            anggota.infoAnggota();
        }
    }
}


