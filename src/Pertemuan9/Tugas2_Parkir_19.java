package Pertemuan9;
// • Tarif parkir mobil = 2500 + (P mod 6) × 250 per jam → gantikan Rp3.000 pada soal
//2500+(19%6)x250 = 2750
// • Tarif parkir motor = 1500 + (P mod 6) × 250 per jam (gunakan nilai (P mod 6) yang SAMA
// dengan tarif mobil) → gantikan Rp2.000 pada soal
//1500+(19%6)x250 = 1750
import java.util.Scanner;
public class Tugas2_Parkir_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total=0;

        do {
            System.out.print("Masukkan jenis kendaraan anda(1 untuk Mobil, 2 untuk Motor, 0 untuk Keluar): ");
            jenis=sc.nextInt();
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir anda (jam): ");
                durasi=sc.nextInt();

                if (jenis == 1) {
                    total += durasi*2750;
                } else{
                    total += durasi*1750;
                }
            }
        } while (jenis!=0);
        System.out.println("Total pembayaran anda adalah: Rp" +total);
    }
}