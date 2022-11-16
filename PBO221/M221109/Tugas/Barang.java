package PBO221.M221109.Tugas;

public class Barang {
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
}
