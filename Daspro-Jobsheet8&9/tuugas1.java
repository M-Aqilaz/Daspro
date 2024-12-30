import java.util.Scanner;

public class tuugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int n = scanner.nextInt();
        
        int[] arrNilai = new int[n];

        System.out.println("Masukkan nilai mahasiswa:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = scanner.nextInt();
        }

        int total = 0;
        int nilaiTertinggi = arrNilai[0];
        int nilaiTerendah = arrNilai[0];

        for (int nilai : arrNilai) {
            total += nilai;

            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }


            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }

        double rataRata = (double) total / n; 

        System.out.println("\nRata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        
        System.out.println("Semua nilai yang telah dimasukkan:");
        for (int nilai : arrNilai) {
            System.out.print(nilai + " ");
        }
        System.out.println(); 

        scanner.close(); 
    }
}
