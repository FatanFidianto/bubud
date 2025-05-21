
public class soal15_ForPrima {

    public static void main(String args[]) {
        int angka;
        boolean apaPrima = true;
        angka = 14;

        for (int i = 2; i <= angka / i; i++) {
            if ((angka % i) == 0) {
                apaPrima = false;
                break;
            }
        }

        if (apaPrima) {
            System.out.println("Prima");
        } else {
            System.out.println("Bukan Prima");
        }
    }
}
