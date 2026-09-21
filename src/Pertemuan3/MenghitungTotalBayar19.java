package Pertemuan3;
import java.util.Scanner;

public class MenghitungTotalBayar19 {
    public static void main(String[] args) {
        Scanner zaidan = new Scanner(System.in);

        double harga;
        double potongan;
        double jml_bayar;
        double diskon = 0.15;

        System.out.print("Masukkan harga: ");
        harga=zaidan.nextInt();

        potongan=diskon*harga;
        jml_bayar=harga-potongan;
        System.out.println("Jumlah yang harus anda bayar adalah: " +jml_bayar);
        
    }
}
