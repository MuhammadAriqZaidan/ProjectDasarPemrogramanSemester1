package PersiapanUTS;

import java.util.Scanner;

public class SwitchCaseAriq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, fakultas, jurusan;
        String kodeFakultas, kodeJurusan;


        System.out.print("Nama calon mahasiswa: ");
        nama = input.nextLine();
        System.out.print("Kode fakultas (FT/FEB): ");
        kodeFakultas = input.nextLine().toUpperCase();
        System.out.print("Kode jurusan: ");
        kodeJurusan = input.nextLine().toUpperCase();

        fakultas = "";
        jurusan = "";

        switch (kodeFakultas) {
            case "FT":
                fakultas = "Fakultas Teknik";

                switch (kodeJurusan) {
                    case "TI":
                        jurusan = "Teknik Informatika";
                        break;

                    case "SI":
                        jurusan = "Sistem Informasi";
                        break;

                    default:
                        jurusan = "Kode jurusan tidak valid";
                        break;
                }
                break;

            case "FEB":
                fakultas = "Fakultas Ekonomi dan Bisnis";

                switch (kodeJurusan) {
                    case "MN":
                        jurusan = "Manajemen";
                        break;

                    case "AK":
                        jurusan = "Akuntansi";
                        break;

                    default:
                        jurusan = "Kode jurusan tidak valid";
                        break;
                }
                break;

            default:
                fakultas = "Kode fakultas tidak valid";
                jurusan = "Tidak dapat ditentukan";
                break;
        }

        
        System.out.println("\n===== HASIL PEMILIHAN =====");
        System.out.println("Nama       : " + nama);
        System.out.println("Fakultas   : " + fakultas);
        System.out.println("Jurusan    : " + jurusan);

        input.close();
    }
}
