package Pertemuan12;

import java.util.Scanner;

public class tugas1_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Banyaknya nilai harus lebih dari 0");
            return;
        }

        int[] nilai = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ":");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }

        double rata = (double) total / n;

        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < n; i++) {
            if (nilai[i] > tertinggi)
                tertinggi = nilai[i];
            if (nilai[i] < terendah)
                terendah = nilai[i];
        }

        System.out.println();
        System.out.println("=== DAFTAR NILAI ===");
        for (int i = 0; i < n; i++) {
            String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }

        System.out.println();
        System.out.println("Total nilai    : " + total);
        System.out.printf("Rata-rata      : %.2f%n", rata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);

    }
}
