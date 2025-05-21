
import java.util.Random;

public class soal7_WhileGCD {

    public static void main(String[] args) {
        Random acak = new Random();

        float x = acak.nextFloat();
        int m = Math.round(999 * x + 2);
        x = acak.nextFloat();
        int n = Math.round(999 * x + 2);
        System.out.println("m= " + m + "\t\t n= " + n);

        while (m > 0) {
            if (m < n) {
                int temp = m;
                m = n;
                n = temp;
                System.out.println("m= " + m + "\t\t n= " + n);
            }
            m -= n;
        }
        System.out.println("GCD atas m dan n adalah " + n);
    }
}
