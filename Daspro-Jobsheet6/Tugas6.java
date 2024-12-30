import java.util.Scanner;

public class Tugas6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int HARGA_BUKU = 20000;

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        String jenisBuku = scanner.nextLine().toLowerCase();
        
        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = scanner.nextInt();
        
        int totalHarga = jumlahBuku * HARGA_BUKU;
        double diskon = 0.0;
        
        switch (jenisBuku) {
            case "kamus":
                diskon = 0.10; 
                if (jumlahBuku > 2) {
                    diskon += 0.02; 
                }
                break;

            case "novel":
                diskon = 0.07; 
                if (jumlahBuku > 3) {
                    diskon += 0.02; 
                } else {
                    diskon += 0.01; 
                }
                break;

            default: 
                if (jumlahBuku > 3) {
                    diskon = 0.05; 
                }
                break;
        }

        double totalDiskon = totalHarga * diskon;
        double totalBayar = totalHarga - totalDiskon;

        System.out.println("Total Diskon: Rp " + totalDiskon);
        System.out.println("Total yang harus dibayar: Rp " + totalBayar);
        
    }
}