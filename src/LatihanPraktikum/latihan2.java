package LatihanPraktikum;

import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);
        
        int hargasepedamotor;
        int uangmuka;
        int jml_bulan;
        double sisaharga;
        double cicilanperbulan;
        double bungaperbulan;
        double totalcicilanperbulan;

        System.out.println("harga sepeda motor: ");
        hargasepedamotor = Diego.nextInt();

        System.out.println("uang muka yang telah dibayar: ");
        uangmuka = Diego.nextInt();

        System.out.println("jumlah bulan: ");
        jml_bulan = Diego.nextInt();

        sisaharga = hargasepedamotor - uangmuka;
        cicilanperbulan = sisaharga / jml_bulan;
        bungaperbulan = 0.15 * sisaharga;
        totalcicilanperbulan = cicilanperbulan + bungaperbulan;

        System.out.println("jadi total yang harus anda bayar perbulan adalah RP: " + totalcicilanperbulan);
        Diego.close();
    }   
    
}
