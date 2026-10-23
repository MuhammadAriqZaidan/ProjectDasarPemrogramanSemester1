package PersiapanUTS;
import java.util.Scanner;


public class SistemKelulusanAriq {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, status;
        double matematika, inggris;

        // ===== INPUT =====
        System.out.print("Nama mahasiswa: ");
        nama = input.nextLine();

        System.out.print("Nilai matematika: ");
        matematika = input.nextDouble();

        System.out.print("Nilai bahasa Inggris: ");
        inggris = input.nextDouble();

        // ===== PROSES NESTED IF =====
        if (matematika >= 70) {
            if (inggris >= 70) {
                status = "LOLOS";
            } else {
                status = "TIDAK LOLOS: Nilai Inggris kurang";
            }
        } else {
            if (inggris >= 70) {
                status = "TIDAK LOLOS: Nilai Matematika kurang";
            } else {
                status = "TIDAK LOLOS: Kedua nilai kurang";
            }
        }

        // ===== OUTPUT =====
        System.out.println("\n===== HASIL KELULUSAN =====");
        System.out.println("Nama              : " + nama);
        System.out.println("Nilai Matematika  : " + matematika);
        System.out.println("Nilai Inggris     : " + inggris);
        System.out.println("Status            : " + status);

        input.close();
    }


}
