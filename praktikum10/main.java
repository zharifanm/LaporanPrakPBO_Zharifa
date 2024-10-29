package praktikum10;

public class main {
    public static void main(String[] args) {
        // Objek Penjumlahan
        OperasiHitung penjumlahan = new Penjumlahan();
        System.out.println("Hasil penjumlahan: " + 
                penjumlahan.hitung(10,5));
        
        // Objek Pengurangan
        OperasiHitung pengurangan = new Pengurangan();
        System.out.println("Hasil Pengurangan: " + 
                pengurangan.hitung(10, 5));
    }
    
}
