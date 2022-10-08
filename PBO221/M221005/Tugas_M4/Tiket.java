package PBO221.M221005.Tugas_M4;

/**
 * Tiket
 */
public class Tiket {
    String bookingID, nik, nama, jenis_kelamin, tglBerangkat, tglKembali, kotaAsal;

    /**
     * InnerTiket
     */

    // Constructor
    public Tiket(String bookingID, String nik, String nama, String jenis_kelamin, String tglBerangkat,
            String tglKembali, String kotaAsal) {
        this.bookingID = bookingID;
        this.nik = nik;
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.tglBerangkat = tglBerangkat;
        this.tglKembali = tglKembali;
        this.kotaAsal = kotaAsal;
    }

    // Getter
    public String getBookingID() {
        return bookingID;
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public String getTglBerangkat() {
        return tglBerangkat;
    }

    public String getTglKembali() {
        return tglKembali;
    }

    public String getKotaAsal() {
        return kotaAsal;
    }
}