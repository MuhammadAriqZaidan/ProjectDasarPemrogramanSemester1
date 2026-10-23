package LatihanPraktikum;
import java.util.Scanner;
public class latihan1 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner (System.in);
        int waktu;
        int kecepatan;
        int jarak;

        System.out.println("waktu: ");
        waktu = Diego.nextInt();

        System.out.println("kecepatan: ");
        kecepatan = Diego.nextInt();

        jarak = kecepatan * waktu;

    System.out.println("jadi jarak yang harus anda tempuh adalah:" + jarak);
    
    Diego.close();
        
    }
    
}
