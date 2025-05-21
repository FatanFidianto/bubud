
import java.util.Random;

public class soal29_DemoForHitung {

    public static void main(String[] args) {
        Random acak = new Random();

        float x = acak.nextFloat();
        System.out.println("x= " + x);
        int n = (int) Math.floor(99 * x + 2);
        System.out.println("n= " + n);
        int jum = 0;

        for (int i = 1; i <= n; i++) {
            jum += i * i;
        }

        int formula = n * (n + 1) * (2 * n + 1) / 6;
        System.out.println("jum= " + jum);
        System.out.println("n*(n+1)*(2*n+1)/6 = " + formula);
    }
}
