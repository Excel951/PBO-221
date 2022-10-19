package PBO221.M221019.Polimorph;

public class Lingkaran {
    public double luas(double jari2) {
        return Math.PI*Math.pow(jari2, 2);
    }

    public float luas(float diameter) {
        return (float) ((float) Math.PI*0.25*Math.pow(diameter, 2));
    }

    public void cetak() {
        System.out.println("Ini adalah super class");
    }
}
