package Pertemuan5;

import java.util.Scanner;

public class PemilihanIf19 {
    public static void main(String[] args) {
        Scanner zaidan = new Scanner(System.in);
        System.out.println("---Cetak KRS SIAKAD---");
        System.out.print("Apakah UKT sudah lunas? (true/false)");
        boolean uktLunas = zaidan.nextBoolean();
        

        if (uktLunas) {
            System.out.println("Pembayaran UKT Terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");

        }else{
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }
    }
}
