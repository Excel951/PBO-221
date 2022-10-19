package PBO221.M221019.Nilai;

import java.io.IOException;

public class MainClass {
    public static void main(String[] args) throws IOException {
        NilaiMK mk = new NilaiMK();
        NilaiMK npbo=new NilaiPBO();
        
        // panggil overriding mk
        mk.getData();
        mk.getData("Tutut");

        // panggil overriding npbo
        System.out.println("Ini overriding method");
        npbo.getData();
        npbo.cetak();
    }
}
