package array;
//Nama file : array5.java
public class array5
{
    public static void main(String args[])
    {
        int array2[][] = {{1,2},{3},{4,5,6}};

        System.out.println("Isi Array2");
        for (int baris=0; baris<array2.length; baris++)
        {
            for (int kolom=0; kolom<array2[baris].length; kolom++)
                System.out.print(array2[baris][kolom] + " ");
            System.out.print("\n");
        }
    }
}


