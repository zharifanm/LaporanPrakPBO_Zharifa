package praktikum4;

/**
 *
 * @author zhari
 */
public class mobil extends kendaraan {
    private int jumlahPintu; //Atribut tambahan khusus untuk mobil 

    // Construktor
    public mobil(String nama, int kecepatanMkas, String jenisMesin, int jumlahPintu) {
        super(nama, kecepatanMkas, jenisMesin); // Memanggil constructor dari kelas induk
        this.jumlahPintu = jumlahPintu;
    }

    // Method untuk menampilkan informasi mobil
    public void tampilkanInfoMobil() {
        // Dapat mengakses kecepatanMaks karena protected
        System.out.println("\nNama Kendaraan : " + nama);
        System.out.println("Kecepatan Maksimum Mobil: " + kecepatanMaks + " km/h");
        System.out.println("Jenis Mesin : " + jenisMesin);
        System.out.println("Jumlah Pintu " + jumlahPintu);
    }  
}

