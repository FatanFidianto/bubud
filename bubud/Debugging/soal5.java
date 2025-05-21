public class soal5 {
    public static boolean isPrima(int x) {
        if (x < 2) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 9, 2, 3, 3, 4, 0, -1, 10, 8, 8, 7, 4, 8};
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            k = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[k] >= arr[j]) {
                    k = j;
                }
            }
            int temp = arr[k];
            arr[k] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!isPrima(arr[i])) {
                arr[i % 7] = i + 5;
            } else {
                arr[i % 4] = arr[i] + 4;
            }
        }

        System.out.println("Isi array setelah operasi:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println(); // newline
    }
}
