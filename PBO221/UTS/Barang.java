package PBO221.UTS;

import java.io.*;

public class Barang {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String kodeBarang, namaBarang;
    int harga, stok;

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

    public int stokUpdate() {
        return stok;
    }

    public void entriData(Barang a) throws IOException {
        
    }

    public void entriData() throws IOException {
        
    }

    public void struk() {
        
    }
}
