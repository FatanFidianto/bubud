
public class soal4_WhileUntukFibonacci {

    public static void main(String[] args) {
        System.out.println(0);

        int fib0 = 0;
        int fib1 = 1;
        int fib2 = fib1 + fib0;

        while (fib2 < 1000) {
            fib0 = fib1;
            fib1 = fib2;
            fib2 = fib1 + fib0;
            System.out.print(", " + fib1);
        }
    }
}
