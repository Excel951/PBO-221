package PBO221.M221005.LatihanInheritance2;

public class superClass {
    // atribut super class
    String nama, keterangan;

    // constructor atau pengganti setter
    public superClass(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }

    // getter
    public String getNama() {
        return nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    // method custom
    public void cetak() {
        System.out.println(getNama() + " " + getKeterangan());
    }

    public void halo() {
        System.out.println("Halo");
    }
}
