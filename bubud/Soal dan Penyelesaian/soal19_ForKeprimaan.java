
import java.util.Random;

public class soal19_ForKeprimaan {

    public static void main(String[] args) {
        Random random = new Random();

        float x = random.nextFloat();
        System.out.println("x = " + x);
        int n = (int) Math.floor(99 * x + 2);

        for (int d = 2; d < n; d++) {
            if (n % d == 0) {
                System.out.println(n + " bukan prima.");
                return;
            }
        }

        System.out.println(n + " prima.");
    }
}
