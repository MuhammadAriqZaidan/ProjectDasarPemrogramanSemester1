package Pertemuan9;
import java.util.Scanner;
// Percobaan 3 : Transaksi Kafe (DO-WHILE)
// P ABSEN = 19
// • hargaKopi = 10000 + (P mod 5) × 1000 → gantikan Rp12.000 pada soal
// 10000 + (19 % 5) x 1000 = 14000
// • hargaTeh = 5000 + (P mod 4) × 1000 → gantikan Rp7.000 pada soal
// 5000 + (19 % 4) x 1000 = 8000
// • hargaRoti = 15000 + (P mod 6) × 1000 → gantikan Rp20.000 pada soal
// 15000 + (19 % 6) x 1000 = 16000

public class KafeDoWhile19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti, hargaKopi = 14000, hargaTeh = 8000, hargaRoti = 16000, totalHarga;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp" +totalHarga);
            sc.nextLine();
        } while (true);
    }
}
