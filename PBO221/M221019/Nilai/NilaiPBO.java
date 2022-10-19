package PBO221.M221019.Nilai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NilaiPBO extends NilaiMK {
    int uts, uas, tugas;

    @Override
    public void getData() throws IOException {
        // TODO Auto-generated method stub
        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        
        System.out.print("UTS: ");
        uts=Integer.parseInt(reader.readLine());
        System.out.print("UAS: ");
        uas=Integer.parseInt(reader.readLine());
        System.out.print("Tugas: ");
        tugas=Integer.parseInt(reader.readLine());
    }

    @Override
    public int hitungNilai(int uts, int uas, int tugas) {
        // TODO Auto-generated method stub
        return (int) (this.uts*0.25+uas*0.25+tugas*0.5);
    }

    @Override
    public void cetak() {
        System.out.println("Nilai PBO: "+hitungNilai(uts, uas, tugas));
    }
   
}
