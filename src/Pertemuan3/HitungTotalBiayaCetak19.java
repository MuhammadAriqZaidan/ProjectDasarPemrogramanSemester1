package Pertemuan3;

import java.util.Scanner;

public class HitungTotalBiayaCetak19 {
    public static void main(String[] args) {
        Scanner zaidan = new Scanner(System.in);

        int lembar, biayaCetak=500, biayaJilid=5000, totalBiaya;

        System.out.print("Masukkan jumlah lembar yang anda print: ");
        lembar = zaidan.nextInt();

        totalBiaya = (lembar*biayaCetak)+biayaJilid;

        System.out.println("Harga yang harus anda bayar adalah: " + totalBiaya);
    }
}
