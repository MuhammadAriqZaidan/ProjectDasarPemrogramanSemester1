package Pertemuan6;
import java.util.Scanner;

public class tugas2SeleksiAsisten19 {
    public static void main(String[] args) {
        Scanner zaidan = new Scanner(System.in);

        int P = 19; //nomor absen
        int syaratNilaiDP = 75 + (P % 11);
        int syaratNilaiWawancara = 70 + (P % 11);
        int nilaiDP, nilaiWawancara;
        boolean sanksi, aktif, sertifikat;

        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        aktif = zaidan.nextBoolean();
        System.out.print("Apakah mahasiswa sedang disanksi akademik? (true/false): ");
        sanksi = zaidan.nextBoolean();

        System.out.print("Silahkan input nilai Dasar Pemrograman: ");
        nilaiDP = zaidan.nextInt();
        System.out.print("Apakah mahasiswa memiliki sertifikat kompetensi pemrograman? (true/false): ");
        sertifikat = zaidan.nextBoolean();

        System.out.print("Masukkan nilai wawancara mahasiswa: ");
        nilaiWawancara = zaidan.nextInt();

        if (aktif && !sanksi) {
            if (nilaiDP >= syaratNilaiDP || sertifikat) {
                if (nilaiWawancara >= syaratNilaiWawancara) {
                    System.out.println("Anda diterima sebagai asisten praktikum");
                } else {
                    System.out.println("Gagal. Nilai wawancara anda kurang dari " +syaratNilaiWawancara);
                }
            } else {
                System.out.println("Gagal. Nilai Dasar Pemrograman anda kurang dari " +syaratNilaiDP+ " dan anda tidak memiliki sertfikat kompetensi");
            }
        } else {
            System.out.println("Gagal. Mahasiswa tidak aktif atau sedang mendapatkan sanksi akademik");
        }
        zaidan.close();
    }
}
