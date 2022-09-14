package PBO221.M220914.BangunDatar;

public class persegi {
    private int sisi, luas, keliling;

    // setter
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    // getter
    public int getSisi() {
        return this.sisi;
    }

    // custom
    public int hitungLuas() {
        luas = (int) Math.pow(getSisi(), 2);
        return this.luas;
    }

    public int hitungKeliling() {
        keliling = getSisi() * 4;
        return this.keliling;
    }
}
