public class soal1 {
    public static void main(String[] args) {
        int N = 9;
        int k = N - 2;

        for (int i = 1; i < N; i++) {
            if ((i % 7 < 2) || (i % 2 > (N - 3))) {
                k *= (N & 3);
            } else if (i % 2 >= 4) {
                k -= (k + N);
            } else {
                k = k ^ 2;
            }
        }

        System.out.println("Hasil k: " + k);
    }
}
