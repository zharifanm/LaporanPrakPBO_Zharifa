package praktikum12;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileIOPractice {
    public static void main(String[] args) {
        String filePath = "data.txt";
        
        // Menulis data ke file
        try (FileWriter writer = new FileWriter(filePath)) {
            System.out.println("Mulai proses penulisan...");
            writer.write("Belajar File I/O di Java!\n");
            writer.write("Pemrograman Berorientasi Objek.\n");
            System.out.println("Data berhasil ditulis ke file: " + filePath);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis file.");
            e.printStackTrace();
        }
        
        // Membaca data dari file
        java.io.File file = new java.io.File(filePath);
        if (!file.exists()) {
            System.out.println("File tidak ditemukan, proses membaca dibatalkan.");
            return;
        }
        
        try (FileReader reader = new FileReader(filePath)) {
            System.out.println("\nIsi file:");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file.");
            e.printStackTrace();
        }
    }
}

