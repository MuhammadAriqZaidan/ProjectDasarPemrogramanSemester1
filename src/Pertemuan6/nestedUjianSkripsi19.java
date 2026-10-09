package Pertemuan6;

import java.util.Scanner;

// Nomor absen mahasiswa (P): 19
// Syarat minimal log bimbingan Pembimbing 1 = 6 + (19 mod 5) = 8
// Syarat minimal log bimbingan Pembimbing 2 = 3 + (19 mod 3) = 4

public class nestedUjianSkripsi19 {
    public static void main(String[] args) {
        Scanner zaidan = new Scanner(System.in);

        String pesan;

        System.out.print("Apakah mahasiswa sudah bebas kompen? (ya/tidak): ");
        String bebasKompen = zaidan.nextLine().trim();

        System.out.print("Masukkan jumlah log bimbingan pembimbing 1: ");
        int bimbinganP1 = zaidan.nextInt();
        System.out.print("Masukkan jumlah log bimbingan pembimbing 2: ");
        int bimbinganP2 = zaidan.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";

            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }

        System.out.println(pesan);
    }
}
