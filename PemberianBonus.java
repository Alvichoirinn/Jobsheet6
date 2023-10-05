import java.util.Scanner;

/**
 * PemberianBonus
 */
public class PemberianBonus {

    public static void main(String[] args) {
        // Membaca input gaji dasar dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan gaji dasar: ");
        double gajiDasar = scanner.nextDouble();

        // Membaca input jumlah tahun pengalaman dari pengguna
        System.out.print("Masukkan jumlah tahun pengalaman: ");
        int tahunPengalaman = scanner.nextInt();

        // Inisialisasi variabel bonus
        double bonus = 0;

        // Pemilihan bersarang untuk menghitung bonus berdasarkan tahun pengalaman
        if (tahunPengalaman >= 5) {
            // Jika pengalaman >= 5 tahun, berikan bonus 20% dari gaji dasar
            bonus = 0.2 * gajiDasar;
        } else {
            // Jika pengalaman < 5 tahun, tanyakan apakah memiliki sertifikat
            System.out.print("Apakah Anda memiliki sertifikat? (ya/tidak): ");
            String memilikiSertifikat = scanner.next();
            if (memilikiSertifikat.equalsIgnoreCase("ya")) {
                // Jika memiliki sertifikat, berikan bonus 10% dari gaji dasar
                bonus = 0.1 * gajiDasar;
            }
        }

        // Hitung total gaji (gaji dasar + bonus)
        double totalGaji = gajiDasar + bonus;

        // Output total gaji yang harus dibayarkan
        System.out.println("Total gaji yang harus dibayarkan: " + totalGaji);
    }
}