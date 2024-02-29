import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Library Login System");
        System.out.print("Pilih jenis pengguna (admin/mahasiswa): ");
        String jenisPengguna = scanner.nextLine().toLowerCase();

        if (jenisPengguna.equals("admin")) {
            loginAdmin();
        } else if (jenisPengguna.equals("mahasiswa")) {
            loginMahasiswa();
        } else {
            System.out.println("Jenis pengguna tidak valid.");
        }

        scanner.close();
    }

    private static void loginAdmin() {
        Scanner scanner = new Scanner(System.in);

        String adminUsername = "zhafran";
        String adminPassword = "cruelcreation";

        System.out.print("Masukkan username admin: ");
        String username = scanner.nextLine();

        System.out.print("Masukkan password admin: ");
        String password = scanner.nextLine();

        if (username.equals(adminUsername) && password.equals(adminPassword)) {
            System.out.println("Login admin berhasil!");
            // Tambahan: Tambahkan logika atau fungsi untuk mengelola tugas admin di sini
        } else {
            System.out.println("Login admin gagal. Username atau password salah.");
        }

        scanner.close();
    }

    private static void loginMahasiswa() {
        Scanner scanner = new Scanner(System.in);

        String mahasiswaNIM = "202310370311070";

        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();

        if (nim.length() == 15 && nim.equals(mahasiswaNIM)) {
            System.out.println("Login mahasiswa berhasil!");

        } else {
            System.out.println("Login mahasiswa gagal. NIM tidak valid.");
        }

        scanner.close();
    }
}