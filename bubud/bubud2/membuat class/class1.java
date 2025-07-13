//Nama file : class1.java
public class class1
{
    public static void main(String args[])
    {
        segitiga sg3 = new segitiga();
        sg3.IsiField(4,6);

        System.out.println("Panjang alas segitiga adalah : " + sg3.tampilAlas());
        System.out.println("Tinggi segitiga adalah : " + sg3.tampilTinggi());
        System.out.println("Luas Segitiga adalah : " + sg3.HitungLuas());
    }
}

