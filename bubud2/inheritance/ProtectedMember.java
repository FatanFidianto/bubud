package inheritance;
class Segitiga {
    protected int panjang, lebar;

    void setPanjang(int x) {
        panjang = x;
    }

    void setLebar(int y) {
        lebar = y;
    }

    double Luas() {
        return (panjang * lebar * 1 / 2);
    }
}

class Prisma extends Segitiga {
    int tinggi;

    void setNilai(int x, int y, int z) {
        super.panjang = x;
        super.lebar = y;
        tinggi = z;
    }

    double Volume() {
        return (Luas() * tinggi * 1 / 3);
    }
}

class ProtectedMember {
    public static void main(String[] args) {
        Segitiga abc = new Segitiga();
        abc.setPanjang(7);
        abc.setLebar(5);
        System.out.println("Luas Segitiga = " + abc.Luas());

        Prisma obj = new Prisma();
        obj.setNilai(10, 4, 5);
        System.out.println("Volume Prisma = " + obj.Volume());
    }
}
