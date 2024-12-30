import java.util.Scanner;
public class Kafe17 {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        boolean keanggotaan;
        int JmlKopi, JmlTeh, JmlRoti, nominalInt;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, totalHarga, nominalBayar;
        float diskon = 10 / 100f;

        System.out.print("Masukkan Keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();

        System.out.print("Masukkan Jumlah Pembelian Kopi: ");
        JmlKopi = input.nextInt();

        System.out.print("Masukkan Jumlah Pembelian Teh : ");
        JmlTeh = input.nextInt();

        System.out.print("Masukkan Jumlah Pembelian Roti: ");
        JmlRoti = input.nextInt();

        totalHarga = (JmlKopi*hargaKopi) + (JmlTeh*hargaTeh) + (JmlRoti*hargaRoti);

        nominalBayar = totalHarga - (diskon*totalHarga);

        System.out.println("Keanggotaan pelanggan " + keanggotaan);
        System.out.println("Item pembelian " + JmlKopi + " Kopi, " + JmlTeh + " teh, " + JmlRoti + " roti");
        System.out.println("Nominal bayar Rp " + nominalBayar);
 }
}