package PBO221.M221109.Praktikum.AbstractManusia;

public class Laki_laki extends Manusia {
    int umur;

    public Laki_laki() {
    }

    public Laki_laki(double tinggiBadan, int umur) {
        super(tinggiBadan);
        this.umur = umur;
    }

    @Override
    double HtgBB() {
        // TODO Auto-generated method stub
        double bb = 0;

        if (getUmur() > 10) {
            bb = (getTinggiBadan() - 100) - ((getTinggiBadan() - 100) * 0.1);
        } else {
            bb = (getTinggiBadan() * 2 + 8);
        }

        return bb;
    }

    @Override
    void cetakHasil() {
        // TODO Auto-generated method stub
        System.out.println("============== Hasil Hitung BB Laki-laki ==============");
        System.out.println("Tinggi badan: " + getTinggiBadan() + " cm");
        System.out.println("Umur: " + getUmur() + " tahun");
        if (getUmur() > 10) {
            System.out.println("Anda dikategorikan sebagai orang dewasa");
            System.out.println("Berat badan ideal = " + HtgBB());
            System.out.println("Jika berat badan Anda > " + HtgBB() + " maka dinyatakan gendut");
            System.out.println("Jika berat badan Anda < " + HtgBB() + " maka dinyatakan kurus");
        } else {
            System.out.println("Anda dikategorikan sebagai anak-anak");
            System.out.println("Berat badan ideal = " + HtgBB());
            System.out.println("Jika berat badan Anda > " + HtgBB() + " maka dinyatakan gendut");
            System.out.println("Jika berat badan Anda < " + HtgBB() + " maka dinyatakan kurus");
        }
    }

    public int getUmur() {
        return umur;
    }

}
