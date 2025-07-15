package inheritance;
class Nested
{
    class Inner
    {
        void Cetak()
        {
            System.out.println("Method class inner");
        }

        String Kalimat()
        {
            return "Kata - kata ini juga dapat dicetak";
        }
    }

    Inner obj;

    Nested()
    {
        obj = new Inner();
    }

    void Tampil()
    {
        obj.Cetak();
        System.out.println(obj.Kalimat());
        System.out.println("Pemanggilan method2 dari class inner oleh class nested");
    }

    public static void main(String[] args)
    {
        Nested abc = new Nested();
        abc.Tampil();
    }
}




