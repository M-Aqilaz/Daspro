import java.util.Scanner;
    public abstract class tugas1 {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    double jumlahlistrik, totaltagihan, tariflistrik=1500;
    boolean cek;

    System.out.print("Masukkan jumlah penggunaan listrik anda:  ");
    jumlahlistrik = input.nextDouble();
    totaltagihan = tariflistrik*jumlahlistrik;
    cek = jumlahlistrik > 500;

System.out.println("jumlah listrik: " + jumlahlistrik);
System.out.println("total tagihan anda: " + totaltagihan);
System.out.println("apakah pengguna listrik anda melebihi 500kwh: " + cek);
 }
}