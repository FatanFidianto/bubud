
public class soal16_VariasiFor {

    public static void main(String args[]) {
        boolean selesai = false;
        int i;
        i = 0;

        for (; !selesai;) {
            System.out.println("i bernilai " + i);
            if (i == 10) {
                selesai = true;
            }
            i++;
        }
    }
}
