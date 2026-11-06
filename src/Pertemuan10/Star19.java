package Pertemuan10;

import java.util.Scanner;
public class Star19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

        System.out.println();
        sc.close();
    }
}
