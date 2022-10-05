package PBO221.M221005.Praktikum.kehidupansehari2;

public class person {
    String nik, nama, kelamin;

    // Constructor
    public person(String nik, String nama, String kelamin) {
        this.nik = nik;
        this.nama = nama;
        this.kelamin = kelamin;
    }

    // getter
    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    public String getKelamin() {
        return kelamin;
    }

    // custom method
    public void cetakData() {
        System.out
                .println("NIK\t\t\t: " + getNik() + "\nNama\t\t\t: " + getNama() + "\nKelamin\t\t\t: " + getKelamin());
    }
}
