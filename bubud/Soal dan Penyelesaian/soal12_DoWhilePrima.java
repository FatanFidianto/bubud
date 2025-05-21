
import java.util.Random;

public class soal12_DoWhilePrima {

    public static void main(String[] args) {
        Random acak = new Random();

        float x = acak.nextFloat();
        System.out.println("x= " + x);
        int n = Math.round(97 * x + 2);
        boolean apaPrima;
        int d = 2;

        do {
            apaPrima = (n % d++ != 0);
        } while (apaPrima && d < n);

        if (apaPrima) {
            System.out.println(n + " adalah prima.");
        } else {
            System.out.println(n + " bukan prima.");
        }
    }
}
