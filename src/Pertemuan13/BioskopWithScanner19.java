package Pertemuan13;

import java.util.Scanner;

public class BioskopWithScanner19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("1. Input  2. Tampilkan  3. Exit\nPilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Kursi tidak tersedia!");
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Peringatan: kursi sudah terisi!");
                        } else {
                            break;
                        }
                    }

                    penonton[baris - 1][kolom - 1] = nama;

                    System.out.print("Input penonton lainnya? (y/n): ");
                    pilihan = sc.nextLine();
                    
                    if (pilihan.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (menu == 2) {
                for (int i = 0; i < penonton.length; i++) {
                    System.out.println(String.join(", ", penonton[i]));
                }
            } else if (menu == 3) {
                break;
            }
        }
    }
}
