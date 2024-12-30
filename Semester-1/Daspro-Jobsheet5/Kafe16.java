
import java.util.Scanner;

public class Kafe16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;

        System.out.print("Masukkan Menu: ");
        menu= sc.nextLine();
        System.out.print("Masukkan ukuran cup: ");
        ukuranCup= sc.next().charAt(0);
        System.out.print("Masukkan Jumlah: ");
        jumlah= sc.nextInt();
        System.out.print("Masukkan Keanggotaan(True/False): ");
        keanggotaan= sc.nextBoolean();

        double hargaMenu= 0;

        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu=12_000;
                break;
            case "teh":
                hargaMenu=7_000;
                break;
            case "coklat":
                hargaMenu=20_000;
                break;
        }
        double totalHarga= hargaMenu*jumlah;

        switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
                totalHarga+=0.25*totalHarga;
                break;
            case 'L':
                totalHarga+=0.4*totalHarga;
                break;
            default :
                System.out.println("Tidak Tersedia");
        }
        double diskon=keanggotaan? 0.1:0;
        double nominalBayar= totalHarga-(diskon*totalHarga);

        System.out.println("Item pembelian: " + jumlah + " " + menu +" dengan ukuran cup " + ukuranCup);
        System.out.println("Nominal bayar: " + nominalBayar);
    }
    
}
