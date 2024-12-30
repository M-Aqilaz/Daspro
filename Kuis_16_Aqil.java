
import java.util.Scanner;

public class Kuis_16_Aqil {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int [][]penjualan = {
            {2,3,4,6},
            {3,3,3,2},
            {4,4,5,5},
            {1,3,3,8},
            {2,2,2,2}
    };
        String [] bulan = {"Jan","Feb","Maret","April"};
        String [] nama= {"Sito","Semi","Risma","Vero","Barri"};

        int hargaSepeda=1000000;
        double diskon=0.95; 

        while (true) {
            System.out.println("Pilihan Menu");
            System.out.println("1. Tampilkan Rekap Penjualan");
            System.out.println("2. Tampilkan Total Penjualan Perbulan");
            System.out.println("0. keluar");
            System.out.print("Pilih Menu: ");
            int pilihanMenu=sc.nextInt();

            if (pilihanMenu==0) {
            System.out.println("Program Selesai");
            break;
            }

            switch (pilihanMenu) {
                case 1:
                System.out.println("\nRekap Penjualan:");
                System.out.printf("%-10s", "Nama");
                for (String b : bulan) {
                    System.out.printf("%-10s", b);
                }
                System.out.println();
                for (int i = 0; i < nama.length; i++) {
                    System.out.printf("%-10s", nama[i]);
                    for (int j = 0; j < bulan.length; j++) {
                        System.out.printf("%-10d", penjualan[i][j]);
                    }
                    System.out.println();
                }
                break;

                case 2:
                System.out.println("\nTotal Penjualan Per Bulan:");
                    System.out.printf("%-10s", "Nama");
                    for (String b : bulan) {
                        System.out.printf("%-15s", b);
                    }
                    System.out.println();
                    
                    int[] totalPerBulan = new int[bulan.length];
                    for (int i = 0; i < nama.length; i++) {
                        System.out.printf("%-10s", nama[i]);
                        for (int j = 0; j < bulan.length; j++) {
                            int totalPenjualan = (int) (penjualan[i][j] * hargaSepeda * diskon);
                            System.out.printf("%-15d", totalPenjualan);
                            totalPerBulan[j] += totalPenjualan;
                        }
                        System.out.println();
                    }

                    System.out.println("\nTotal penjualan tiap bulan:");
                    for (int i = 0; i < bulan.length; i++) {
                        System.out.printf("%-10s: %d\n", bulan[i], totalPerBulan[i]);
                    }
                    break;

            }
        }

       
}
}