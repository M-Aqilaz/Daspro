import java.util.Scanner;

public class Tugas2JS7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalPembayaran = 0;
        int jenisKendaraan, durasi;
        double pembayaran;
        while (true) {
            
        System.out.print("Masukkan jenis kendaraan (1 untuk mobil, 2 untuk motor, 0 untuk keluar): ");
            jenisKendaraan = sc.nextInt();
            if (jenisKendaraan == 0) {
                break;
            }
            System.out.print("Masukkan durasi parkir dalam jam: ");
            durasi = sc.nextInt();
            
            

            if (durasi > 5) {
                pembayaran = 12500;
            } else {
                if (jenisKendaraan == 1) {
                    pembayaran = durasi * 3000;
                } else if (jenisKendaraan == 2) {
                    pembayaran = durasi * 2000;
                } else {
                    System.out.println("Jenis kendaraan tidak valid. Silakan coba lagi.");
                    continue;
                }
            }
            totalPembayaran += pembayaran; 
            System.out.println("Total pembayaran untuk parkir: Rp " + pembayaran);
        }
        System.out.println("Total pembayaran parkir keseluruhan: Rp " + totalPembayaran);
    }
}
