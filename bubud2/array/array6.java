package array;
//menghitung jumlah seluruh elemen
public class array6
{
    public static void main(String args[])
    {
        int array2[][] = {{1,2},{3},{4,5,6}};
        int total=0;

        System.out.println("Isi Array2");
        for (int baris=0; baris<array2.length; baris++)
        {
            for (int kolom=0; kolom<array2[baris].length; kolom++)
            {
                System.out.print(array2[baris][kolom] + " ");
                total = total + array2[baris][kolom];
            }
            System.out.print("\n");
        }
        System.out.println("\nJumlah seluruh elemen : " + total);
    }
}


