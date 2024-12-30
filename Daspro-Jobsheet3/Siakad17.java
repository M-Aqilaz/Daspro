import java.util.Scanner;
public class Siakad17 {
    public static void main(String[] args) {
        Scanner SC= new Scanner (System.in);
        String nama, NIM, kelas;
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
    }
}
