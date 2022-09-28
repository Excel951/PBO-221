package PBO221.M220928.Praktikum;

public class mahasiswa {
    private String nim, nama, alamat, pin;
    private int semester, spp, angkatan;

    public mahasiswa() {
        nim = "admin";
        nama = "admin";
        alamat = "null";
        pin = "admin";
        semester = 0;
        spp = 0;
        angkatan = 0;
    }

    public mahasiswa(String nim, String nama, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        pin = "123456";
    }

    // ganti pin
    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setAngkatan() {
        angkatan = Integer.parseInt(getNim().substring(0, 2));
        if (angkatan >= 19) {
            spp = 17000000;
        } else {
            spp = 15000000;
        }
    }

    // getter
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getSemester() {
        return semester;
    }

    public int getSPP() {
        return spp;
    }

    public int getAngkatan() {
        return angkatan;
    }

}
