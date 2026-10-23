package Pertemuan9;
// P (ABSEN): 19

// • Harga tiket = 40000 + (P mod 6) × 2000 → gantikan Rp50.000 pada soal
// 40000+ (19%6) x 2000= 42000
// • Syarat diskon pertama = lebih dari (3 + (P mod 3)) tiket, dengan diskon (8 + (P mod 5))% →
// gantikan "lebih dari 4 tiket, diskon 10%"
// (3+ (19%3)) = 4 | (8+(19%5)) = 12
// • Syarat diskon kedua = lebih dari (8 + (P mod 4)) tiket, dengan diskon (15 + (P mod 4))% →
// gantikan "lebih dari 10 tiket, diskon 15%"
// (8+ (19%4)) = 11 | (15+(19%4)) = 18
import java.util.Scanner;

public class Tugas1_Bioskop_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlTiket, hargaTiket = 42000, totTiket = 0, i = 0;
        double diskon = 0, totPenjualan = 0, totHarga;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            jmlTiket = sc.nextInt();

            if (jmlTiket == 0) {
                break;
            }

            if (jmlTiket < 0) {
                System.out.println("Input tidak valid");
                continue;
            }
            totHarga = jmlTiket * hargaTiket;

            if (jmlTiket > 4) {
                diskon = 0.12;
            } else if (jmlTiket > 11) {
                diskon = 0.18;
            }

            totPenjualan = (totHarga * diskon) - totHarga;
            totTiket = totTiket + jmlTiket;
            totPenjualan = totPenjualan + totHarga;
            i++;
        }

        System.out.println("Total tiket adalah: " + totTiket);
        System.out.println("Total penjualan adalah: " + totPenjualan);
    }
}
