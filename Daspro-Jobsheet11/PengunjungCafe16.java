public class PengunjungCafe16 {
    public static void DaftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama); 
        }
    }
    public static void main(String[] args) {
        DaftarPengunjung("Ali", "Budi", "Citra");
    }
}
