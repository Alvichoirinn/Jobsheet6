import java.util.Scanner;
/**
 * Pemilihan2Percobaan2
 */
public class ModifikasiPercobaan2 {

    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);

        System.out.print("Masukkan sudut 1: ");
        int sudut1 = input03.nextInt();
        System.out.print("Masukkan sudut 2: ");
        int sudut2 = input03.nextInt();
        System.out.print("Masukkan sudut 3: ");
        int sudut3 = input03.nextInt();

        int totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
                else if ((sudut1 == sudut2) && (sudut2 == sudut3))
                System.out.println("Segitiga sama sisi");
                else if ((sudut1 == sudut2) || (sudut3 == sudut2) || (sudut1 == sudut3))
                System.out.println("Segitiga sama kaki");
                else
                System.out.println("Segitiga sembarang");
        }else
            System.out.println("Bukan segitiga");
        
        }
    }
