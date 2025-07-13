//nama file : CharAt1.java
public class CharAt1
{
    public static void main(String args[])
    {
        String a = "Java";
        //bisa diganti dengan
        //String a = new String("Java");

        for (int i=0; i < a.length(); i++)
            System.out.println("Karakter " + i + " adalah " + a.charAt(i));
    }
}

