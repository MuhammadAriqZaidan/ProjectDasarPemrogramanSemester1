package Pertemuan6;

import java.util.Scanner;

public class operatorLogikaWifi19 {
    public static void main(String[] args) {
        Scanner zaidan = new Scanner(System.in);

        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;

        System.out.print("Apakah pengguna mahasiswa? (true/false): ");
        mahasiswa = zaidan.nextBoolean();

        System.out.print("Apakah pengguna dosen? (true/false): ");
        dosen = zaidan.nextBoolean();

        System.out.print("Apakah akun sedang diblokir? (true/false): ");
        akunDiblokir = zaidan.nextBoolean();


        if ((mahasiswa && dosen) && !akunDiblokir) {
            System.out.println("Akses WiFi diberikan");
        } else {
            System.out.println("Akses WiFi ditolak");
        }
    }
}
