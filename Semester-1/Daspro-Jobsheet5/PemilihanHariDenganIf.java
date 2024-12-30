import java.util.Scanner;
    public class PemilihanHariDenganIf {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Masukkan bilangan bulat: ");
            int day = scanner.nextInt();
    
            if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
                System.out.println("Weekday");
            } else if (day == 6 || day == 7) {
                System.out.println("Weekend");
            } else {
                System.out.println("Invalid Number");
            }
        }
    }

