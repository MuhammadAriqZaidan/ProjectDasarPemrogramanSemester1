package TugasMatdas;
import java.util.Scanner;

public class tugasmtkariq {

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Masukkan nilai Mahasiswa: ");
        double nilai = inputScanner.nextDouble();

        System.out.println("Masukkan persentase kehadiran: ");
        double kehadiran = inputScanner.nextDouble();

        boolean p = nilai >= 60;
        boolean q = kehadiran >= 80;
        boolean lulus = p && q;

        if (lulus) {
            System.out.println("Mahasiswa lulus!");
        } else {
            System.out.println("Mahasiswa tidak lulus");
        }

        //Hukum DeMorgan

        boolean tidakLulus = !p && !q;

        if (tidakLulus) {
            System.out.println("Mahasiswa tidak lulus! (Versi DeMorgan)");
        } else {
            System.out.println("Mahasiswa lulus! (Versi DeMorgan)");
        }

        inputScanner.close();
    }
}
