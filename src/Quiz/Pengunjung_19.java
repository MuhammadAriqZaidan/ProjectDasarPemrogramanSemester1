// Nomor Absen = 19 (P=19)
package Quiz;

import java.util.Scanner;

public class Pengunjung_19 {
    public static void main(String[] args) {
        Scanner zaidan = new Scanner(System.in);

        int toko, jumlahPengunjung = 0, jumlahToko = 1, jumlahBerkembang = 0, jumlahtdkBerkembang = 0, hariNaik = 0;
        String namaToko, tambahToko;

        do {
            System.out.println("Tambah toko? (y/t) :");
            tambahToko = zaidan.nextLine();
            if (tambahToko.equalsIgnoreCase("t")) {
                break;
            }
            jumlahToko++;
            System.out.println("Nama toko: ");
            namaToko = zaidan.nextLine();

            for (int i = 1; i <= 5; i++) {
                System.out.print("Pengunjung hari " + i + ":");
                jumlahPengunjung = zaidan.nextInt();
                do {
                    if (jumlahPengunjung < 0) {
                        System.out.println("Data tidak valid, ulangi!");
                        System.out.print("Pengunjung hari " + i + ":");
                        jumlahPengunjung = zaidan.nextInt();

                        hariNaik += jumlahPengunjung;
                    }
                } while (jumlahPengunjung < 0);
            }
            System.out.print("Hari naik :");
            hariNaik = zaidan.nextInt();
            if (hariNaik >= 3) {
                System.out.println("Status : BERKEMBANG");
                jumlahBerkembang++;
            } else {
                System.out.println("Status : TIDAK BERKEMBANG");
                jumlahtdkBerkembang++;
            }
        } while (tambahToko.equalsIgnoreCase("y"));

        System.out.println("====HASIL REKAP TOKO====");
        System.out.println("Jumlah Toko = " + jumlahToko);
        System.out.println("Jumlah Berkembang = " + jumlahBerkembang);
        System.out.println("Jumlah Tidak Berkembang = " + jumlahtdkBerkembang);

    }

}
