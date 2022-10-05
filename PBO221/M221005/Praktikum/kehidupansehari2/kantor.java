package PBO221.M221005.Praktikum.kehidupansehari2;

public class kantor extends pendidikan {
    String id, jabatan;
    int gaji;

    public kantor(String nik, String nama, String kelamin, String pddkTerakhir,
            String id, String jabatan) {
        super(nik, nama, kelamin, pddkTerakhir);
        this.id = id;
        this.jabatan = jabatan;
        if (super.pddkTerakhir.equalsIgnoreCase("s1")) {
            gaji = 3500000;
            if (jabatan.equalsIgnoreCase("manager")) {
                gaji *= 1.3;
            }
        } else if (super.pddkTerakhir.equalsIgnoreCase("s2")) {
            gaji = 4000000;
            if (jabatan.equalsIgnoreCase("manager")) {
                gaji *= 1.6;
            }
        }
        // TODO Auto-generated constructor stub
    }

    // getter
    public String getId() {
        return id;
    }

    public String getJabatan() {
        return jabatan;
    }

    public int getGaji() {
        return gaji;
    }

    // custom method
    @Override
    public void cetakData() {
        // TODO Auto-generated method stub
        super.cetakData();
        System.out
                .println("ID Karyawan\t\t: " + getId() + "\nJabatan\t\t\t: " + getJabatan() + "\nGaji\t\t\t: "
                        + getGaji());
    }
}
