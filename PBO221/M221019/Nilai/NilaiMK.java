package PBO221.M221019.Nilai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NilaiMK {
    String nim, nama;

    // constructor
    // public NilaiMK(String nim, String nama) {
    //     this.nim=nim;
    //     this.nama=nama;
    // }

    // fungsi berparameter ==> overriding method
    public int hitungNilai(int uts, int uas, int tugas) {
        return (int) (0.3*uts+0.3*uas+0.4*tugas);
    }

    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    // overloading method
    public void getData() throws IOException {

        // input
        System.out.print("NIM: ");
        nim=reader.readLine();
        System.out.print("Nama: ");
        nama=reader.readLine();
        System.out.println("Ini adalah method getData tanpa parameter: "+nim+", "+nama);

    }

    public void getData(String namaDosen) {
        System.out.println("Nama Mahasiswa: "+nama);
        System.out.println("Nama Dosen Wali: "+namaDosen);
        System.out.println();
    }

    public void cetak() {
    }
}
