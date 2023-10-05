import java.util.Scanner;

public class PeraturanKaryawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih kondisi kerja:");
        System.out.println("1. Karyawan tetap");
        System.out.println("2. Karyawan kontrak");
        int kondisiKerja = scanner.nextInt();

        if (kondisiKerja == 1) {
            System.out.println("Karyawan tetap memiliki peraturan kerja berikut:");
            System.out.println("1. Jam kerja: Senin-Jumat, 9:00-17:00");
            System.out.println("2. Cuti tahunan: 12 hari");
        } else if (kondisiKerja == 2) {
            System.out.println("Karyawan kontrak memiliki peraturan kerja berikut:");
            System.out.println("1. Jam kerja: Fleksibel, sesuai kontrak");
            System.out.println("2. Cuti tahunan: Sesuai kontrak");
        } else {
            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }

        scanner.close();
    }
}