package Pertemuan6;

import java.util.Scanner;

public class tugas1DiskonBuku19 {
    public static void main(String[] args) {
        Scanner zaidan = new Scanner(System.in);

        int P = 19; //Nomor Absen
        double diskon;
        String jenisBuku;
        int jumlahBuku;

        System.out.print("Masukkan jenis buku yang anda akan beli(kamus/novel/lain): ");
        jenisBuku = zaidan.nextLine().toLowerCase();

        System.out.print("Masukkan jumlah buku yang anda beli: ");
        jumlahBuku = zaidan.nextInt();

        if (jenisBuku.equals("kamus")) {
            diskon = 8 + (P % 5);
            if(jumlahBuku > (2+(P % 2))){
                diskon +=2;
            }
        } else {
            if (jenisBuku.equals("novel")) {
                diskon = 5 + (P % 4);

                if (jumlahBuku > (3+ (P % 2))) {
                    diskon +=2;
                } else {
                    diskon +=1;
                }
            } else {
                if (jumlahBuku > (3+(P % 2))) {
                    diskon = 3 + (P % 4);
                } else {
                    diskon = 0;
                }
            }
        }
        System.out.println("Jenis buku yang anda beli adalah: " +jenisBuku);
        System.out.println("Jumlah buku yang anda beli adalah: " +jumlahBuku);
        System.out.println("Diskon yang anda dapatkan adalah: " +diskon+ "%");

        zaidan.close();
    }
}
