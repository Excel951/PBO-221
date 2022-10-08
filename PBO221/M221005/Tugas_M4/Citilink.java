package PBO221.M221005.Tugas_M4;

public class Citilink extends Tiket {
    String kotaTujuan, noPesawat, noKursi;
    int jmlPenumpang, harga, total;

    public Citilink(String bookingID, String nik, String nama, String jenis_kelamin, String tglBerangkat,
            String tglKembali, String kotaAsal, String kotaTujuan, String noPesawat, String noKursi,
            int jmlPenumpang) {
        super(bookingID, nik, nama, jenis_kelamin, tglBerangkat, tglKembali, kotaAsal);
        // TODO Auto-generated constructor stub
        this.kotaTujuan = kotaTujuan;
        this.noPesawat = noPesawat;
        this.noKursi = noKursi;
        this.jmlPenumpang = jmlPenumpang;
    }

    // Getter
    public String getKotaTujuan() {
        return kotaTujuan;
    }

    public String getNoPesawat() {
        return noPesawat;
    }

    public String getNoKursi() {
        return noKursi;
    }

    public int getJmlPenumpang() {
        return jmlPenumpang;
    }

    public int getHarga() {
        if (getKotaAsal().equalsIgnoreCase("surabaya")) {
            if (getKotaTujuan().equalsIgnoreCase("bali") || getKotaTujuan().equalsIgnoreCase("lombok")) {
                harga = 700000;
            } else if (getKotaTujuan().equalsIgnoreCase("jakarta") || getKotaTujuan().equalsIgnoreCase("yogyakarta")) {
                harga = 800000;
            } else if (getKotaTujuan().equalsIgnoreCase("balikpapan") || getKotaTujuan().equalsIgnoreCase("makassar")) {
                harga = 850000;
            }
        } else if (getKotaAsal().equalsIgnoreCase("jakarta")) {
            if (getKotaTujuan().equalsIgnoreCase("bali") || getKotaTujuan().equalsIgnoreCase("lombok")) {
                harga = 1000000;
            } else if (getKotaTujuan().equalsIgnoreCase("surabaya") || getKotaTujuan().equalsIgnoreCase("yogyakarta")) {
                harga = 750000;
            } else if (getKotaTujuan().equalsIgnoreCase("balikpapan") || getKotaTujuan().equalsIgnoreCase("makassar")) {
                harga = 900000;
            }
        }
        return harga;
    }

    public int getTotal() {
        total = getHarga() * getJmlPenumpang();
        return total;
    }
}
