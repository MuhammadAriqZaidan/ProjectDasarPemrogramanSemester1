package praktikumdaspro;

import java.util.Scanner;

public class RentalPS11 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner (System.in);

        double lamajambermain;
        double sisamenit;
        double totalbiaya;
        double jampenuh;

        System.out.println("masukkan lama jam bermain: ");
        lamajambermain = Diego.nextInt();

        System.out.println("masukkan sisa menit: ");
        sisamenit = Diego.nextInt();

        jampenuh = lamajambermain * 7000 + 150 * sisamenit;
        totalbiaya = 0.125 * jampenuh;

        System.out.println("jadi total yang harus anda bayar sebelum potongan adalah:" + jampenuh);
        System.out.println("jadi total yang harus anda bayar setelah potongan adalah:" + totalbiaya);

    Diego.close();

    }   
}
