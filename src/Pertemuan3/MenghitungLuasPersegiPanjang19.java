package Pertemuan3;

import java.util.Scanner;

public class MenghitungLuasPersegiPanjang19 {

    public static void main(String[] args) {
        Scanner zaidan = new Scanner(System.in);

        int panjang;
        int lebar;
        int luas;

        System.out.println("Masukkan Panjang persegi panjang: ");
        panjang = zaidan.nextInt();
        System.out.println("Masukkan Lebar persegi panjang: ");
        lebar = zaidan.nextInt();

        luas=panjang*lebar;

        System.out.println("Luas persegi panjang adalah: " +luas);

    }
}
