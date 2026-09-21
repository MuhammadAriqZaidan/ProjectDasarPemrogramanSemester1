package Pertemuan3;



public class ContohOperator19 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("X++ = " + x++);
        System.out.println("Setelah evaluasi, X = " + x);
        x= 10;
        System.out.println("++X = " + ++x);
        System.out.println("Setelah evaluasi, X = " + x);
        int y = 12;
        System.out.println(x > y || y == x && y <=x);
        int z = x ^ y;
        System.out.println("Hasil x ^ y adalah " + z);
        z%= 2;
        System.out.println("hasil akhir " +z);
    }
}
