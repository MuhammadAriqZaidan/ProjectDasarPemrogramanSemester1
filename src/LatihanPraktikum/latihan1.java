package LatihanPraktikum;
import java.util.Scanner;
public class latihan1 {
    public static void main(String[] args) {
        Scanner Zaidan = new Scanner (System.in);
        int waktu;
        int kecepatan;
        int jarak;

        System.out.println("waktu: ");
        waktu = Zaidan.nextInt();

        System.out.println("kecepatan: ");
        kecepatan = Zaidan.nextInt();

        jarak = kecepatan * waktu;

    System.out.println("jadi jarak yang harus anda tempuh adalah:" + jarak);
    
    Zaidan.close();
        
    }
    
}
