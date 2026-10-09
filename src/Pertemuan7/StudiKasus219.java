package Pertemuan7;

import java.util.Scanner;

public class StudiKasus219 {
    public static void main(String[] args) {
        Scanner zaidan = new Scanner(System.in);

        String namaMahasiswa;
        String jenisKegiatan;
        int jumlahDokumen, peringkatJuara, statusPendanaanPKM, kekuranganDokumen;

        System.out.print("Masukkan nama Mahasiswa: ");
        namaMahasiswa = zaidan.nextLine();
        System.out.print("Masukkan jenis kegiatan yang akan diikuti (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya): ");
        jenisKegiatan = zaidan.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("belmawa") || jenisKegiatan.equalsIgnoreCase("bakorma")
                || jenisKegiatan.equalsIgnoreCase("mandiri")) {
            System.out.println("Masukkan peringkat juara anda (Angka 1, 2, atau 3; isi 0 jika bukan juara): ");
            peringkatJuara = zaidan.nextInt();
            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                System.out.println("Masukkan jumlah dokumen yang sudah anda upload (0-4): ");
                jumlahDokumen = zaidan.nextInt();
                if (jumlahDokumen == 4) {
                    System.out.println("Dana penghargaan akan diberikan");
                    System.out.println("Alasan: semua syarat terpenuhi; Juara 1-3 serta kelengkapan 4 dokumen");
                } else {
                    kekuranganDokumen = jumlahDokumen - 4;
                    System.out.println("Dana penghargaan tidak akan diberikan");
                    System.out
                            .println("Alasan: salah satu syarat tidak terpenuhi; jumlah dokumen tidak lengkap, kurang "
                                    + kekuranganDokumen + " dokumen");
                }
            } else {
                System.out.println("Dana penghargaan tidak akan diberikan");
                System.out
                        .println(
                                "Alasan: salah satu syarat tidak terpenuhi; Peringkat juara tidak memenuhi syarat, bukan juara 1, 2 atau 3");
            }
        } else if (jenisKegiatan.equalsIgnoreCase("pkm")) {
            System.out.println("Masukkan status pendanaan PKM anda (1= lolos, 0= tidak lolos)");
            statusPendanaanPKM = zaidan.nextInt();

            if (statusPendanaanPKM == 1) {
                System.out.println("Masukkan jumlah dokumen yang sudah anda upload (0-4): ");
                jumlahDokumen = zaidan.nextInt();
                if (jumlahDokumen == 4) {
                    System.out.println("Dana penghargaan akan diberikan");
                    System.out.println(
                            "Alasan: semua syarat terpenuhi; Lolos status pendanaan PKM serta kelengkapan 4 dokumen");
                } else {
                    kekuranganDokumen = jumlahDokumen - 4;
                    System.out.println("Dana penghargaan tidak akan diberikan");
                    System.out
                            .println("Alasan: salah satu syarat tidak terpenuhi; jumlah dokumen tidak lengkap, kurang "
                                    + kekuranganDokumen + " dokumen");
                }
            } else {
                System.out.println("Dana penghargaan tidak akan diberikan");
                System.out
                        .println(
                                "Alasan: salah satu syarat tidak terpenuhi; PKM tidak lolos pendanaan");
            }

        } else {
            System.out.println("Dana penghargaan tidak akan diberikan");
            System.out
                    .println(
                            "Alasan: Jenis kegiatan ini tidak memperoleh dana penghargaan");
        }
        zaidan.close();
    }

}
