package Pertemuan2;

import java.util.Scanner;

public class Segitiga19 {

    public static void main(String[] args) {
        Scanner zaidan = new Scanner(System.in);

        int alas, tinggi;
        float luas;

        System.out.print("Masukkan alas: ");
        alas = zaidan.nextInt();

        System.out.print("Masukkan tinggi: ");
        tinggi = zaidan.nextInt();

        luas = alas * tinggi / 2;

        System.out.println("Luas Segitiga: " + luas);
    }
}
