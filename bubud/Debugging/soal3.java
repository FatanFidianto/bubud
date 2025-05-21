public class soal3 {

    public static void main(String[] args) {
        int k = 2;
        int t = (k *= 2) + 3;
        int count = 0;

        while (k < 10) {
            count++;
            if (t <= 2 && t >= 10) {
                t %= 2;
                break;
            } else {
                while (t <= 15) {
                    t++;
                }
                if (t % 4 > 4) {
                    k++;
                } else {
                    k += 3;
                }
            }
        }

        System.out.println("Loop dijalankan sebanyak: " + count + " kali");
    }
}
