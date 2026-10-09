package Pertemuan5;
import java.util.Scanner;

public class Tugas1Pemilihan19 {
        public static void main(String[] args) {
        Scanner zaidan = new Scanner(System.in);
        System.out.println("---Cetak KRS SIAKAD---");
        System.out.print("Apakah UKT sudah lunas? (true/false)");
        boolean uktLunas = zaidan.nextBoolean();

        String pesan = (uktLunas) ? "Pembayaran UKT Terverifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
        System.out.println(pesan);
    }
}
