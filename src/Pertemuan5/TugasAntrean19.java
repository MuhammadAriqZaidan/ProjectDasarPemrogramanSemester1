package Pertemuan5;

import java.util.Scanner;

public class TugasAntrean19 {
    public static void main(String[] args) {
            Scanner zaidan = new Scanner(System.in);
        System.out.println("---Mesin Antrean Layanan Digital---");
        System.out.print("Masukkan nomor layanan anda: ");
        int kode = zaidan.nextInt();

        switch (kode) {
            case 1:
                System.out.println("Jenis Layanan: Legalisir Ijazah \nLoket A");
                break;
                case 2:
                System.out.println("Jenis Layanan: SK Aktif Kuliah \nLoket B");
                break;
                case 3:
                System.out.println("Jenis Layanan: Pembayaran UKT \nLoket C");
                break;
                case 4:
                System.out.println("Jenis Layanan: Pengajuan Cuti \nLoket D");
                break;
            default:
                System.out.println("Kode layanan tidak tersedia");
        }
    }    
}
