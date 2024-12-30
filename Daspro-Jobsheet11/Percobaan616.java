import java.util.Scanner;
public class Percobaan616 {
        static int hitungVolume (int tinggi, int a, int b){
            int volume= hitungLuas(a,b)*tinggi;
            return volume;
        }

        static int hitungLuas (int pjg, int lb) {
            int Luas=pjg*lb;
            return Luas;
        }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p,l,t,L,vol;
        System.out.print("Masukkan panjang: ");
        p=input.nextInt();
        System.out.print("Masukkan lebar: ");
        l=input.nextInt();
        System.out.print("Masukkan Tinggi: ");
        t=input.nextInt();

        L=hitungLuas(p, l);
        System.out.println("Luas Persegi panjang adalah: " +L);

        vol=hitungVolume(t, p, l);
        System.out.println("Volume balok adalah: " + vol);
        
    }
}
