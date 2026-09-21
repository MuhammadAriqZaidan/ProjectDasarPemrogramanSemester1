package Pertemuan3;

import java.util.Scanner;

public class MencariJumlahCicilan19 {
    public static void main(String[] args) {
        Scanner zaidan = new Scanner(System.in);

        int hargaLaptop, uangMuka, jumlahBulan, sisaHarga;
        double bunga=0.02, jumlahCicilan, totalBunga, totalcicilan;

        System.out.print("Masukkan harga Laptop: ");
        hargaLaptop = zaidan.nextInt();

        System.out.print("Masukkan Uang muka: ");
        uangMuka = zaidan.nextInt();

        System.out.print("Masukkan berapa lama bulan akan dicicil: ");
        jumlahBulan = zaidan.nextInt();

        sisaHarga=hargaLaptop-uangMuka;
        totalBunga=sisaHarga*bunga;
        totalcicilan=sisaHarga/jumlahBulan;
        jumlahCicilan=totalcicilan+totalBunga;
        
        System.out.println("Jumlah cicilan yang harus anda bayar tiap bulan adalah: "+jumlahCicilan);
    }
}
