package TugasPraktikum_11;

import java.util.ArrayList;

class Perpustakaan {
    private ArrayList<Buku> daftarBuku; // Komposisi - daftar buku milik perpustakaan

    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku); // Menambahkan buku ke dalam daftar
    }

    public void tampilkanBuku() {
        // Menampilkan informasi setiap buku yang ada di daftarBuku
        for (Buku buku : daftarBuku) {
             buku.infoBuku();
        }
    }
}

