//Nama  : Muhammad Aqil Azami
//NIM   : 244107020128
//Absen : 16

import java.util.Scanner;

public class UAS1D16 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int jumlahTim16 = 5; 
        String[] namaTim16 = new String[jumlahTim16];
        int[][] skor16 = new int[jumlahTim16][2];
        int[] totalSkor16 = new int[jumlahTim16];
        boolean dataTersedia16 = false;

        int pilihan;
        do {
            System.out.println("=== MENU UTAMA ===");
            System.out.println("1. Input Data Skor Tim");
            System.out.println("2. Tampilkan Tabel Skor");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1: 
                for (int i = 0; i < jumlahTim16; i++) {
                    boolean namaValid;
                    do {
                        namaValid = true; 
                        System.out.print("Masukkan nama tim ke-" + (i + 1) + ": ");
                        String namaInput = sc.next();

                        for (int j = 0; j < i; j++) {
                            if (namaTim16[j].equalsIgnoreCase(namaInput)) {
                                System.out.println("Nama tim sudah digunakan. Masukkan nama lain.");
                                namaValid = false;
                                break;
                            }
                        }

                        if (namaValid) {
                            namaTim16[i] = namaInput;
                        }
                    } while (!namaValid);

                    for (int level = 0; level < 2; level++) {
                        while (true) {
                            System.out.print("Masukkan skor " + namaTim16[i] + " untuk Level " + (level + 1) + ": ");
                            int nilai = sc.nextInt();
                            if (nilai < 0) {
                                System.out.println("Skor tidak boleh negatif. Masukkan kembali.");
                            } else if (level == 0 && nilai < 35) {
                                nilai = 0;
                                skor16[i][level] = nilai;
                                break;
                            } else {
                                skor16[i][level] = nilai;
                                break;
                            }
                        }
                        totalSkor16[i] = skor16[i][0] + skor16[i][1];
                    }
                }
                dataTersedia16 = true;
                break;
                    case 2:

                    if (!dataTersedia16) {
                        System.out.println("Tidak ada data yang bisa ditampilkan.");
                    } else {
                        System.out.println("\nTabel Skor Turnamen:");
                        System.out.printf("%-10s %-10s %-10s %-10s\n", "Nama Tim", "Level 1", "Level 2", "Total Skor");
                        for (int i = 0; i < jumlahTim16; i++) {
                            System.out.printf("%-10s %-10d %-10d %-10d\n", namaTim16[i], skor16[i][0], skor16[i][1], totalSkor16[i]);
                        }
                    }
                    break;
                    case 3:
                    if (!dataTersedia16) {
                        System.out.println("Tidak ada data yang ditampilkan");
                    } else {
                        int maxSkor = totalSkor16[0];
                        int jumlahJuara = 1; 

                        for (int i = 1; i < jumlahTim16; i++) {
                            if (totalSkor16[i] > maxSkor) {
                                maxSkor = totalSkor16[i];
                                jumlahJuara = 1; 
                            } else if (totalSkor16[i] == maxSkor) {
                                jumlahJuara++; 
                            }
                        }
                        if (jumlahJuara > 1) {
                            System.out.println("\nPertandingan berakhir seri. Tim terbaik adalah [Aqil]");
                        } else {

                            for (int i = 0; i < jumlahTim16; i++) {
                                if (totalSkor16[i] == maxSkor) {
                                    System.out.println("\nSelamat kepada Tim " + namaTim16[i] + " yang telah memenangkan kompetisi");
                                    break;
                                }
                            }
                        }
                    }
                    break;
                

            case 4:
                System.out.println("Program Telah selesai");
                break;

            default:
                System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
        }
    } while (pilihan != 4);

    sc.close();
                }
            }
