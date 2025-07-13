//Nama file : AplikasiNilai.java
class Nilai
{
    private String Nama;
    private int NilaiAkhir;

    public Nilai()
    {
        Nama = "";
        NilaiAkhir = 0;
    }
    public Nilai(String Nama, int NilaiAkhir)
    {
        this.Nama = Nama;
        this.NilaiAkhir = NilaiAkhir;
    }

    public String TampilNama()
    { return Nama; }

    public int TampilNilaiAkhir()
    { return NilaiAkhir; }

    public char Grade(int x)
    {
        if (x>80)
            return 'A';
        else if (x>=70 && x<80)
            return 'B';
        else if (x>=60 && x<70)
            return 'C';
        else if (x>=50 && x<60)
            return 'D';
        else
            return 'E';
    } //akhir dari class Nilai
}

public class AplikasiNilai
{
    public static void main(String args[])
    {
        Nilai Mhs = new Nilai("Miranti",75);
        System.out.println("Nama Mahasiswa : "+Mhs.TampilNama());
        System.out.println("Nilai : "+Mhs.TampilNilaiAkhir());
        System.out.println("Grade : "+Mhs.Grade(Mhs.TampilNilaiAkhir()));
    }
}




