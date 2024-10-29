package SoalModul10;

public class Main {
    public static void main(String[] args) {
        
        //Objek Elektronik
        Pembayaran TV = new Elektronik();
        double hargaElektronik = 1000000.0;
        double pajakElektronik = TV.hitungPajak(hargaElektronik);
        double totalHargaE = hargaElektronik + pajakElektronik;
        
        System.out.println("Harga barang Elektronik : Rp" + hargaElektronik);
        System.out.println("Pajak untuk Elektronik (10%) : Rp" + pajakElektronik);
        System.out.println("Total Harga Elekronnik setelah pajak  : Rp" + totalHargaE);
        
        System.out.println();
        
        //Objek Makanan
        Pembayaran Bakso = new Makanan();
        double hargaMakanan = 20000.0;
        double pajakMakanan = Bakso.hitungPajak(hargaMakanan);
        double totalhargaM = hargaMakanan + pajakMakanan;
        System.out.println("Harga Makanan : RP" + hargaMakanan);
        System.out.println("Pajak untuk Makanan (5%)  : Rp" + pajakMakanan);
        System.out.println("Total Harga Makanan setelah pajak  : Rp" + totalhargaM);
          
    }
}
