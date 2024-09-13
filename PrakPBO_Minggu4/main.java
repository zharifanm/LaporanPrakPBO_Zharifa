package tugas_modul4;

public class main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Pekerja
        Pekerja pekerja = new Pekerja("Budi", 25, "Data Scientist", 7000000);

        // Menampilkan informasi pekerja menggunakan metode toString()
        System.out.println("Informasi Pekerja Awal:");
        System.out.println(pekerja.toString());

        // Mengubah nama pekerja menggunakan metode setter
        pekerja.setNama("Zharifa");

        // Menampilkan ulang informasi pekerja setelah perubahan nama
        System.out.println("\nInformasi Pekerja Setelah Perubahan Nama:");
        System.out.println(pekerja.toString());
    }
}
