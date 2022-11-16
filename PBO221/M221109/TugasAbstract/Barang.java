package PBO221.M221109.TugasAbstract;

import java.io.*;
import java.util.*;

public abstract class Barang {
    static String kodeBarang, namaBarang;
    static int harga, stok;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    Date date = new Date();

    public Barang() {

    }

    public Barang(String kodeBarang, String namaBarang, int harga, int stok) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.stok = stok;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    abstract void entriData() throws IOException;

    abstract void invoice();

    abstract int stokUpdate();
}
