
import java.util.Scanner;

public class KafeDoWhilie16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int kopi, teh, roti, hargaKopi=12000, hargaTeh=7000, hargaRoti=20000,totalharga;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan=sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.print("jumlah kopi: ");
            kopi=sc.nextInt();
            System.out.print("jumlah teh: ");
            teh=sc.nextInt();
            System.out.print("jumlah roti: ");
            roti=sc.nextInt();

            totalharga= (kopi*hargaKopi) + (teh*hargaTeh) + (roti*hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalharga);
            sc.nextLine();
            
        } while (true);

        System.out.println("Semua Transakasi selesai");
    }
}
