
package praktikum11;


public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Pemrograman Java");
        Buku buku2 = new Buku("Struktur Data");
        Buku buku3 = new Buku("Algoritma Pemrograman");

        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);

        System.out.println("Informasi Perpustakaan:");
        perpustakaan.infoPerpustakaan();

       
        Anggota anggota1 = new Anggota("Zharifa");
        Anggota anggota2 = new Anggota("Meily");
        Anggota anggota3 = new Anggota("Gema");

        
        Klub klub = new Klub("Klub Pemrograman");
        klub.tambahAnggota(anggota1);
        klub.tambahAnggota(anggota2);
        klub.tambahAnggota(anggota3);

        
        System.out.println("\nInformasi Klub:");
        klub.infoKlub();
    }
}
