package PBO221.M221019.Polimorph;

public class MainClass {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran();
        Lingkaran l2 = new Lingkaran2();

        System.out.println("Luas (jari-jari): "+l1.luas(5.0));
        System.out.println("Luas (): "+l1.luas(2f));

        // ambil dari super class
        l1.cetak();

        // ambil dari subclass
        l2.cetak();
    }
}
