//Nomor Absen=19. Harga1=4500, Harga2=6500, Harga3=16500, B=18, S=55
//19%4=3

package UTSSemester1;

import java.util.Scanner;

public class quizAriq19 {
    public static void main(String[] args) {
        Scanner zaidan = new Scanner(System.in);
        int kodeFoto, B = 18, S = 55, jumlahLembar, harga1 = 4500, harga2 = 6500, harga3 = 16500, hargaB, hargaDasar;
        double hargaKilat, hargaTotal, tambahan;
        boolean layananKilat;

        System.out.println("Masukkan jumlah lembar yang akan anda print: ");
        jumlahLembar = zaidan.nextInt();
        System.out.println("Masukkan kode foto yang akan anda print (Kode 1 = 4R, Kode 2 = 5R, Kode 3 = 10R)");
        kodeFoto = zaidan.nextInt();
        System.out.println("Apakah anda mau memilih layanan kilat? (TRUE/FALSE): ");
        layananKilat = zaidan.nextBoolean();

        if (jumlahLembar >= 1 && jumlahLembar <= 100) {

            switch (kodeFoto) {
                case 1:
                    if (jumlahLembar > B) {
                        hargaB = (jumlahLembar - B) * 500;
                    } else {
                        hargaB = 0;
                    }
                    hargaDasar = harga1 + hargaB;
                    // layanan kilat
                    if (layananKilat) {
                        if (jumlahLembar <= S) {
                            hargaKilat = hargaDasar + (hargaDasar * 0.25);
                        } else {
                            hargaKilat = 0;
                        }
                    } else {
                        hargaKilat = 0;
                    }
                    hargaTotal = hargaDasar + hargaKilat;
                    tambahan = hargaB + hargaKilat;

                    if (layananKilat) {
                        System.out.println("Layanan: Layanan Kilat");
                    } else {
                        System.out.println("Layanan: Tidak ada layanan dipilih");
                    }
                    System.out.println("Biaya dasar: " + hargaDasar);
                    System.out.println("Tambahan: " + tambahan);
                    System.out.println("Total bayar: " + hargaTotal);
                    break;
                case 2:
                    if (jumlahLembar > B) {
                        hargaB = (jumlahLembar - B) * 500;
                    } else {
                        hargaB = 0;
                    }
                    hargaDasar = harga2 + hargaB;
                    // layanan kilat
                    if (layananKilat) {
                        if (jumlahLembar <= S) {
                            hargaKilat = hargaDasar + (hargaDasar * 0.25);
                        } else {
                            hargaKilat = 0;
                        }
                    } else {
                        hargaKilat = 0;
                    }
                    hargaTotal = hargaDasar + hargaKilat;
                    tambahan = hargaB + hargaKilat;

                    if (layananKilat) {
                        System.out.println("Layanan: Layanan Kilat");
                    } else {
                        System.out.println("Layanan: Tidak ada layanan dipilih");
                    }
                    System.out.println("Biaya dasar: " + hargaDasar);
                    System.out.println("Tambahan: " + tambahan);
                    System.out.println("Total bayar: " + hargaTotal);
                    break;
                case 3:
                    if (jumlahLembar > B) {
                        hargaB = (jumlahLembar - B) * 500;
                    } else {
                        hargaB = 0;
                    }
                    hargaDasar = harga3 + hargaB;
                    // layanan kilat
                    if (layananKilat) {
                        if (jumlahLembar <= S) {
                            hargaKilat = hargaDasar + (hargaDasar * 0.25);
                        } else {
                            hargaKilat = 0;
                        }
                    } else {
                        hargaKilat = 0;
                    }
                    hargaTotal = hargaDasar + hargaKilat;
                    tambahan = hargaB + hargaKilat;

                    if (layananKilat) {
                        System.out.println("Layanan: Layanan Kilat");
                    } else {
                        System.out.println("Layanan: Tidak ada layanan dipilih");
                    }
                    System.out.println("Biaya dasar: " + hargaDasar);
                    System.out.println("Tambahan: " + tambahan);
                    System.out.println("Total bayar: " + hargaTotal);
                    break;
                default:
                    System.out.println("Kode tidak dikenal");
                    break;
            }
        } else {
            System.out.println("Input tidak valid");
        }
    }
}
// HASIL TEST CODE
// Masukkan jumlah lembar yang akan anda print: 
// 17
// Masukkan kode foto yang akan anda print (Kode 1 = 4R, Kode 2 = 5R, Kode 3 = 10R)
// 1
// Apakah anda mau memilih layanan kilat? (TRUE/FALSE): 
// TRUE
// Layanan: Layanan Kilat
// Biaya dasar: 4500
// Tambahan: 5625.0
// Total bayar: 10125.0