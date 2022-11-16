package PBO221.M221109.Tugas;

public class AlatMusik extends Barang {
    String kategori;
    int jumlahBeli, total;

    public AlatMusik(String kodeBarang, String namaBarang, int harga, int stok, String kategori) {
        super(kodeBarang, namaBarang, harga, stok);
        this.kategori = kategori;
        this.jumlahBeli = jumlahBeli;
        this.total = total;
    }

    public AlatMusik() {
    }

    @Override
    public void invoice() {
        // TODO Auto-generated method stub
        System.out.println("\n=================================================");
        System.out.println("Hari/Tanggal: " + date.toString());
        System.out.println("Kasir: Admin");
        System.out.println("=================================================");
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
    public int stokUpdate() {
        // TODO Auto-generated method stub
        return super.stok = super.stok - getJumlahBeli();
    }

    public String getKategori() {
        return kategori;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public int getTotal() {
        return total;
    }

    @Override
    public void inputData() {
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
        System.out.println("Stok tersisa: " + stokUpdate());
        System.out.println("Total Bayar: " + getTotal());
    }

    @Override
    public void inputPenjualan() {
        // TODO Auto-generated method stub

    }

}
