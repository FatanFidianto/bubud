
public class soal27_DemoContinue2 {

    public static void main(String args[]) {
        luar:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.println();
                    continue luar;
                }

                System.out.print(" " + (i * j));
            }
        }

        System.out.println();
    }
}
