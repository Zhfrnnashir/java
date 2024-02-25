import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Jenis Kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Masukkan Tanggal Lahir (yyyy-MM-dd): ");
        String tanggalLahirStr = scanner.next();

        // Konversi string tanggal lahir menjadi objek LocalDate
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);

        // Hitung umur menggunakan java.time.Period
        LocalDate tanggalSekarang = LocalDate.now();
        Period period = Period.between(tanggalLahir, tanggalSekarang);
        int umur = period.getYears();

        // Konversi jenis kelamin menjadi string lengkap
        String jenisKelaminLengkap = (jenisKelamin == 'L' || jenisKelamin == 'l') ? "Laki-laki" : "Perempuan";

        // Output informasi data diri
        System.out.println("\n=== Data Diri ===");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminLengkap);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Umur: " + umur + " tahun");

        scanner.close();
    }
}
