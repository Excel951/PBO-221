package PBO221.M220914.Tugas;

public class karyawan {
    private String nik, bagian;
    private int kehadiran, gaji_per_hari, totalGaji;

    // setter
    public void setNIK(String nik) {
        this.nik = nik;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public void setGaji(int gph) {
        gaji_per_hari = gph;
    }

    // getter
    public String getNIK() {
        return this.nik;
    }

    public String getBagian() {
        return this.bagian;
    }

    public int getKehadiran() {
        return this.kehadiran;
    }

    public int getGPH() {
        return this.gaji_per_hari;
    }

    public int getGaji() {
        totalGaji = getGPH() * getKehadiran();
        return this.totalGaji;
    }
}