package array;
public class array3
{
    public static void main(String args[])
    {
        int a[] = {10,20,30,40,50};
        int total=0;

        System.out.println("Index\tNilai\n");
        for (int i=0; i < a.length; i++)
        {
            total = total + a[i];
            System.out.println(i + "\t" + a[i]);
        }
        System.out.println("Total jumlah isi array :" + total);
    }
}


