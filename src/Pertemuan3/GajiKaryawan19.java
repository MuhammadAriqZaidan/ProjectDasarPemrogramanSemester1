package Pertemuan3;

import java.util.Scanner;

public class GajiKaryawan19 {

    public static void main(String[] args) {
        Scanner zaidan = new Scanner(System.in);

        int gajiPokok;
        double bonus, totGaji;
        double tunjTransp = 600000;
        double tunjMkn = 400000;

        System.out.println("Masukkan gaji pokok: ");
        gajiPokok = zaidan.nextInt();

        bonus = 0.05 * gajiPokok;
        totGaji = gajiPokok + tunjTransp + tunjMkn + bonus - 0.1 * gajiPokok;

        int totGajiBulat=(int) totGaji;
        int bonusBulat=(int) bonus;

        System.out.println("Bonus Bulanan anda adalah Rp. " + bonusBulat);
        System.out.println("Gaji yang diterima adalah Rp. " + totGajiBulat);

    }
}
