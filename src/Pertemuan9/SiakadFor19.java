package Pertemuan9;
import java.util.Scanner;
// P (ABSEN): 19
// Jumlah mahasiswa (batas perulangan FOR) = 8 + (P mod 5) → gantikan angka 10 pada soal
// 8 + (19 % 5) = 12
// Batas kelulusan pada Pertanyaan no. 4 (modifikasi kode) = 55 + (P mod 11) → gantikan
// angka 60 pada soal
// 55 + (19 % 11) = 63

public class SiakadFor19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int jmlMahasiswaLulus = 0, jmlMahasiswaTidakLulus = 0;

        for (int i = 1; i <= 12; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 63) {
                jmlMahasiswaLulus++;
            } else {
                jmlMahasiswaTidakLulus++;
            }
        }
        System.out.println("Nilai tertinggi :" + tertinggi);
        System.out.println("Nilai terendah :" + terendah);
        System.out.println("Jumlah mahasiswa yang lulus :" + jmlMahasiswaLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus :" + jmlMahasiswaTidakLulus);

    }
}
