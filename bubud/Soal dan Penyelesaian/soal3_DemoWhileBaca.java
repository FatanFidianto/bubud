
import java.util.Scanner;

public class soal3_DemoWhileBaca {

    public static void main(String[] args) {
        int kounter, angka;

        System.out.println("Masukkan sebuah angka");
        Scanner papantik = new Scanner(System.in);

        angka = papantik.nextInt();
        kounter = 1;

        while (kounter <= angka) {
            System.out.println(kounter + ", ");
            kounter++;
        }

        System.out.println();
        System.out.println("Hidup Jokowi!.");
    }
}
