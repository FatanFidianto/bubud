
public class soal7 {

    public static int rusak(int n) {
        if (n == 0) {
            return 0;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Hello");
        }

        return n + rusak(n / 2);
    }

    public static void main(String[] args) {
        int total = rusak(1000);
        System.out.println("Total Hello dicetak: " + total);
    }
}
