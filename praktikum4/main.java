package praktikum4;

public class main {
    public static void main(String[] args) {
        // Membuat objek dari kelas kendaraan
        kendaraan mobil = new kendaraan("Toyota Avanza", 180, "Bensin");
        
        // Menampilkan informasi kendaraan menggunakan metode tampilkanInfoKendaraan
        mobil.tampilkanInfoKendaraan();
        
        // Mengubah nama kendaraan menggunakan setter
        mobil.setNama("Honda CR-V");
        
        // Menampilkan informasi kendaraan setelah perubahan nama
        System.out.println("\nSetelah perubahan nama:");
        mobil.tampilkanInfoKendaraan();
    }
}
