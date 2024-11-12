package praktikum11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zhari
 */
class Anggota {
    private String nama;
    public Anggota(String nama) {
        this.nama = nama;
    }
    
    public void infoAnggota() {
        System.out.println("Nama Anggota: " + nama);
    }
}
