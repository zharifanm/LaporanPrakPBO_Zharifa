package Praktikum5;

/**
 *
 * @author zhari
 */
class SepedaMotor extends kendaraan {
    String jenisMesin;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}

