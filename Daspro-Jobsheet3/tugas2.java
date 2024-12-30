import java.util.Scanner;
public class tugas2 {

    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
long jumlahjam, upah, gajiawal, gajiakhir, bonus, pajak, gajisebelumpajak;

        System.out.print("Masukkan jumlah jam kerja anda: ");
        jumlahjam = input.nextLong();

        System.out.print("Masukkan upah per jam anda: ");
        upah = input.nextLong();
        gajiawal = upah*jumlahjam;
        bonus = gajiawal*10/100;
        gajisebelumpajak = gajiawal + bonus;
        pajak = gajiawal*5/100;
        gajiakhir = (gajisebelumpajak-pajak) *30;
        System.out.print("gaji akhir anda adalah: " + gajiakhir);
    }
}