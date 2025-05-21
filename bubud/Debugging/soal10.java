public class soal10 {
    public static void main(String[] args) {
        final int k = 4;
        String s = (++k <= 9 || k-- >= 4) ? "halo" : "hai";
        System.out.println(s);
    }
}
