//Nama file : segitiga.java
public class segitiga 
{
    private int alas;
    private int tinggi;

    public void IsiField(int x, int y) {
        alas = x;
        tinggi = y;
    }

    public int tampilAlas() {
        return alas;
    }

    public int tampilTinggi() {
        return tinggi;
    }

    public double HitungLuas() {
        return 0.5 * (double) (alas * tinggi);
    }
}
