
import static java.lang.System.out;
import java.util.Scanner;

public class soal11 {

    public static void main(String[] args) {
        int nilai, sisa;
        Scanner masukan = new Scanner(System.in);
        out.println("Nilai angka: ");
        nilai = Integer.parseInt(masukan.nextLine());

        sisa = nilai % 2;

        switch (sisa) {
            case 0:
                out.println("Genap");
                break;
            default:
                out.println("Ganjil");
                break;
        }
    }
}
