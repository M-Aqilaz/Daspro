import java.util.Scanner;
public class Siakad16 {
    public static void main(String[] args) {
        Scanner SC= new Scanner (System.in);
        String nama, NIM, kelas, kualifikasi, nilaiHuruf;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
       
        System.out.print("Masukkan Nama: ");
        nama = SC.nextLine();

        System.out.print("Masukkan NIM: ");
        NIM = SC.nextLine();

        System.out.print("Masukkan Kelas: ");
        kelas = SC.nextLine();

        System.out.print("Masukkan Absen: ");
        absen = SC.nextByte();

        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = SC.nextDouble();

        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = SC.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        nilaiUTS = SC.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        nilaiUAS = SC.nextDouble();

        nilaiAkhir = (nilaiKuis*0.2 + nilaiTugas*0.15 + nilaiUTS*0.3 + nilaiUAS*0.35 );

        System.out.println("Mahasiswa dengan Nama : " + nama + " NIM  : " + NIM + " Kelas : " + kelas + " Absen : " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);  

        if (80<nilaiAkhir&&nilaiAkhir<=100){
            nilaiHuruf="A";
            kualifikasi="Sangat Baik";
        }
        else if (73<nilaiAkhir&&nilaiAkhir<=80){
            nilaiHuruf="B+";
            kualifikasi="Lebih Dari Baik";
        }
        else if (65<nilaiAkhir&&nilaiAkhir<=73){
            nilaiHuruf="B";
            kualifikasi="Baik";
        }
        else if (60<nilaiAkhir&&nilaiAkhir<=65){
            nilaiHuruf="C+";
            kualifikasi="Lebih Dari Cukup";
        }
        else if (50<nilaiAkhir&&nilaiAkhir<=60){
            nilaiHuruf="C";
            kualifikasi="Cukup";
        }
        else if (39<nilaiAkhir&&nilaiAkhir<=50){
            nilaiHuruf="D";
            kualifikasi="Kurang";
        }
        else {
            nilaiHuruf="E";
            kualifikasi="Gagal";
        }

        System.out.println("Nilai Akhir Huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
    }
}