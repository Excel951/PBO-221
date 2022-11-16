package PBO221.M221109.Tugas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;

public class Barang implements InterfaceTransaksi {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String kodeBarang, namaBarang;
    int harga, stok;

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

    @Override
    public void invoice() {
        // TODO Auto-generated method stub

    }

    @Override
    public int stokUpdate() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void inputData() {
        // TODO Auto-generated method stub

    }

    @Override
    public void inputPenjualan() {
        // TODO Auto-generated method stub

    }
}
