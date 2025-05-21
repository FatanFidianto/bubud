
import java.util.Random;

public class soal20_FordanBreak {

    public static void main(String[] args) {
        Random acak = new Random();

        float x = acak.nextFloat();
        System.out.println("x = " + x);
        int n = (int) Math.floor(101 * x);
        boolean apaTidakPrima = (n < 2);

        for (int d = 2; d < n; d++) {
            apaTidakPrima = (n % d == 0);
            if (apaTidakPrima) {
                break;
            }
        }

        if (apaTidakPrima) {
            System.out.println(n + " bukan prima.");
        } else {
            System.out.println(n + " prima.");
        }
    }
}
