import java.util.Scanner;

public class Tugas2 {

    static int penjumlahanRekursif(int n) {
        if (n == 0) {
            return 0; 
        }
        return n + penjumlahanRekursif(n - 1); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        int hasil = penjumlahanRekursif(n);

        System.out.println("Hasil penjumlahan dari 1 hingga " + n + " adalah: " + hasil);

        sc.close();
    }
}
