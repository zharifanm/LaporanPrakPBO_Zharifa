package praktikum4;

public class Mobil extends kendaraan {
    private int jumlahPintu; //Atribut tambahan khusus untuk mobil 

    // Construktor
    public Mobil(String nama, int kecepatanMkas, String jenisMesin) {
        super(nama, kecepatanMkas, jenisMesin); // Memanggil constructor dari kelas induk
        this.jumlahPintu = jumlahPintu;
    }

    // Method untuk menampilkan informasi mobil
    public void tampilkanInfoMobil() {
        // Dapat mengakses kecepatanMaks karena protected
        System.out.println("Nama Kendaraan : " + nama);
        System.out.println("Kecepatan Maksimum Mobil: " + kecepatanMaks + " km/h");
        System.out.println("Jenis Mesin : " + jenisMesin);
        System.out.println("Jumlah Pintu " + jumlahPintu);
    }
    
}
