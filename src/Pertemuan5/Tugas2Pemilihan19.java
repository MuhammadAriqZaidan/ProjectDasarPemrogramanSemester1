package Pertemuan5;

import java.util.Scanner;

public class Tugas2Pemilihan19 {
    public static void main(String[] args) {
        Scanner zaidan = new Scanner(System.in);
        System.out.println("---Validasi Jumlah SKS---");
        System.out.print("Masukkan jumlah SKS anda: ");
        int sks = zaidan.nextInt();

        if(sks>24){
            System.out.println("SKS anda melebihi batas");
        } else{
            System.out.println("KRS Anda Valid");
        }
    }
}
