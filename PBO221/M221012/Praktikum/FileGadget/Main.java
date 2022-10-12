package PBO221.M221012.Praktikum.FileGadget;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Gadget laptop = new Laptop("32", "1024 GB", "IPS", "15.6 inch", "Snapdragon");
        Gadget smartphone = new Smartphone("8", "512 GB", "Amoled", "6.0 inch", "Intel");

        System.out.println("Laptop");
        System.out.println("RAM: " + laptop.getRam());
        System.out.println("ROM: " + laptop.getRom());
        System.out.println("Display Type: " + laptop.getDisplayType());
        System.out.println("Display Wide: " + laptop.getDisplayWide());
        System.out.println("Processor: " + laptop.getProc());

        System.out.println("\nSmartphone");
        System.out.println("RAM: " + smartphone.getRam());
        System.out.println("ROM: " + smartphone.getRom());
        System.out.println("Display Type: " + smartphone.getDisplayType());
        System.out.println("Display Wide: " + smartphone.getDisplayWide());
        System.out.println("Processor: " + smartphone.getProc());
    }
}
