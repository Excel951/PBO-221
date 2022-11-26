package PBO221.M221109.Praktikum.AbstractManusia;

public abstract class Manusia {
    double tinggiBadan;

    public Manusia() {

    }

    public Manusia(double tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }

    public double getTinggiBadan() {
        return tinggiBadan;
    }

    abstract double HtgBB();

    abstract void cetakHasil();
}
