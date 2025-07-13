//Nama file : class3.java
class Segitiga3
{
    private int alas;
    private int tinggi;

    public Segitiga3()
    { IsiField(1,1); }
    public Segitiga3(int x)
    { IsiField(1,x); }
    public Segitiga3(int x, int y)
    { IsiField(x,y); }
    public void IsiField(int x, int y)
    {
        alas = x;
        tinggi = y;
    }
    public int tampilAlas()
    { return alas; }
    public int tampilTinggi()
    {
        return tinggi;
    }

    public double HitungLuas()
    { return 0.5 * (double) (alas * tinggi); }
}

public class class3
{
    public static void main(String args[])
    {
        Segitiga3 STA = new Segitiga3();
        System.out.println("Obyek Segitiga Pertama");
        System.out.println("Panjang alas segitiga adalah :"+STA.tampilAlas());
        System.out.println("Tinggi segitiga adalah :"+STA.tampilTinggi());
        System.out.println("Luas Segitiga adalah :"+STA.HitungLuas());
        Segitiga3 STB = new Segitiga3(5);
        System.out.println("\nObyek Segitiga Kedua");
        System.out.println("Panjang alas segitiga adalah :"+STB.tampilAlas());
        System.out.println("Tinggi segitiga adalah :"+STB.tampilTinggi());
        System.out.println("Luas Segitiga adalah :"+STB.HitungLuas());
        Segitiga3 STC = new Segitiga3(7,3);
        System.out.println("\nObyek Segitiga Ketiga");
        System.out.println("Panjang alas segitiga adalah :"+STC.tampilAlas());
        System.out.println("Tinggi segitiga adalah :"+STC.tampilTinggi());
        System.out.println("Luas Segitiga adalah :"+STC.HitungLuas());
    }
}




