package Praktikum6.tugas;

import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<Produk> produkList;
    public KeranjangBelanja() {
        this.produkList = new ArrayList<>();
    }
    public void addProduk(Produk produk) {
        this.produkList.add(produk);
    }
    public double hitungTotalHarga() {
        double totalHarga = 0;
        for (Produk produk : produkList) {
            totalHarga += produk.hitungDiskon();
        }
        return totalHarga;
    }
    public void displayKeranjang() {
    double totalHarga = 0;
    double totalDiskon = 0;
    for (Produk produk : produkList) {
        produk.displayInfo();
        double hargaAsli = produk.getHarga();
        double hargaDiskon = produk.hitungDiskon();
        double diskon = hargaAsli - hargaDiskon;
        double diskonPersen = (diskon / hargaAsli) * 100;
        System.out.println("Harga asli: " + hargaAsli);
        System.out.println("Diskon: " + diskonPersen + "%");
        System.out.println("Harga setelah diskon: " + hargaDiskon);
        System.out.println();
        totalHarga += hargaDiskon;
        totalDiskon += diskon;
    }
    System.out.println("Total harga: " + totalHarga);
    System.out.println("Total diskon: " + totalDiskon);
}
}
