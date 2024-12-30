import java.util.Scanner;

public class Tugas3 {

    static int hitungPasanganMarmut(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1;
        }
        return hitungPasanganMarmut(bulan - 1) + hitungPasanganMarmut(bulan - 2); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah bulan: ");
        int bulan = sc.nextInt();

        int jumlahPasangan = hitungPasanganMarmut(bulan);
        System.out.println("Jumlah pasangan marmut pada bulan ke-" + bulan + " adalah: " + jumlahPasangan);

        sc.close();
    }
}
