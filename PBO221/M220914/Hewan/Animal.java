package PBO221.M220914.Hewan;

public class Animal {
    // atribut
    private String tipe;
    private String suara;
    private int usia;

    // setter
    public void setTipe(String type) {
        tipe = type;
    }

    public void setSuara(String suara) {
        this.suara = suara;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    // getter
    public String getTipe() {
        return this.tipe;
    }

    public String getSuara() {
        return this.suara;
    }

    public int getUsia() {
        return this.usia;
    }
}