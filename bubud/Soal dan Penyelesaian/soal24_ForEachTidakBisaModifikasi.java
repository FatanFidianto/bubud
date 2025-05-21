
public class soal24_ForEachTidakBisaModifikasi {

    public static void main(String args[]) {
        int angka[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x : angka) {
            System.out.print(x + " ");
            x = x * 10; // tidak berpengaruh pada array angka
        }

        System.out.println();

        for (int x : angka) {
            System.out.print(x + " ");
            System.out.println();
        }
    }
}
