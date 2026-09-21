package Pertemuan2;

import java.util.Scanner;

public class StudiKasusDua19 {

    public static void main(String[] args) {
        Scanner zaidan = new Scanner(System.in);

        int lebarTanah, panjangTanah, diameterKolam, panjangPersegi, luasTanahawal, luasTaman;
        double luasKolam, luasTanahSisa, phi = 3.14;

        System.out.print("Masukkan Lebar Tanah Anda: ");
        lebarTanah = zaidan.nextInt();

        System.out.print("Masukkan Panjang Tanah Anda: ");
        panjangTanah = zaidan.nextInt();

        System.out.print("Masukkan Diameter Kolam: ");
        diameterKolam = zaidan.nextInt();

        System.out.print("Masukkan Panjang Persegi Taman: ");
        panjangPersegi = zaidan.nextInt();

        luasTanahawal = panjangTanah * lebarTanah;
        luasKolam = phi * ((diameterKolam / 2) * (diameterKolam / 2));
        luasTaman = panjangPersegi * panjangPersegi;
        luasTanahSisa = luasTanahawal - (luasKolam + luasTaman);

        System.out.println("Luas tanah sisa anda adalah:" + luasTanahSisa);
    }
}
