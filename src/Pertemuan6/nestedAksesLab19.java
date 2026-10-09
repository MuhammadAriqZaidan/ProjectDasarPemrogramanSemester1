package Pertemuan6;

import java.util.Scanner;

public class nestedAksesLab19 {
    public static void main(String[] args) {
        Scanner zaidan = new Scanner(System.in);

        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenlab;

        System.out.print("Apakah mahasiswa aktif? (True/False): ");
        mahasiswaAktif = zaidan.nextBoolean();

        System.out.print("Apakah mahasiswa sedang disanksi? (True/False): ");
        sedangDisanksi = zaidan.nextBoolean();

        System.out.print("Apakah mahasiswa punya izin dosen? (True/False): ");
        punyaIzinDosen = zaidan.nextBoolean();

        System.out.print("Apakah mahasiswa adalah asisten lab? (True/False): ");
        asistenlab = zaidan.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenlab) {
                System.out.println("akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }
    }
}
