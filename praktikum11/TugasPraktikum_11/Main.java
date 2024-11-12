package TugasPraktikum_11;

public class Main {
    public static void main(String[] args) {
        Pengarang pengarang1 = new Pengarang("Tere Liye");
        Pengarang pengarang2 = new Pengarang("Andrea Hirata");

        Buku buku1 = new Buku("Negeri Para Badebah", pengarang1);
        Buku buku2 = new Buku("Laskar Pelangi", pengarang2);

        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        // Menampilkan informasi semua buku di perpustakaan
        perpustakaan.tampilkanBuku();
    }
}

