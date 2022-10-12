package PBO221.M221012.Praktikum.FileGadget;

public class Laptop extends Gadget {

    public Laptop(String ram, String rom, String displayType, String displayWide, String proc) {
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

    // inheritance print
    @Override
    public void print() {
        System.out.println("Ini adalah Laptop");
        // TODO Auto-generated method stub
        super.print();
    }
}
