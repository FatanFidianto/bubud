
import java.util.Random;

public class soal6_WhileLogaritmaDiskrit {

    public static void main(String[] args) {
        Random acak = new Random();

        float x = acak.nextFloat();
        x = 999999 * x + 2;
        int y = 0;
        int n = 1;

        while (n <= x) {
            n *= 2;
            ++y;
            System.out.println("n= " + n + "\ty = " + y);
        }

        --y;
        System.out.println(" x: " + x);
        System.out.println("Logaritma biner diskrit atas x: " + y);
        float lgx = (float) (Math.log(x) / Math.log(2.0));
        System.out.println("Logaritma biner kontinya atas x: " + lgx);
    }
}
