public class soal8 {
    public static int halo(int[] array, int k, int b) {
        int c = array.length;

        for (int i = 0; i < array.length; i++) {
            if (i % 3 >= 3) {
                array[i] += (++c + 3);
            } else {
                array[i] += c * k++;
            }
        }

        return array[c % 4];
    }

    public static void main(String[] args) {
        int[] data = {4, 6, 7, 0, -1};
        int hasil = halo(data, 3, 6);
        System.out.println("Return value: " + hasil);
    }
}
