
import java.util.Scanner;

public class ImplenFlow16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int usia;
        String Kategori;
        System.out.print("Masukkan usia Anda: ");
        usia =sc.nextInt();

            if (usia >= 0 && usia <=12) { 
                Kategori="anak";
            }
            else if (usia >= 13 && usia <= 19) {
                Kategori="Remaja";
            }
            else if (usia >= 20 && usia <= 64) {
                Kategori="Dewasa";
            }
            else if (usia >=64){
                Kategori="Lansia";
            }else{
                Kategori="tidak valid";
            }
        System.out.println("Anda Termasuk Kategori Usia: " + Kategori);
        }
    }



