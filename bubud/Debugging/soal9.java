public class soal9 {
    public static int roger(int k, int b) {
        if (b == 1) return 1;
        else if (k % b == 0) return 1 + roger(k, --b);
        else return 0 + roger(k, --b);
    }

    public static void main(String[] args) {
        int hasil = roger(8, 8);
        System.out.println("Return value: " + hasil);
    }
}
