package Praktikum5.tugas;

/**
 *
 * @author zhari
 */
public class Kucing extends Hewandarat {
    String suarakucing;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara Kucing : " + suarakucing);   
    }
}
