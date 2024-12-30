import java.util.Scanner;

public class Pemilihan2Percobaan216 {

    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);
        int pilihan_menu, jumlah_beli;
        double harga = 0, diskon = 0, total_bayar;
        String member;

        System.out.println("-------------------------");
        System.out.println("===== MENU CAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Rice Bowl - Rp 14.000");
        System.out.println("2. Ice Tea - Rp 3.000");
        System.out.println("3. Paket Bundling (Rice Bowl + Ice Tea) - Rp 15.000");
        System.out.println("----------------------------------------");
        System.out.print("Masukkan Angka dari menu yang dipilih: ");

        // Baca pilihan menu
        pilihan_menu = input16.nextInt();
        input16.nextLine(); // Bersihkan newline yang tersisa

        System.out.print("Apakah Punya Member (y/n): ");
        member = input16.nextLine();

        System.out.print("Masukkan Jumlah Beli: ");
        jumlah_beli=input16.nextInt();

        System.out.println("----------------------------------------");

        // Menentukan harga berdasarkan pilihan menu
        if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga Rice Bowl: Rp " + harga);
        } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("Harga Ice Tea: Rp " + harga);
        } else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Harga Bundling: Rp " + harga);
        } else {
            System.out.println("Masukkan Pilihan Menu dengan benar");
            return; 
        }

        // Menghitung total pembayaran berdasarkan status keanggotaan
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10; 
            System.out.println("Besar diskon = 10%");

            total_bayar = (harga * jumlah_beli) - ((harga * jumlah_beli) * diskon);
            System.out.println("Total Bayar Setelah Diskon: Rp " + total_bayar);

        } else if (member.equalsIgnoreCase("n")) {
            total_bayar = harga*jumlah_beli; 
            System.out.println("Total Bayar: Rp " + total_bayar);

        } else {
            System.out.println("Input Member Tidak Valid");
        }

        System.out.println("----------------------------------------");
    }
}
