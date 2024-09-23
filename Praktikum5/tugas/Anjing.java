package Praktikum5.tugas;

/**
 *
 * @author zhari
 */
public class Anjing extends Hewandarat {
    String suaraanjing;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo () ;
        System.out.println("Suara Anjing : " + suaraanjing);
    }   
}
