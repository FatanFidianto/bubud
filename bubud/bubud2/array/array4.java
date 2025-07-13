package array;
public class array4
{
    public static void main(String args[])
    {
        int array1[] = {1,2,3,4,5};

        System.out.println("Array sebelum dilewatkan");
        for (int i=0; i<array1.length; i++)
            System.out.print(array1[i] + " ");

        System.out.println("\nSesudah dilewatkan");
        modifyarray(array1);

        for (int i=0; i < array1.length; i++)
            System.out.print(array1[i] + " ");

        System.out.println("\n\nIngin melewatkan elemen array");
        System.out.println("============================");
        System.out.println("\nSebelum elemen dilewatkan");
        System.out.println(array1[2]);
        modifyelemen(array1[2]);
        System.out.println("Sesudah elemen dilewatkan");
        System.out.println(array1[2]);

    }

    public static void modifyarray(int b[])
    {
        for (int y=0; y<b.length; y++)
            b[y] = b[y] + 5;
    }

    public static void modifyelemen(int c)
    {
        c = c + 10;
    }
}


