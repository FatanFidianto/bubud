
import java.util.*;

public class soal22_ForEachFloat {

    public static void main(String[] args) {
        Random acak = new Random(47);

        float f[] = new float[10];
        for (int i = 0; i < 10; i++) {
            f[i] = acak.nextFloat();
        }

        for (float x : f) {
            System.out.println(x);
        }
    }
}
