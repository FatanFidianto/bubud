public class soal2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3 * ++a;

        for (int i = 1; i <= b+2; i++) {
            if (i % 6 <= 2) {
                b += --a * 2 + i / 2;
            } else {
                b -= 7 + ++a;
            }
        }
        System.out.println("Hasil b: " + b);
    }
}
