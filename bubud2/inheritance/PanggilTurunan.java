package inheritance;
class Segitiga {
    int panjang, lebar;

    Segitiga() {
        panjang = 5;
        lebar = 3;
    }

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

    void setTinggi(int z) {
        tinggi = z;
    }

    double Volume() {
        return (Luas() * tinggi * 1 / 3);
    }
}

class PanggilTurunan {
    public static void main(String[] args) {
        Segitiga obj1 = new Segitiga();
        System.out.println("Luas Segitiga I = " + obj1.Luas());
        obj1.setPanjang(10);
        obj1.setLebar(5);
        System.out.println("Luas Segitiga II = " + obj1.Luas());

        Prisma obj2 = new Prisma();
        obj2.setPanjang(7);
        obj2.setLebar(4);
        obj2.setTinggi(5);
        System.out.println("Volume Prisma = " + obj2.Volume());
    }
}
