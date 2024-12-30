
import java.util.Scanner;

public class Kafe16 {

    public static int hitungTotalHarga16(int pilihanMenu, int banyakItem, String kodePromo) {
            int[] hargaItems = {15000,20000,22000,12000,10000,18000};
            int hargaTotal =hargaItems[pilihanMenu - 1] * banyakItem;
            

            if (kodePromo.equals("DISKON50")) {
                System.out.println("Selamat! Anda mendapatkan diskon 50%.");
                hargaTotal-= hargaTotal/2;
            } else if (kodePromo.equals("DISKON30")) {
                System.out.println("Selamat! Anda mendapatkan diskon 30%.");
                hargaTotal-= hargaTotal* 30/100;
            } else if (!kodePromo.equals("")) {
                System.out.println("Kode promo tidak valid.");
                }
        return hargaTotal;

        }
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
        System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian");
        }
        
      
        System.out.println("===== MENU RESTO KAFE =====");
        
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappuccino - Rp 20.000"); 
        System.out.println("3. Latte      - Rp 22.000");
        System.out.println("4. Teh Tarik  - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");       
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("===========================");       
        System.out.println("Silakan pilih menu yang Anda inginkan.");
        }
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);

            System.out.print("Masukkan nama pelanggan: ");
            String namaPelanggan = sc.nextLine();
    
            System.out.print("Apakah Anda member? (true/false): ");
            boolean isMember = sc.nextBoolean();
            
            sc.nextLine(); 
            
            System.out.print("Masukkan kode promo (kosongkan jika tidak ada): ");
            String kodePromo = sc.nextLine();

            Menu(namaPelanggan, isMember, kodePromo);

            int totalHarga = 0;
            boolean pilihMenuLagi = true;
    
            while (pilihMenuLagi) {
                System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
                int pilihanMenu = sc.nextInt();
                System.out.print("Masukkan jumlah item yang ingin dipesan: ");
                int banyakItem = sc.nextInt();
    
                totalHarga += hitungTotalHarga16(pilihanMenu, banyakItem, kodePromo);  
    
                System.out.print("\nApakah Anda ingin menambah pesanan lagi? (true/false): ");
                pilihMenuLagi = sc.nextBoolean();
                sc.nextLine(); 
            }
    
            System.out.println("Total keseluruhan harga untuk pesanan Anda: Rp " + totalHarga);
            sc.close();
        }


        }

       

           

