package Pertemuan13;

import java.util.Scanner;

public class TugasMandiri19 {
    public static void main(String[] args) {
        Scanner Zaidan = new Scanner(System.in);

        int[][] survey = new int[10][6];

        System.out.println("=== INPUT DATA SURVEI KEPUASAN PELANGGAN ===");
        System.out.println("Masukkan nilai (1-5) untuk setiap pertanyaan:\n");

        for (int i = 0; i < 10; i++) {
            System.out.println("Responden ke-" + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                System.out.print("  Pertanyaan " + (j + 1) + " : ");
                survey[i][j] = Zaidan.nextInt();

                while (survey[i][j] < 1 || survey[i][j] > 5) {
                    System.out.print("  Nilai harus 1-5! Ulangi: ");
                    survey[i][j] = Zaidan.nextInt();
                }
            }
            System.out.println();
        }

        System.out.println("\n=== RATA-RATA SETIAP RESPONDEN ===");
        for (int i = 0; i < 10; i++) {
            double total = 0;
            for (int j = 0; j < 6; j++) {
                total += survey[i][j];
            }
            double rata = total / 6.0;
            System.out.printf("Responden %2d : %.2f\n", (i + 1), rata);
        }

        System.out.println("\n=== RATA-RATA SETIAP PERTANYAAN ===");
        for (int j = 0; j < 6; j++) {
            double total = 0;
            for (int i = 0; i < 10; i++) {
                total += survey[i][j];
            }
            double rata = total / 10.0;
            System.out.printf("Pertanyaan %d : %.2f\n", (j + 1), rata);
        }

        System.out.println("\n=== RATA-RATA KESELURUHAN ===");
        double totalAll = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalAll += survey[i][j];
            }
        }
        double rataAll = totalAll / 60.0;
        System.out.printf("Rata-rata keseluruhan : %.2f\n", rataAll);

        Zaidan.close();
    }
}