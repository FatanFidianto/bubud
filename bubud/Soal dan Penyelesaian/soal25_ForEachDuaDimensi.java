
public class soal25_ForEachDuaDimensi {

    public static void main(String args[]) {
        int jum = 0;
        int angka[][] = new int[3][5];

        // mengisi array angka
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                angka[i][j] = (i + 1) * (j + 1);
            }
        }

        // menampilkan isi dan penjumlahan elemen-elemen array
        for (int x[] : angka) {
            for (int y : x) {
                System.out.println("Nilai adalah: " + y);
                jum += y;
            }
        }

        System.out.println("Penjumlahan akumulasi: " + jum);
    }
}
