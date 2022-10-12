package PBO221.M221012.Praktikum.FileGadget;

public class Smartphone extends Gadget {

    public Smartphone(String ram, String rom, String displayType, String displayWide, String proc) {
        super(ram, rom, displayType, displayWide, proc);
        // TODO Auto-generated constructor stub
    }

    // getter
    public String getRam() {
        return ram;
    }

    public String getRom() {
        return rom;
    }

    public String getDisplayType() {
        return displayType;
    }

    public String getDisplayWide() {
        return displayWide;
    }

    public String getProc() {
        return proc;
    }

    @Override
    public void print() {
        System.out.println("Ini adalah Smartphone");
        // TODO Auto-generated method stub
        super.print();
    }
}
