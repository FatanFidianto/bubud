public class soal6 {
    static int totalCetak = 0;

    public static void rusak(int n) {
        if (n == 0) {
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.println("Hello");
            totalCetak++;
        }

        rusak((int)n / 2);
    }

    public static void main(String[] args) {
        rusak(1000);
        System.out.println("Total Hello dicetak: " + totalCetak);
    }
}
