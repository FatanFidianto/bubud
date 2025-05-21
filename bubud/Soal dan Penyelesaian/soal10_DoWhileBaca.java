
import java.util.Scanner;

public class soal10_DoWhileBaca {

    public static void main(String[] args) {
        int kounter, angka;

        System.out.println("Masukkan sebuah angka");
        Scanner papantik = new Scanner(System.in);
        angka = papantik.nextInt();
        kounter = 1;

        do {
            System.out.print(kounter + ", ");
            kounter++;
        } while (kounter <= angka);

        System.out.println();
        System.out.println("Hidup Indonesia!");
    }
}
