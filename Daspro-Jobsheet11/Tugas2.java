import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] sales = {
            {20, 20, 25, 20, 10, 60, 10}, 
            {30, 80, 40, 10, 15, 20, 25}, 
            {5, 9, 20, 25, 10, 5, 45},    
            {50, 8, 17, 18, 10, 30, 6},   
            {15, 10, 16, 15, 10, 10, 55}  
        };
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

        while (true) {
            System.out.println("\nPilihan Menu:");
            System.out.println("a. Input data penjualan");
            System.out.println("b. Tampilkan seluruh data penjualan");
            System.out.println("c. Tampilkan menu dengan penjualan tertinggi");
            System.out.println("d. Tampilkan rata-rata penjualan setiap menu");
            System.out.println("e. Keluar");
            System.out.print("Pilih opsi: ");
            char option = scanner.next().charAt(0);

            switch (option) {
                case 'a':
                    System.out.print("Masukkan nomor menu (0=Kopi, 1=Teh, 2=Es Degan, 3=Roti Bakar, 4=Gorengan): ");
                    int menuIndex = scanner.nextInt();
                    System.out.print("Masukkan hari ke (1-7): ");
                    int day = scanner.nextInt() - 1;
                    System.out.print("Masukkan jumlah penjualan: ");
                    int amount = scanner.nextInt();
                    sales[menuIndex][day] = amount;
                    System.out.println("Data berhasil diupdate.");
                    break;

                case 'b': 
                    System.out.println("\nData Penjualan:");
                    for (int i = 0; i < sales.length; i++) {
                        System.out.print(menu[i] + ": ");
                        for (int j = 0; j < sales[i].length; j++) {
                            System.out.print(sales[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 'c':
                    int maxSales = 0;
                    String topMenu = "";
                    for (int i = 0; i < sales.length; i++) {
                        int totalSales = 0;
                        for (int j = 0; j < sales[i].length; j++) {
                            totalSales += sales[i][j];
                        }
                        if (totalSales > maxSales) {
                            maxSales = totalSales;
                            topMenu = menu[i];
                        }
                    }
                    System.out.println("Menu dengan penjualan tertinggi: " + topMenu + " (Total: " + maxSales + ")");
                    break;

                case 'd': 
                    System.out.println("\nRata-rata Penjualan:");
                    for (int i = 0; i < sales.length; i++) {
                        int totalSales = 0;
                        for (int j = 0; j < sales[i].length; j++) {
                            totalSales += sales[i][j];
                        }
                        double average = totalSales / 7.0;
                        System.out.println(menu[i] + ": " + average);
                    }
                    break;

                case 'e': 
                    System.out.println("Keluar dari program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }
    }
}