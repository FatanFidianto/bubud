//Menggunakan loop do-while untuk memproses suatu menu 

public class soal9_DoWhileUntukMenu {

    public static void main(String args[])
            throws java.io.IOException {

        char pilihan;
        do {
            System.out.println("Silahkan pilih:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. while");
            System.out.println(" 4. do-while");
            System.out.println(" 5. for\n");
            System.out.println(" Pilih satu:");

            pilihan = (char) System.in.read();
        } while (pilihan < '1' || pilihan > '5');

        System.out.println("\n");

        switch (pilihan) {
            case '1':
                System.out.println("Statemen if:\n");
                System.out.println("if (kondisi) statemen;");
                System.out.println("else statemen;");
                break;

            case '2':
                System.out.println("Statemen switch:\n");
                System.out.println("switch (ekspresi) (");
                System.out.println(" case konstanta:");
                System.out.println(" runtun statemen");
                System.out.println(" break;");
                System.out.println(" // ...");
                System.out.println(")");
                break;

            case '3':
                System.out.println("Loop while:\n");
                System.out.println("while (kondisi) statemen;");
                break;
            case '4':
                System.out.println("Loop do-while:\n");
                System.out.println("do {");
                System.out.println(" statemen;");
                System.out.println(") while (kondisi);");
                break;
            case '5':
                System.out.println("Loop for: \n");
                System.out.print("for (inisialisasi; kondisi; iterasi)");
                System.out.println(" statemen;");
                break;
        }
    }
}
