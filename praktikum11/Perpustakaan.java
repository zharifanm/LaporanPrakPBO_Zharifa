package praktikum11;

import java.util.ArrayList;
import java.util.List;

class Perpustakaan {
    private List<Buku> bukuList;
    public Perpustakaan() {
        this.bukuList = new ArrayList<>();
    }
    
    public void tambahBuku(Buku buku) {
        bukuList.add(buku);
    }
    
    public void infoPerpustakaan() {
        for (Buku buku : bukuList) {
            buku.infoBuku();
        }
    }
}
