package LatihanPraktikum;

import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner Zaidan = new Scanner(System.in);
        
        int hargasepedamotor;
        int uangmuka;
        int jml_bulan;
        double sisaharga;
        double cicilanperbulan;
        double bungaperbulan;
        double totalcicilanperbulan;

        System.out.println("harga sepeda motor: ");
        hargasepedamotor = Zaidan.nextInt();

        System.out.println("uang muka yang telah dibayar: ");
        uangmuka = Zaidan.nextInt();

        System.out.println("jumlah bulan: ");
        jml_bulan = Zaidan.nextInt();

        sisaharga = hargasepedamotor - uangmuka;
        cicilanperbulan = sisaharga / jml_bulan;
        bungaperbulan = 0.15 * sisaharga;
        totalcicilanperbulan = cicilanperbulan + bungaperbulan;

        System.out.println("jadi total yang harus anda bayar perbulan adalah RP: " + totalcicilanperbulan);
        Zaidan.close();
    }   
    
}
