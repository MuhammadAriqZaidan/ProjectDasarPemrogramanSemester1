package Pertemuan4;

import java.util.Scanner;

public class PemilihanBilangan19 {
    public static void main(String[] args) {
        Scanner zaidan = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = zaidan.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka " + angka + " termasuk bilangan genap");
        } else {
            System.out.println("Angka " + angka + " termasuk bilangan ganjil");

        }
    }
}
