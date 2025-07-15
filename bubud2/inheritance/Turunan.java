package inheritance;
class Utama {
    int x, y;
    void Cetak() {
        System.out.println("Nilai x = " + x);
        System.out.println("Nilai y = " + y);
    }
}

class Turunan extends Utama {
    int z;
    void CetakNilai() {
        System.out.println("Nilai z = " + z);
    }

    public static void main(String[] args) {
        Utama obj1 = new Utama();
        obj1.x = 10; obj1.y = 5;
        obj1.Cetak();

        Turunan obj2 = new Turunan();
        obj2.x = 3; obj2.y = 4;
        obj2.z = obj2.x * obj2.y;
        obj2.Cetak();
        obj2.CetakNilai();
    }
}
