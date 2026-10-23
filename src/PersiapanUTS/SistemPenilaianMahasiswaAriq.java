package PersiapanUTS;

import java.util.Scanner;

public class SistemPenilaianMahasiswaAriq {
    public static void main(String[] args) {
        Scanner zaidan = new Scanner(System.in);
        char kategori;
        String namaMahasiswa, NIM, status;
        double nilaiTugas, nilaiUTS, nilaiUAS, nilaiTugasAkhir, nilaiUTSAkhir, nilaiUASAkhir, nilaiFinal;

        System.out.println("===== SISTEM PENILAIAN MAHASISWA =====");
        System.out.print("Masukkan nama :");
        namaMahasiswa = zaidan.nextLine();
        System.out.print("Masukkan NIM :");
        NIM = zaidan.next();

        System.out.print("Masukkan nilai tugas :");
        nilaiTugas = zaidan.nextDouble();
        System.out.print("Masukkan nilai UTS :");
        nilaiUTS = zaidan.nextDouble();
        System.out.print("Masukkan nilai UAS :");
        nilaiUAS = zaidan.nextDouble();

        nilaiTugasAkhir = nilaiTugas * 0.30;
        nilaiUTSAkhir = nilaiUTS * 0.30;
        nilaiUASAkhir = nilaiUAS * 0.40;
        nilaiFinal = nilaiTugasAkhir + nilaiUTSAkhir + nilaiUASAkhir;

        if (nilaiFinal >= 85 && nilaiFinal <= 100) {
            kategori = 'A';
        } else if (nilaiFinal >= 75) {
            kategori = 'B';
        } else if (nilaiFinal >= 60) {
            kategori = 'C';
        } else {
            kategori = 'D';
        }

        switch (kategori) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                if (nilaiFinal >= 60) {
                    status = "LULUS";
                } else {
                    status = "TIDAK LULUS";
                }
                break;
            default:
                status = "Kode tidak valid";
                break;
        }

        System.out.println("===== HASIL PENILAIAN =====");
        System.out.println("Nama :" + namaMahasiswa);
        System.out.println("NIM :" + NIM);
        System.out.println("Nilai Akhir: " + nilaiFinal);
        System.out.println("Kategori: " + kategori);
        System.out.println("Status :" + status);

        zaidan.close();

    }
}
