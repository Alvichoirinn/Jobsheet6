import java.util.Scanner;
/**
 * Pemilihan2Percobaan103
 */
public class ModifikasiPercobaan1{

    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);

        System.out.print("Masukkan Tahun: ");
        int tahun = input03.nextInt();

        if ((tahun % 400)== 0) {
            if ((tahun % 100) != 0)
                System.out.print("Tahun Kabisat ");
        }else
            System.out.println("Bukan Tahun Kabisat");
    }
}

