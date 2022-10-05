package PBO221.M221005.LatihanInheritance2;

public class subClass extends superClass {
    // atribut sub class
    private int tinggi, usia;

    public subClass(String nama, String keterangan, int tinggi, int usia) {
        super(nama, keterangan);
        this.tinggi = tinggi;
        this.usia = usia;
    }

    // getter
    public int getUsia() {
        return usia;
    }

    public int getTinggi() {
        return tinggi;
    }

    @Override
    public void cetak() {
        super.cetak();
    }

    @Override
    public void halo() {
        super.halo();
    }

    // custom method
    public void dataLengkap() {
        System.out.println(
                "Nama: " + super.getNama() + "\nKeterangan: " + super.getKeterangan() + "\nTinggi: " + getTinggi()
                        + " cm" + "\nUsia: " + getUsia());
    }
}
