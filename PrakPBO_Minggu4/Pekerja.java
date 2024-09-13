package tugas_modul4;

public class Pekerja extends Manusia {
    // Atribut tambahan dengan akses modifier private
    private double gaji;

    // Constructor untuk menginisialisasi atribut nama, usia, pekerjaan, dan gaji
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan);  // Memanggil constructor dari kelas Manusia
        this.gaji = gaji;  // Menginisialisasi atribut gaji
    }
    // Getter untuk atribut gaji
    public double getGaji() {
        return gaji;
    }
    // Setter untuk atribut gaji
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    // Override metode toString() untuk menampilkan informasi lengkap
    @Override
    public String toString() {
        return "Identitas pekerja TIF\n" + "Nama Pekerja : " + getNama() +
                "\nUsia Pekerja : " + usia + "\nPekerjaan : " + pekerjaan +
                "\nGaji yang didapat : "  + gaji;
    }
}
