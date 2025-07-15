package inheritance;
import java.io.*;
class Lingkaran
{
    private int jariJari;
    final double phi = 22/7;
    protected void InputData()
    {
        BufferedReader input;
        try
        {
            input = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Masukkan jari-jari : ");
            jariJari = Integer.parseInt(input.readLine());
        }
        catch(Exception e)
        {
            System.out.println("Salah Input");
        }
    }

    double Keliling()
    {
        return (phi * jariJari * 2);
    }

    double Luas()
    {
        return (phi * jariJari * jariJari);
    }

    protected void CetakData()
    {
        System.out.println("Luas Lingkaran = " + Luas());
        System.out.println("Keliling Lingkaran = " + Keliling());
    }
}

class Silinder extends Lingkaran
{
    int tinggi;
    void Input()
    {
        super.InputData();
        BufferedReader in;
        try
        {
            in = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Masukkan tinggi : ");
            tinggi = Integer.parseInt(in.readLine());
        }
        catch(Exception e)
        {
            System.out.println("Salah Input");
        }
    }

    double LuasSilinder()
    {
        return (Luas() + (Keliling() * tinggi));
    }

    double Volume()
    {
        return (Luas() * tinggi);
    }

    void Cetak()
    {
        super.CetakData();
        System.out.println("Luas Silinder = " + LuasSilinder());
        System.out.println("Volume Silinder = " + Volume());
    }
}

class AksesTurunan
{
    public static void main(String[] args)
    {
        Silinder xyz = new Silinder();
        xyz.Input();
        xyz.Cetak();
    }
}




