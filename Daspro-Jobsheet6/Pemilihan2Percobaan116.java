import java.util.Scanner;

public class Pemilihan2Percobaan116 {
    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);

        // Deklarasi variabel tahun
        int tahun;

        // Minta pengguna untuk memasukkan tahun
        System.out.print("Masukkan tahun: ");
        tahun = input16.nextInt();

        // Logika untuk menentukan tahun kabisat
        if ((tahun % 4) == 0) { // Jika tahun kelipatan 4
            if ((tahun % 100) == 0) { // Jika tahun kelipatan 100
                if ((tahun % 400) == 0) { // Jika tahun kelipatan 400
                    System.out.println("Tahun Kabisat");
                } else {
                    System.out.println("Bukan Tahun Kabisat");
                }

        }
    }
}
}