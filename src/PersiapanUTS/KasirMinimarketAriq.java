package PersiapanUTS;

import java.util.Scanner;

public class KasirMinimarketAriq {
    public static void main(String[] args) {
        Scanner zaidan = new Scanner(System.in);
        String namaPembeli, kodeBarang, statusMember, jenisBarang = "";
        int jumlahBarang;
        double hargaSatuan, totalAwal, totalDiskon, totalBayar, diskonJumlah = 0, diskonMember = 0;

        System.out.println("===== KASIR MINIMARKET =====");
        System.out.print("Nama pembeli : ");
        namaPembeli = zaidan.nextLine();
        System.out.print("Kode barang  : ");
        kodeBarang = zaidan.next().toUpperCase();
        System.out.print("Jumlah       : ");
        jumlahBarang = zaidan.nextInt();
        System.out.print("Harga satuan : ");
        hargaSatuan = zaidan.nextDouble();
        System.out.print("Status member: ");
        statusMember = zaidan.next().toLowerCase();

        totalAwal = jumlahBarang * hargaSatuan;

        switch (kodeBarang) {
            case "A":
                jenisBarang = "Makanan";
                if (jumlahBarang >= 10) {
                    diskonJumlah = totalAwal * 0.15;
                } else if (jumlahBarang >= 5) {
                    diskonJumlah = totalAwal * 0.10;
                } else {
                    diskonJumlah = 0;
                }
                break;
            case "B":
                jenisBarang = "Minuman";

                if (jumlahBarang >= 10) {
                    diskonJumlah = totalAwal * 0.15;
                } else if (jumlahBarang >= 5) {
                    diskonJumlah = totalAwal * 0.10;
                } else {
                    diskonJumlah = 0;
                }
                break;
            case "C":
                jenisBarang = "Alat Tulis";

                if (jumlahBarang >= 10) {
                    diskonJumlah = totalAwal * 0.15;
                } else if (jumlahBarang >= 5) {
                    diskonJumlah = totalAwal * 0.10;
                } else {
                    diskonJumlah = 0;
                }
                break;

            default:
                jenisBarang = "Kode tidak valid";
                break;
        }

        if (kodeBarang.equals("A") || kodeBarang.equals("B") || kodeBarang.equals("C")) {
            if (statusMember.equals("ya") && totalAwal >= 100000) {
                diskonMember = (totalAwal - diskonJumlah) * 0.05;
            }
        }

        totalDiskon = diskonJumlah + diskonMember;
        totalBayar = totalAwal - totalDiskon;

        System.out.println();
        System.out.println("===== STRUK BELANJA =====");
        System.out.println("Nama         : " + namaPembeli);
        System.out.println("Jenis barang : " + jenisBarang);
        System.out.printf("Total awal   : Rp" + totalAwal);
        System.out.printf("Diskon       : Rp" + totalDiskon);
        System.out.printf("Total bayar  : Rp" + totalBayar);

        zaidan.close();
    }
}
