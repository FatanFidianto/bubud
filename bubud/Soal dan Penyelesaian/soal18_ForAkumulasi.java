
import java.util.Random;

public class soal18_ForAkumulasi {

    public static void main(String[] args) {
        Random acak = new Random();

        float jum = 0;

        for (int i = 0; i < 5; i++) {
            float x = acak.nextFloat();
            jum += x;
            System.out.println("\tx= " + x + "\t\tjum= " + jum);
        }
    }
}
