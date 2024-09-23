package Praktikum5;

/**
 *
 * @author zhari
 */

class Mobil extends kendaraan {
    int jumlahPintu;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}

 