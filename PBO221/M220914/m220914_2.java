package PBO221.M220914;

import java.io.*;

class VolumeBalok {

    // atribut
    private int panjang, lebar, tinggi, volume;

    // setter
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    // getter
    public int getPanjang() {
        return this.panjang;
    }

    public int getLebar() {
        return this.lebar;
    }

    public int getTinggi() {
        return this.tinggi;
    }

    public int totalVolume() {
        volume = getPanjang() * getLebar() * getTinggi();
        return volume;
    }
}

public class m220914_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        VolumeBalok blk = new VolumeBalok();

        System.out.println("===== VOLUME BALOK =====");
        System.out.print("Panjang: ");
        blk.setPanjang(Integer.parseInt(rd.readLine()));
        System.out.print("Lebar: ");
        blk.setLebar(Integer.parseInt(rd.readLine()));
        System.out.print("Tinggi: ");
        blk.setTinggi(Integer.parseInt(rd.readLine()));
        System.out.println("Luas Balok: " + blk.totalVolume());
    }
}
