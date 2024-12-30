import java.util.Scanner;

public class Pemilihan2Percobaan316 {
    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajibersih;
        double pajak = 0;

        System.out.print("Masukkan Kategori(pekerja/pebisnis): ");
        kategori = input16.nextLine();

        System.out.print("Masukkan Besarnya: ");
        penghasilan = input16.nextInt();

        if (kategori.equals("pekerja")) {
            if (penghasilan <= 2000000) 
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else 
                pajak = 0.2;
            
            gajibersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih: " + gajibersih); 
        } else if (kategori.equals("pebisnis")) {  
            if (penghasilan <= 2500000) 
                pajak = 0.15;
            else if (penghasilan <= 3000000)
                pajak = 0.2;
            else 
                pajak = 0.25;

            gajibersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih: " + gajibersih); 
        } else {
            System.out.println("Masukkan Kategori Salah");
        }
    }
}
