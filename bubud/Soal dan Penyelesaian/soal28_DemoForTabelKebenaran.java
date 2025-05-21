
public class soal28_DemoForTabelKebenaran {

    public static void main(String[] args) {
        final int UKURAN = 15;

        for (int x = 1; x <= UKURAN; x++) {
            for (int y = 1; y <= UKURAN; y++) {
                int z = x * y;
                if (z < 10) {
                    System.out.print("  ");
                }
                if (z < 100) {
                    System.out.print(" ");
                }
                System.out.print(" " + z);
            }
            System.out.println();
        }
    }
}
