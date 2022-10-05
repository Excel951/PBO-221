package PBO221.M221005.Praktikum.kehidupansehari2;

public class pendidikan extends person {
    String pddkTerakhir;
    // sklhTerakhir;
    // boolean beasiswa;

    // Constructor
    public pendidikan(String nik, String nama, String kelamin, String pddkTerakhir) {
        super(nik, nama, kelamin);
        this.pddkTerakhir = pddkTerakhir;
        // this.sklhTerakhir = sklhTerakhir;
        // this.beasiswa = beasiswa;
        // TODO Auto-generated constructor stub
    }

    // getter
    public String getPddkTerakhir() {
        return pddkTerakhir;
    }

    // custom method
    @Override
    public void cetakData() {
        // TODO Auto-generated method stub
        super.cetakData();
        System.out.println("Pendidikan Terakhir\t: " + getPddkTerakhir());
    }

    // public String getSklhTerakhir() {
    // return sklhTerakhir;
    // }

    // public boolean getBeasiswa() {
    // return beasiswa;
    // }
}
