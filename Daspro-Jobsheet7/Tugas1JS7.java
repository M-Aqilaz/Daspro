import java.util.Scanner;

public class Tugas1JS7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalTiketTerjual = 0;
        double hargaTiket = 50000;
        double totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang akan dibeli (atau masukkan 0 untuk keluar): ");
            int tiket = sc.nextInt();

            if (tiket == 0) {
                break;
            }

            if (tiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan coba lagi.");
                continue;
            }

            double totalHarga = tiket * hargaTiket;

            if (tiket > 10) {
                totalHarga *= 0.85; 
            } else if (tiket > 4) {
                totalHarga *= 0.90; 
            }

            totalTiketTerjual += tiket;
            totalPenjualan += totalHarga;

            System.out.println("Total yang harus dibayarkan: Rp " + totalHarga);
        }

        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total penjualan tiket: Rp " + totalPenjualan);

    }
}
