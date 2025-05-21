
public class soal12 {

    public static void main(String[] args) {
        int num = 1;
        int k = num + 9 * ++num - 1; // num jadi 2 di sini

        if (num > 0) {
            if (num < 10) {
                num *= 10;
            } else {
                k += 2;
                num = k + 3;
            }
        } else {
            num--;
            k /= 10 + num;
        }

        System.out.println("num = " + num);
        System.out.println("k = " + k);
    }
}
