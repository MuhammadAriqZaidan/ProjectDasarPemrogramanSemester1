package Pertemuan12;

import java.util.Scanner;

public class SearchNilai19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Banyak elemen: ");
        int n = input.nextInt();
        int[] nilai = new int[n];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        System.out.print("Nilai yang dicari: ");
        int key = input.nextInt();
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai yang dicari tidak ditemukan: " + key
                    + " tidak ada di antara " + nilai.length + " data nilai.");
        }
    }
}
