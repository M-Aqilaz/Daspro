
//input  = nama, jeniskeanggotaan,dan durasi
//output = nama, durasi, jeniskeanggotaan,dan biaya yang harus dibayar
//lainnya= biayafasilitasgymperjam=20000,member+durasi>3jam=disc15%,dan namaawalS=disc5%
import java.util.Scanner;

public class UTS_16_Aqil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama16, keanggotaan16;
        int durasi16, hargaperjam16 = 20_000;

        do {
            System.out.print("Masukkan nama pelanggan atau ketik 'tutup' untuk keluar: ");
            nama16 = sc.nextLine();

            if (nama16.equalsIgnoreCase("tutup")) {
                break;
            }

            System.out.print("Masukkan jenis keanggotaan (member/non): ");
            keanggotaan16 = sc.nextLine();

            System.out.print("Masukkan durasi (dalam jam): ");
            durasi16 = sc.nextInt();
            sc.nextLine();

            int totalbiaya16 = durasi16 * hargaperjam16;

            if (keanggotaan16.equalsIgnoreCase("member") && durasi16>3) {
                totalbiaya16 = (int) (totalbiaya16 * 0.85); 
            }
            if (nama16.startsWith("S") || nama16.startsWith("s")) {
                totalbiaya16 *= 0.95;
            }
            

            System.out.println("Nama Pelanggan : " + nama16);
            System.out.println("Keanggotaan    : " + keanggotaan16);
            System.out.println("Durasi         : " + durasi16 + " jam");
            System.out.println("Total Biaya    : Rp " + totalbiaya16);

        } while (true);

        System.out.println("Program telah ditutup.");
        sc.close();
    }
}

