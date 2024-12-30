import java.util.Scanner;

public class RataNilai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilaiMhs;
        float totalNilai, rataNilai;

        for (int i = 1; i <= 5; i++) {
            totalNilai = 0;

            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan nilai tugas mahasiswa ke-" + i + ", tugas ke-" + j + " = ");
                nilaiMhs = sc.nextInt();
                totalNilai += nilaiMhs; 
            }

            rataNilai = totalNilai / 5;

            System.out.println("Rata-rata nilai mahasiswa ke-" + i + ": " + rataNilai);
        }

        sc.close();
    }
}
