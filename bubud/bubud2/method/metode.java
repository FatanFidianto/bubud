import java.io.*;
class metode{
    int tambah(int a, int b){
        return(a+b);
    }
    int kurang(int a, int b){
        return(a-b);
    }
    int kali(int a, int b){
        return(a*b);
    }
    int bagi(int a, int b){
        return(a/b);
    }
    int modulus(int a, int b){
        return(a%b);
    }

    //fungsi main
    public static void main(String args[]){
        int x=0, y=0;

        metode hitung = new metode();

        BufferedReader input;
        try{
            input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input nilai x: ");
            x = new Integer(input.readLine()).intValue();
            System.out.println("Input nilai y: ");
            y = new Integer(input.readLine()).intValue();
        } catch(Exception e){
            System.out.println ("Error");
        }

        //panggil method
        System.out.println("Hasil Perhitungan:");
        System.out.println("Tambah: "+hitung.tambah(x,y));
        System.out.println("Kurang: "+hitung.kurang(x,y));
        System.out.println("Kali: "+hitung.kali(x,y));
        System.out.println("Bagi: "+hitung.bagi(x,y));
        System.out.println("Modulus: "+hitung.modulus(x,y));
    }
}