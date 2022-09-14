package PBO221.M220914.BangunDatar;

public class persegipanjang {
    // atribut
    private int panjang, lebar, luas, keliling;

    // setter
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    // getter
    public int getPanjang() {
        return this.panjang;
    }

    public int getLebar() {
        return this.lebar;
    }

    // custom
    public int hitungKeliling() {
        keliling = 2 * getLebar() + 2 * getPanjang();
        return this.keliling;
    }

    public int hitungLuas() {
        luas = getLebar() * getPanjang();
        return this.luas;
    }
}
