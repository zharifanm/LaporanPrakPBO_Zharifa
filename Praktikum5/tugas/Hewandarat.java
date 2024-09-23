package Praktikum5.tugas;

/**
 *
 * @author zhari
 */
public class Hewandarat extends Hewan {
    String habitat;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Habitat hewan ini ada di : " + habitat);
    }
}
