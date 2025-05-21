
public class livesoal2 {

    public static void main(String[] args) {
        int N = 5;
        int num = 1;

        for (int i = 0; i < N; i++) {
            int[] row = new int[N];
            for (int j = 0; j < N; j++) {
                row[j] = num++;
            }

            if (i % 2 != 0) {
                // Balik urutan jika baris ganjil
                for (int j = N - 1; j >= 0; j--) {
                    System.out.printf("%02d ", row[j]);
                }
            } else {
                for (int j = 0; j < N; j++) {
                    System.out.printf("%02d ", row[j]);
                }
            }
            System.out.println();
        }
    }
}
