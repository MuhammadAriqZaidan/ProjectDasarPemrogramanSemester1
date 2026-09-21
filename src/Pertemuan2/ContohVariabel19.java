package Pertemuan2;

public class ContohVariabel19 {

    public static void main(String[] args) {
        String hobbySaya = "Bermain petak umpet";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umurSayaSekarang = 20;
        double ipk = 3.24, tinggi = 1.78;
        System.out.println(hobbySaya);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
        //String.format ini, atau printf, gunanya untuk memanggil variable tanpa haru mengunakan tanda +, bisa langsung dipanggil sesuai urutan dengan simbol %S
    }
}
