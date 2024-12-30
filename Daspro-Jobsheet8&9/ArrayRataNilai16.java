import java.util.Scanner;

public class ArrayRataNilai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilaiMhs[] = new int[10];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int mhsLulus = 0; 
        int mhsTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                mhsLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                mhsTidakLulus++;
            }
        }


        double rata2Lulus;
        double rata2TidakLulus;

        if (mhsLulus > 0) {
            rata2Lulus = totalLulus / mhsLulus;
        } else {
            rata2Lulus = 0;
        }

        if (mhsTidakLulus > 0) {
            rata2TidakLulus = totalTidakLulus / mhsTidakLulus;
        } else {
            rata2TidakLulus = 0; 
        }

        System.out.println("Rata-rata Nilai Lulus = " + rata2Lulus);
        System.out.println("Rata-rata Nilai Tidak Lulus = " + rata2TidakLulus);
    }
}
