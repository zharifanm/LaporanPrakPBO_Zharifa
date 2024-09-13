package praktikum4;

public class PraktikumPBO4 {
    public static void main(String[] args) {
        // Membuat objek dari kelas kendaraan
        kendaraan zaza = new kendaraan("Toyota Avanza", 500, "Bensin");
        // Menampilkan informasi kendaraan menggunakan metode tampilkanInfoKendaraan
        zaza.tampilkanInfoKendaraan();
        
        // Membuat objek dari kelas mobil
        mobil zhar = new mobil("Range Rover", 600, "Electric Vehicle", 4);
        zhar.tampilkanInfoMobil();
    }
}
