package PBO221.M221109.TugasAbstract;

import java.io.IOException;
import java.sql.Date;

public class DetailBarang extends Barang {
    String kategori;
    int jumlahBeli, total;

    public DetailBarang(String kodeBarang, String namaBarang, int harga, int stok, String kategori) {
        super(kodeBarang, namaBarang, harga, stok);
        this.kategori = kategori;
        this.jumlahBeli = jumlahBeli;
        this.total = total;
    }

    public DetailBarang() {
    }

    @Override
    void entriData() throws IOException {
        // TODO Auto-generated method stub
        System.out.println("\n========== INPUT DATA PENJUALAN ==========");
        System.out.println("Hari/Tanggal: " + date.toString());
        System.out.print("\nKode Barang: ");
        kodeBarang = reader.readLine();
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Jenis Barang: " + getKategori());
        System.out.println("Harga: " + harga);
        System.out.println("Stok saat ini: " + stok);
        System.out.print("Jumlah yang dibeli: ");
        jumlahBeli = Integer.parseInt(reader.readLine());
        if (jumlahBeli <= stok) {
            System.out.println("Stok tersisa: " + stokUpdate());
            System.out.println("Total Bayar: " + getTotal());
        } else {
            System.out.println("Jumlah beli melebihi stok!!");
            System.out.println("Pembelian tidak dapat diproses!!");
            entriData();
        }

    }

    @Override
    void invoice() {
        // TODO Auto-generated method stub
        System.out.println("====================================================");
        System.out.println("Hari/Tanggal: " + date.toString());
        System.out.println("Kasir: Kasir 1");
        System.out.println("====================================================");
        System.out.println("Nama Barang: " + getNamaBarang());
        System.out.println("Jumlah: " + getJumlahBeli() + " x " + getHarga() + " = " + getTotal());
        System.out.println("=================================================");
        System.out.println("Total = " + getTotal());
        System.out.println("=================================================");
        System.out.println("Barang yang sudah dibeli tidak dapat dikembalikan");
        System.out.println("Terima kasih telah berbelanja");
        System.out.println();
    }

    @Override
    int stokUpdate() {
        // TODO Auto-generated method stub
        return super.stok = super.stok - getJumlahBeli();
        // return stok;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public int getTotal() {
        total = getJumlahBeli() * getHarga();
        return total;
    }

    public String getKategori() {
        return kategori;
    }

}
