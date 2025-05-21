
import java.util.Random;

public class soal11_DoWhileFaktorial {

    public static void main(String[] args) {
        Random acak = new Random();

        float x = acak.nextFloat();
        int n = Math.round(21 * x);
        long f = 1;
        int k = 1;

        do {
            f *= k++;
        } while (k <= n);

        System.out.println(n + " ! = " + f);
    }
}
