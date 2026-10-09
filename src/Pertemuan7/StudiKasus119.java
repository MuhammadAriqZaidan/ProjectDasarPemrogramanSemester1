package Pertemuan7;

import java.util.Scanner;

public class StudiKasus119 {
    public static void main(String[] args) {
        Scanner zaidan = new Scanner(System.in);

        int jumlahCup, uangBayar, totalHarga, totalBayar, kembalian, kurang, hargaPerCup = 16000, minimalBelanja = 120000, persenDiskon = 6;
        int diskon;

        System.out.print("Masukkan jumlah cup yang dibeli: ");
        jumlahCup = zaidan.nextInt();
        System.out.print("Masukkan jumlah uang yang dibayar: ");
        uangBayar = zaidan.nextInt();

        totalHarga = jumlahCup * hargaPerCup;

        if (totalHarga >= minimalBelanja) {
            diskon = persenDiskon / 100;
        } else {
            diskon = 0;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Harga total anda adalah: RP" + totalHarga);
        System.out.println("Diskon yang anda dapatkan adalah: RP" + diskon);
        System.out.println("Total harga yang harus anda bayar adalah: RP" + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: Rp" + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang RP" + kurang);
        }
    }
}
