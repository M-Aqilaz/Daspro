import java.util.Scanner;

public class cobaa {

 // Fungsi untuk menambah data KRS mahasiswa
 public static void tambahDataKRS(Scanner sc, String[][] dataMahasiswa, int[] totalSKS, int jumlahData) {
    System.out.println("--- Tambah Data KRS ---");
    System.out.print("Nama Mahasiswa: ");
    dataMahasiswa[jumlahData][0] = sc.nextLine();
    System.out.print("NIM           : ");
    dataMahasiswa[jumlahData][1] = sc.nextLine();

    boolean coba = true; // Variabel untuk cek apakah lanjut atau tidak
    int totalSksMahasiswa = 0;

    // Loop untuk mengisi mata kuliah mahasiswa
    while (coba) {
        System.out.print("Kode Mata Kuliah: ");
        dataMahasiswa[jumlahData][2] = sc.nextLine();
        System.out.print("Nama Mata Kuliah: ");
        dataMahasiswa[jumlahData][3] = sc.nextLine();
        System.out.print("Jumlah SKS (1-3): ");
        int sks = sc.nextInt();
        sc.nextLine(); // Membersihkan newline setelah input angka

        // Validasi jumlah SKS per mata kuliah
        if (sks < 1 || sks > 3) {
            System.out.println("Jumlah SKS per mata kuliah harus antara 1 dan 3.");
            continue;
        }

        // Validasi total SKS mahasiswa tidak lebih dari 24
        totalSksMahasiswa += sks;
        if (totalSksMahasiswa > 24) {
            System.out.println("Total SKS mahasiswa tidak boleh lebih dari 24.");
            break;
        }

        // Menyimpan SKS dalam bentuk String
        dataMahasiswa[jumlahData][4] = Integer.toString(sks);
        totalSKS[jumlahData] = totalSksMahasiswa; // Mengupdate total SKS mahasiswa

        // Tanya apakah lanjutkan untuk tambah mata kuliah
        System.out.print("Apakah ingin menambah mata kuliah lain? (y/t): ");
        String pilih = sc.nextLine();
        if (pilih.equalsIgnoreCase("t")) {
            coba = false;
            System.out.println("Total SKS yang telah diambil: " + totalSksMahasiswa);
        }
    }
    System.out.println("Data KRS berhasil ditambahkan.");
}

    // Fungsi untuk menghitung total SKS mahasiswa berdasarkan NIM
    public static int hitungTotalSKS(String[][] dataMahasiswa, int[] totalSKS, int jumlahData) {
        int total = 0;
        for (int i = 0; i < jumlahData; i++) {
            total += totalSKS[i];
        }
        return total;
    }

    // Fungsi untuk menampilkan data KRS berdasarkan NIM
    public static void tampilkanDataKRS(Scanner scanner, String[][] dataMahasiswa, int[] totalSKS, int jumlahData) {
        System.out.println("---Analisis Data KRS---");
        System.out.print("Masukkan NIM: ");
        String nimCari = scanner.nextLine();
        boolean ditemukan = false;

        // Menggunakan nested loop untuk mencari dan menampilkan data
        for (int i = 0; i < jumlahData; i++) {
            if (dataMahasiswa[i][1].equals(nimCari)) {
                for (int j = 0; j < 5; j++) {
                    // Menampilkan data mahasiswa berdasarkan indeks
                    if (j == 0) System.out.println("Nama Mahasiswa   : " + dataMahasiswa[i][j]);
                    else if (j == 1) System.out.println("NIM             : " + dataMahasiswa[i][j]);
                    else if (j == 2) System.out.println("Kode Mata Kuliah: " + dataMahasiswa[i][j]);
                    else if (j == 3) System.out.println("Nama Mata Kuliah: " + dataMahasiswa[i][j]);
                }
                System.out.println("Total SKS: " + totalSKS[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Data KRS tidak ditemukan untuk NIM: " + nimCari);
        }
    }

    // Fungsi untuk menganalisis jumlah mahasiswa yang SKS nya kurang dari 20
    public static void analisisSKS(int[] totalSKS, int jumlahData) {
        int count = 0;
        // Menggunakan perulangan nested untuk menghitung jumlah mahasiswa yang SKS nya kurang dari 20
        for (int i = 0; i < jumlahData; i++) {
            if (totalSKS[i] < 20) {
                count++;
            }
        }
        System.out.println("Jumlah mahasiswa yang mengambil SKS kurang dari 20: " + count);
    }

    // Fungsi utama (main)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Maksimal jumlah mahasiswa
        int MAX_MAHASISWA = 100;

        // Array 2 dimensi untuk menyimpan data mahasiswa
        String[][] dataMahasiswa = new String[MAX_MAHASISWA][5]; // [i][0] = Nama, [i][1] = NIM, [i][2] = Kode MK, [i][3] = Nama MK, [i][4] = SKS
        int[] totalSKS = new int[MAX_MAHASISWA]; // Untuk menyimpan total SKS tiap mahasiswa

        int jumlahData = 0; // Menyimpan jumlah data mahasiswa yang dimasukkan
        int pilihan;

        // Perulangan untuk menu utama
        do {
            // Pemilihan menu
            System.out.println(" === Sistem Pemantauan KRS Mahasiswa ===");
            System.out.println("1. Tambah Data KRS");
            System.out.println("2. Tampilkan Data KRS Mahasiswa");
            System.out.println("3. Analisis Data KRS");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // Membersihkan newline setelah input angka

            // Menggunakan nested loop untuk pemilihan menu dan menjalankan pilihan
            if (pilihan == 1) {
                // Menambahkan Data KRS
                tambahDataKRS(sc, dataMahasiswa, totalSKS, jumlahData);
                jumlahData++;
            } else if (pilihan == 2) {
                // Menampilkan Data KRS berdasarkan NIM
                tampilkanDataKRS(sc, dataMahasiswa, totalSKS, jumlahData);
            } else if (pilihan == 3) {
                // Analisis jumlah mahasiswa yang SKS nya kurang dari 20
                analisisSKS(totalSKS, jumlahData);
            } else if (pilihan == 4) {
                // Keluar dari program
                System.out.println("Terima kasih!");
            } else {
                System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 4);

        sc.close();
    }
}
