package Tugas12;

import java.io.Serializable;

// Kelas Buku
class Buku implements Serializable {
    private static final long serialVersionUID = 1L; // Versi serialisasi
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilkanInfo() {
        System.out.println(this);
    }
}

