package array;
//Nama file : array.java
public class array
{
    public static void main(String args[])
    {
        int a[] = new int[5];

        System.out.println("Index\tNilai\n");
        for (int i=0; i < a.length; i++) {
            a[i] = i + 2;
            System.out.println(i + "\t" + a[i]);
        }
    }
}


