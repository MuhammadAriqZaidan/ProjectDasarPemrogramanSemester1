package Pertemuan2;

import java.util.Scanner;

public class StudiKasusSatu19 {

    public static void main(String[] args) {
        Scanner zaidan = new Scanner(System.in);

        int gajiPokok, jumlahAnak, besarTunjangan, totalTunjangan;
        double totalPotongan, gajiBersih, potonganPensiun = 0.10;

        System.out.print("Masukkan Gaji Pokok: ");
        gajiPokok = zaidan.nextInt();

        System.out.print("Masukkan Jumlah Anak: ");
        jumlahAnak = zaidan.nextInt();

        System.out.print("Masukkan Besar Tunjangan: ");
        besarTunjangan = zaidan.nextInt();

        totalTunjangan = besarTunjangan * jumlahAnak;
        totalPotongan = gajiPokok * potonganPensiun;
        gajiBersih = gajiPokok - totalPotongan + totalTunjangan;

        System.out.println("Gaji bersih anda adalah: " + gajiBersih);

    }

}
