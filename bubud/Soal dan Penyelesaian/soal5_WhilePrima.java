
import java.util.Random;

public class soal5_WhilePrima {

    public static void main(String[] args) {
        Random acak = new Random();
        float x = acak.nextFloat();

        System.out.println("x = " + x);
        int n = (int) Math.floor(101 * x);
        boolean apaPrima = (n > 1);
        int d = 2;

        while (apaPrima && d < n) {
            apaPrima = (n % d++ != 0);
        }

        if (apaPrima) {
            System.out.println(n + " adalah prima.");
        } else {
            System.out.println(n + " bukan prima.");
        }
    }
}
