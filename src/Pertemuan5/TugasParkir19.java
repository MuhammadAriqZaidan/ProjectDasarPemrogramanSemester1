package Pertemuan5;

import java.util.Scanner;

public class TugasParkir19 {
    public static void main(String[] args) {
        Scanner zaidan = new Scanner(System.in);
        int lamaParkir, totalTarif;

        System.out.println("---Operasi Menghitung Tarif Parkir---");
        System.out.print("Masukkan lama anda parkir (JAM): ");
        lamaParkir = zaidan.nextInt();
        if (lamaParkir<=2) {
            totalTarif = 2000;
        } else{
            totalTarif = 2000 + ((lamaParkir - 2)*1000);
        }

        System.out.println("Tarif parkir yang harus anda bayar selama " +lamaParkir+ " Jam adalah: " +totalTarif);
    }
}
