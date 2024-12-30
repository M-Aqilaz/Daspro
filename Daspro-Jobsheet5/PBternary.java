
import java.util.Scanner;

public class PBternary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Masukkan Angka: ");
        int angka=sc.nextInt();
        String cek =(angka % 2==0) ? "Genap":"Ganjil";
        System.out.println("Angka: " + angka + " adalah angka " + cek);
    }
}
