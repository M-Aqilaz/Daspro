import java.util.Scanner;

public class kuis2 {

    public static void main(String[] args) {
        // Data penjualan tiket per studio untuk setiap hari dalam seminggu
        int[][] penjualan = {
            {15, 7, 16, 7, 9, 20, 16},  // Reguler
            {8, 10, 14, 9, 12, 16, 14},  // Dolby Atmos
            {9, 4, 13, 11, 8, 9, 29},   // IMAX
            {8, 14, 10, 6, 15, 12, 10}   // Premiere
        };

        // Harga tiket per studio, weekday dan weekend
        int[][] hargaTiket = {
            {30000, 40000}, // Reguler: weekday, weekend
            {50000, 50000}, // Dolby Atmos: weekday, weekend
            {50000, 75000}, // IMAX: weekday, weekend
            {60000, 150000} // Premiere: weekday, weekend
        };

        // Nama studio
        String[] studio = {"Reguler", "Dolby Atmos", "IMAX", "Premiere"};
        
        // Nama hari
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

        // a. Banyaknya tiket yang terjual setiap hari
        int[] totalPerHari = new int[7];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                totalPerHari[j] += penjualan[i][j];
            }
        }

        // b. Rata-rata penjualan tiket dalam satu hari
        double[] rataRata = new double[7];
        for (int j = 0; j < 7; j++) {
            int totalTiket = 0;
            for (int i = 0; i < 4; i++) {
                totalTiket += penjualan[i][j];
            }
            rataRata[j] = totalTiket / 4.0; // Rata-rata untuk 4 studio
        }

        // c. Total pemasukan bioskop selama satu minggu
        int totalPemasukan = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                int harga = (j < 5) ? hargaTiket[i][0] : hargaTiket[i][1]; // Weekday (0-4) atau Weekend (5-6)
                totalPemasukan += penjualan[i][j] * harga;
            }
        }

        // d. Tipe studio dan nama hari dengan penjualan tiket terendah/tertinggi sesuai NIM
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan NIM Anda: ");
        long NIM = scanner.nextLong();

        String mode = (NIM % 2 == 1) ? "tertinggi" : "terendah";
        int bestValue = (mode.equals("tertinggi")) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        String bestStudio = "";
        String bestDay = "";

        for (int i = 0; i < 4; i++) { // Studio
            for (int j = 0; j < 7; j++) { // Hari
                int value = penjualan[i][j];
                if ((mode.equals("tertinggi") && value > bestValue) || (mode.equals("terendah") && value < bestValue)) {
                    bestValue = value;
                    bestStudio = studio[i];
                    bestDay = hari[j];
                }
            }
        }

        // Output
        System.out.println("\n--- Laporan Penjualan Tiket ---");
        // a. Banyaknya tiket yang terjual setiap hari
        System.out.println("\na. Banyaknya tiket yang terjual setiap hari:");
        for (int i = 0; i < 7; i++) {
            System.out.println(hari[i] + ": " + totalPerHari[i] + " tiket");
        }

        // b. Rata-rata penjualan tiket per hari
        System.out.println("\nb. Rata-rata penjualan tiket per hari:");
        for (int i = 0; i < 7; i++) {
            System.out.printf("%s: %.2f tiket%n", hari[i], rataRata[i]);
        }

        // c. Total pemasukan bioskop selama satu minggu
        System.out.println("\nc. Total pemasukan bioskop selama satu minggu:");
        System.out.println("Total pemasukan: Rp " + totalPemasukan);

        // d. Tipe studio dan nama hari dengan penjualan tiket terendah/tertinggi
        System.out.println("\nd. Tipe studio dan nama hari dengan penjualan tiket " + mode + ":");
        System.out.println("Studio: " + bestStudio + ", Hari: " + bestDay + ", Penjualan: " + bestValue + " tiket");
    }
}
