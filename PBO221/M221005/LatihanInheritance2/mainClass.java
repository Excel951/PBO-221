package PBO221.M221005.LatihanInheritance2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;

import org.w3c.dom.UserDataHandler;

public class mainClass {
    public static void main(String[] args) {
        subClass sub = new subClass(null, null, 0, 0);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // mencari variabel dari inputan user
            System.out.print("1. Masukkan Nama: ");
            String nm = reader.readLine();
            System.out.print("2. Masukkan Keterangan: ");
            String ktr = reader.readLine();
            System.out.print("3. Masukkan Tinggi: ");
            int tg = Integer.parseInt(reader.readLine());
            System.out.print("4. Masukkan Usia: ");
            int us = Integer.parseInt(reader.readLine());

            // masukkan variabel inputan ke Constructor
            sub = new subClass(nm, ktr, tg, us);

            // menjalankan method dari subClass
            sub.halo();
            sub.cetak();
            sub.dataLengkap();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
