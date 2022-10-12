package PBO221.M221012.Praktikum.FileGadget;

public class Gadget {
    String ram, rom, displayType, displayWide, proc;

    /**
     * Innergadget constructor
     */
    public Gadget(String ram, String rom, String displayType, String displayWide, String proc) {
        this.ram = ram;
        this.rom = rom;
        this.displayType = displayType;
        this.displayWide = displayWide;
        this.proc = proc;
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

    // custom method
    public void print() {
        System.out.println("RAM: " + getRam());
        System.out.println("ROM: " + getRom());
        System.out.println("Display Type: " + getDisplayType());
        System.out.println("Display Wide: " + getDisplayWide());
        System.out.println("Processor: " + getProc());
    }
}
