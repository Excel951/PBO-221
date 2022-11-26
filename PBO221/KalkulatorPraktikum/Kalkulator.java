package PBO221.KalkulatorPraktikum;

public class Kalkulator implements InterfaceOperasi {

    double angka1, angka2;

    double hasil = 1;

    public Kalkulator() {
    }

    public Kalkulator(double angka1, double angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    @Override
    public void Penjumlahan() {
        // TODO Auto-generated method stub
        hasil = getAngka1() + getAngka2();
        System.out.println("Hasil: " + hasil);
    }

    @Override
    public void Pengurangan() {
        // TODO Auto-generated method stub
        hasil = getAngka1() - getAngka2();
        System.out.println("Hasil: " + hasil);
    }

    @Override
    public double Perkalian() {
        // TODO Auto-generated method stub
        hasil = getAngka1() * getAngka2();
        return hasil;
    }

    @Override
    public double Pembagian() {
        // TODO Auto-generated method stub
        hasil = getAngka1() / getAngka2();
        return hasil;
    }

    @Override
    public double Pangkat() {
        // TODO Auto-generated method stub
        hasil = Math.pow(angka1, angka2);
        return hasil;
    }

    @Override
    public double Faktorial() {
        // TODO Auto-generated method stub
        for (int i = 1; i <= angka1; i++) {
            hasil *= i;
        }
        return hasil;
    }

    @Override
    public double AkarKuadrat() {
        // TODO Auto-generated method stub
        hasil = Math.sqrt(angka1);
        return hasil;
    }

    public double getAngka1() {
        return angka1;
    }

    public double getAngka2() {
        return angka2;
    }

}
