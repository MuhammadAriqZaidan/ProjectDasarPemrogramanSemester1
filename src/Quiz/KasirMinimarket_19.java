package Quiz;

import java.util.Scanner;

public class KasirMinimarket_19{
    public static void main(String[] args) {
        Scanner zaidan = new Scanner(System.in);
        int totalBelanja, uangYangDibayarkan, kembalian, lembarLimaRibu, sisaDiBawahLimaRibu;
        double persenKembalian;

        System.out.println("Masukkan total belanja anda: ");
        totalBelanja = zaidan.nextInt();
        System.out.println("Masukkan uang yang anda bayarkan: ");
        uangYangDibayarkan = zaidan.nextInt();

        kembalian = uangYangDibayarkan - totalBelanja;
        lembarLimaRibu = kembalian / 5000;
        sisaDiBawahLimaRibu = kembalian % 5000;
        //mencari persentase
        persenKembalian = (double)kembalian / (double)uangYangDibayarkan * 100;

        System.out.println("Sisa kembalian anda adalah: " +kembalian);
        System.out.println("Jumlah lembar 5.000 yang anda akan dapatkan adalah: " +lembarLimaRibu);
        System.out.println("Jumlah kembalian uang sisa dibawah 5.000 adalah: " +sisaDiBawahLimaRibu);
        System.out.println("Jumlah uang kembalian dalam persen adalah: " + persenKembalian + "%");
    }
}

// Masukkan total belanja anda: 
// 33000
// Masukkan uang yang anda bayarkan: 
// 50000
// Sisa kembalian anda adalah: 17000
// Jumlah lembar 5.000 yang anda akan dapatkan adalah: 3
// Jumlah kembalian uang sisa dibawah 5.000 adalah: 2000
// Jumlah uang kembalian dalam persen adalah: 17.0%