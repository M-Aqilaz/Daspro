import java.util.Scanner;

public class Survey {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Jumlah responden dan pertanyaan
        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;

        // Menyimpan hasil survei dalam array 2 dimensi
        int[][] surveyResults = new int[jumlahResponden][jumlahPertanyaan];

        // Input data hasil survei
        System.out.println("Masukkan hasil survei untuk " + jumlahResponden + " responden dan " + jumlahPertanyaan + " pertanyaan:");
        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            for (int j = 0; j < jumlahPertanyaan; j++) {
                surveyResults[i][j] = getValidInput(scanner, j + 1);
            }
        }

        // Menampilkan rata-rata untuk setiap responden
        System.out.println("\nRata-rata untuk setiap responden:");
        for (int i = 0; i < jumlahResponden; i++) {
            double averagePerRespondent = calculateAverage(surveyResults[i]);
            System.out.printf("Responden %d: Rata-rata = %.2f\n", i + 1, averagePerRespondent);
        }

        // Menampilkan rata-rata untuk setiap pertanyaan
        System.out.println("\nRata-rata untuk setiap pertanyaan:");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            double averagePerQuestion = calculateAverageForColumn(surveyResults, j);
            System.out.printf("Pertanyaan %d: Rata-rata = %.2f\n", j + 1, averagePerQuestion);
        }

        // Menampilkan rata-rata keseluruhan
        double totalJawaban = 0;
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalJawaban += surveyResults[i][j];
            }
        }
        double rataRataKeseluruhan = totalJawaban / (jumlahResponden * jumlahPertanyaan);
        System.out.printf("\nRata-rata keseluruhan: %.2f\n", rataRataKeseluruhan);

        scanner.close();
    }

    // Method to get a valid input (example: ratings between 1-5)
    private static int getValidInput(Scanner scanner, int questionNumber) {
        int answer = -1;
        while (answer < 1 || answer > 5) {  // assuming a 1-5 scale for ratings
            System.out.print("Jawaban untuk pertanyaan " + questionNumber + " (1-5): ");
            if (scanner.hasNextInt()) {
                answer = scanner.nextInt();
                if (answer < 1 || answer > 5) {
                    System.out.println("Jawaban harus antara 1 dan 5.");
                }
            } else {
                System.out.println("Input tidak valid! Harap masukkan angka.");
                scanner.next();  // consume the invalid input
            }
        }
        return answer;
    }

    // Method to calculate average for an array (like for a respondent)
    private static double calculateAverage(int[] values) {
        double sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum / values.length;
    }

    // Method to calculate average for a specific question (column in 2D array)
    private static double calculateAverageForColumn(int[][] surveyResults, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < surveyResults.length; i++) {
            sum += surveyResults[i][columnIndex];
        }
        return sum / surveyResults.length;
    }
}
