import java.util.Scanner;

public class Pemilihan2Percobaan216soal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihanMenu, jumlahBeli;
        double harga = 0, diskon = 0, totalBayar = 0, totalAkhir;
        String member, caraBayar;

        // Tampilkan menu
        System.out.println("-------------------------");
        System.out.println("===== MENU CAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Rice Bowl - Rp 14.000");
        System.out.println("2. Ice Tea - Rp 3.000");
        System.out.println("3. Paket Bundling (Rice Bowl + Ice Tea) - Rp 15.000");
        System.out.println("----------------------------------------");
        System.out.print("Masukkan Angka dari menu yang dipilih: ");

        // Baca pilihan menu
        pilihanMenu = input.nextInt();
        input.nextLine(); // Bersihkan newline yang tersisa

        System.out.print("Apakah Punya Member (y/n): ");
        member = input.nextLine();

        System.out.print("Masukkan Jumlah Beli: ");
        jumlahBeli = input.nextInt();
        input.nextLine(); // Bersihkan newline yang tersisa setelah nextInt()

        System.out.println("----------------------------------------");

        // Menentukan harga berdasarkan pilihan menu
        if (pilihanMenu == 1) {
            harga = 14000;
            System.out.println("Harga Rice Bowl: Rp " + harga);
        } else if (pilihanMenu == 2) {
            harga = 3000;
            System.out.println("Harga Ice Tea: Rp " + harga);
        } else if (pilihanMenu == 3) {
            harga = 15000;
            System.out.println("Harga Bundling: Rp " + harga);
        } else {
            System.out.println("Masukkan Pilihan Menu dengan benar");
            return; 
        }

        // Menghitung total pembayaran berdasarkan status keanggotaan
        if (member.equals("y")) {
            diskon = 0.10; 
            System.out.println("Besar diskon = 10%");
            totalBayar = (harga * jumlahBeli) * (1 - diskon);
            System.out.println("Total Bayar Setelah Diskon: Rp " + totalBayar);
        } else if (member.equals("n")) {
            totalBayar = harga * jumlahBeli; 
            System.out.println("Total Bayar: Rp " + totalBayar);
        } else {
            System.out.println("Input Member Tidak Valid");
            return; // Keluar jika input tidak valid
        }

        System.out.println("----------------------------------------");

        // Metode pembayaran
        System.out.print("Masukkan metode pembayaran anda (QRIS/Cash): ");
        caraBayar = input.nextLine(); // Baca input cara bayar

        // Menangani pembayaran
        if (caraBayar.equals("QRIS")) {
            totalAkhir = totalBayar - 1000; // Diskon untuk pembayaran QRIS
            System.out.println("Total pembayaran anda adalah: Rp " + totalAkhir);
        } else if (caraBayar.equals("Cash")) {
            System.out.println("Total pembayaran anda adalah: Rp " + totalBayar);
        } else {
            System.out.println("Metode pembayaran tidak valid");
        }

        input.close(); // Tutup scanner
    }
}
