package praktikum4;

public class Manusia {
    // Atribut dengan akses modifier sesuai ketentuan
    private String nama;      // private: hanya bisa diakses dari dalam kelas ini
    protected int usia;       // protected: bisa diakses dari kelas ini dan subclass-nya
    public String pekerjaan;  // public: bisa diakses dari mana saja

    // Constructor untuk menginisialisasi atribut
    public Manusia(String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }

    // Getter untuk atribut nama
    public String getNama() {
        return nama;
    }

    // Setter untuk atribut nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk atribut usia
    public int getUsia() {
        return usia;
    }

    // Setter untuk atribut usia (opsional, jika diperlukan)
    public void setUsia(int usia) {
        this.usia = usia;
    }

    // Getter untuk atribut pekerjaan
    public String getPekerjaan() {
        return pekerjaan;
    }

    // Setter untuk atribut pekerjaan (opsional, jika diperlukan)
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
}
