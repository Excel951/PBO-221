package PBO221.M220914.BangunDatar;

public class segitiga {
    // atribut
    private int sisi, alas, tinggi, luas, keliling;

    // setter
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    // getter
    public int getSisi() {
        return this.sisi;
    }

    public int getAlas() {
        return this.alas;
    }

    public int getTinggi() {
        return this.tinggi;
    }

    // custom
    public int hitungLuas() {
        luas = getAlas() * getTinggi() / 2;
        return this.luas;
    }

    public int hitungKeliling() {
        keliling = 3 * getSisi();
        return this.keliling;
    }
}
