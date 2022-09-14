package PBO221.M220914.TransaksiHP;

public class Samsung {
    private int harga, jumlah, total;

    // setter
    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    // getter
    public int getHarga() {
        return this.harga;
    }

    public int getJumlah() {
        return this.jumlah;
    }

    // custom
    public int getBeli() {
        total = getHarga() * getJumlah();
        return total;
    }
}
