package PBO221.M221005.Tugas_M4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class mainClass {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("======== PEMESANAN TIKET PESAWAT ========\n");
            System.out.print("Masukkan jumlah penumpang: ");
            int jmlPenumpang = Integer.parseInt(reader.readLine());
            System.out.println("\n====================================================");
            for (int i = 0; i < jmlPenumpang; i++) {
                System.out.println();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
