package Praktikum5.tugas;

/**
 *
 * @author zhari
 */
public class Main2 {
    public static void main (String[] args) {
        Kucing Molly = new Kucing();
        Molly.nama = "Mollly";
        Molly.jenis = "Kucing garong";
        Molly.suarakucing = "miawww rawrr";
        Molly.habitat = "Darat";
        
        Anjing Bolly = new Anjing();
        Bolly.nama = "Bolly";
        Bolly.jenis = "Anjing galak";
        Bolly.suaraanjing = "gukgukguk";
        Bolly.habitat = "Darat";
        
        Molly.tampilkanInfo();
        Bolly.tampilkanInfo();    
    }
}
