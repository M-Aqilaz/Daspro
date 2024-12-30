import java.util.Scanner;

public class BisokopWithScanner16 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String nama;
        int baris, kolom;
        String[][] penonton = new String[4][2];

        while (true) {

            System.out.println("\n=== Menu ===");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int pilihan = sc.nextInt();
            sc.nextLine(); 

            if (pilihan == 1) {

                System.out.print("Masukkan Nama: ");
                nama = sc.nextLine();


                while (true) {
                    System.out.print("Masukkan Baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan Kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine(); 

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Input tidak valid. Baris harus antara 1-4 dan Kolom antara 1-2.");
                    } else {
                        break; 
                    }
                }

                if (penonton[baris - 1][kolom - 1] != null) {
                    System.out.println("Maaf, tempat duduk sudah terisi.");
                } else {
                  
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Tempat duduk berhasil dipesan.");
                }

            } else if (pilihan == 2) {
               
                System.out.println("\n=== Daftar Penonton ===");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("*** ");
                        } else {
                            System.out.print("[" + penonton[i][j] + "] ");
                        }
                    }
                    System.out.println();
                }

            } else if (pilihan == 3) {
        
                System.out.println("Terima kasih telah menggunakan program ini.");
                break; 
            } else {
            
                System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
            }
        }
        sc.close(); 
    }
}