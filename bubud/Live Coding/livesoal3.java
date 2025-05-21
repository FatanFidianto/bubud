
public class livesoal3 {

    public static void main(String[] args) {
        String input = "pemrogramanDasarJava1";

        int uppercase = 0, lowercase = 0, digit = 0, symbol = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                uppercase++;
            } else if (Character.isLowerCase(ch)) {
                lowercase++;
            } else if (Character.isDigit(ch)) {
                digit++;
            } else {
                symbol++;
            }
        }

        System.out.println("uppercase : " + uppercase);
        System.out.println("lowercase : " + lowercase);
        System.out.println("angka : " + digit);
        System.out.println("symbol : " + symbol);
    }
}
