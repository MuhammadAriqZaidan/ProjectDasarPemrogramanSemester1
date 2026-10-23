
package PersiapanUTS;
import java.util.Scanner;

public class PemilihanJurusanAriq {
    public static void main(String[] args) {
        Scanner zaidan = new Scanner(System.in);
        String nama, NISN, pilihanJurusan;
        String jurusan = "";
        String statusSeleksi = "";
        double nilaiMatematika, nilaiInggris;


        System.out.print("Nama calon mahasiswa : ");
        nama = zaidan.nextLine();
        System.out.print("NISN : ");
        NISN = zaidan.nextLine();
        System.out.print("Pilihan jurusan (TI/SI/DKV) : ");
        pilihanJurusan = zaidan.nextLine().toUpperCase();
        System.out.print("Nilai matematika : ");
        nilaiMatematika = zaidan.nextDouble();
        System.out.print("Nilai bahasa Inggris : ");
        nilaiInggris = zaidan.nextDouble();


        switch (pilihanJurusan) {
            case "TI":
                jurusan = "Teknik Informatika";

                if (nilaiMatematika >= 80 &&
                    nilaiInggris >= 70) {
                    statusSeleksi = "LOLOS";
                } else {
                    statusSeleksi = "BELUM LOLOS";
                }
                break;

            case "SI":
                jurusan = "Sistem Informasi";

                if (nilaiMatematika >= 70 &&
                    nilaiInggris >= 70) {
                    statusSeleksi = "LOLOS";
                } else {
                    statusSeleksi = "BELUM LOLOS";
                }
                break;

            case "DKV":
                jurusan = "Desain Komunikasi Visual";

                if (nilaiMatematika >= 60 &&
                    nilaiInggris >= 65) {
                    statusSeleksi = "LOLOS";
                } else {
                    statusSeleksi = "BELUM LOLOS";
                }
                break;

            default:
                jurusan = "Kode jurusan tidak valid";
                statusSeleksi = "SELEKSI GAGAL";
                break;
        }


        System.out.println("\n===== SELEKSI JURUSAN =====");
        System.out.println("Nama              : " + nama);
        System.out.println("NISN              : " + NISN);
        System.out.println("Pilihan jurusan   : " + pilihanJurusan);
        System.out.println("Nilai Matematika  : " + nilaiMatematika);
        System.out.println("Nilai Inggris     : " + nilaiInggris);
        System.out.println();
        System.out.println("Jurusan           : " + jurusan);
        System.out.println("Status seleksi    : " + statusSeleksi);

        zaidan.close();
    }
}
