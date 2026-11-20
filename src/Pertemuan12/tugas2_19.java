package Pertemuan12;

import java.util.Scanner;

public class tugas2_19 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
            
            int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};
            
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
            }
            
            System.out.print("\nCari nama menu untuk cek ketersediaan & harga: ");
            String cariMenu = input.nextLine();
            int indeksCari = -1;
            
            for (int i = 0; i < menu.length; i++) {
                if (menu[i].equalsIgnoreCase(cariMenu)) {
                    indeksCari = i;
                    break;
                }
            }
            
            if (indeksCari != -1) {
                System.out.println("Menu tersedia: " + menu[indeksCari] + " | Harga: Rp " + harga[indeksCari]);
            } else {
                System.out.println("Maaf, menu \"" + cariMenu + "\" tidak tersedia.");
            }
            
            System.out.print("\nMasukkan jumlah item yang ingin dipesan: ");
            int jmlPesan = input.nextInt();
            input.nextLine();
            
            String[] daftarPesanan = new String[jmlPesan];
            int[] hargaPesanan = new int[jmlPesan];
            int totalBiaya = 0;
            
            for (int i = 0; i < jmlPesan; i++) {
                boolean valid = false;
                while (!valid) {
                    System.out.print("Masukkan nama menu pesanan ke-" + (i + 1) + ": ");
                    String namaPesan = input.nextLine();
                    
                    int indeksMenu = -1;
                    for (int j = 0; j < menu.length; j++) {
                        if (menu[j].equalsIgnoreCase(namaPesan)) {
                            indeksMenu = j;
                            break;
                        }
                    }
                    
                    if (indeksMenu != -1) {
                        daftarPesanan[i] = menu[indeksMenu];
                        hargaPesanan[i] = harga[indeksMenu];
                        totalBiaya += harga[indeksMenu];
                        valid = true;
                    } else {
                        System.out.println("Menu tidak ditemukan! Silakan masukkan nama menu sesuai daftar.");
                    }
                }
            }
            
            System.out.println("\n=== STRUK PESANAN KAFE KAMPUS ===");
            for (int i = 0; i < daftarPesanan.length; i++) {
                System.out.println((i + 1) + ". " + daftarPesanan[i] + "\t: Rp " + hargaPesanan[i]);
            }

            System.out.println("---------------------------------");
            System.out.println("Total Biaya\t: Rp " + totalBiaya);
        }
    }
