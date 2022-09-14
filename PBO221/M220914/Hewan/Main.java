package PBO221.M220914.Hewan;

public class Main {
    public static void main(String[] args) {
        // ingin mengakses suara, tipe, usia dari class Animal
        Animal burung = new Animal();
        Animal ikan = new Animal();

        // ingin mengakses method class dari Bird dan Fish
        Bird b = new Bird();
        Fish i = new Fish();

        // cara isi dari suara, tipe, dan usia
        burung.setTipe("Kakatua");
        burung.setSuara("Ki Kuk Ki Kuk");
        burung.setUsia(1);

        ikan.setTipe("Paus");
        ikan.setSuara("Pssst");
        ikan.setUsia(20);

        // cara ambil dari setter hewan, ikan, dan burung
        System.out.println(
                "Aku " + burung.getTipe() + ", suaraku berbunyi " + burung.getSuara() + ", usiaku " + burung.getUsia()
                        + " tahun");
        b.terbang();

        System.out.println();

        System.out.println(
                "Aku " + ikan.getTipe() + ", suaraku berbunyi " + ikan.getSuara() + ", usiaku " + ikan.getUsia()
                        + " tahun");
        i.berenang();
    }
}
