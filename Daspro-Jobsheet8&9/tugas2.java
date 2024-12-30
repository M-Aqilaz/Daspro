import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = scanner.nextInt();
        scanner.nextLine(); 

        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama makanan/minuman ke-" + (i + 1) + ": ");
            namaPesanan[i] = scanner.nextLine();

            System.out.print("Masukkan harga untuk " + namaPesanan[i] + ": ");
            hargaPesanan[i] = scanner.nextDouble();
            scanner.nextLine(); 
        }

        double totalBiaya = 0;
        for (double harga : hargaPesanan) {
            totalBiaya += harga;
        }

        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println(namaPesanan[i] + ": Rp" + hargaPesanan[i]);
        }
        
        System.out.println("Total Biaya: Rp" + totalBiaya);
        
        scanner.close(); 
    }
}
