package PBO221.M221005.Tugas_M4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class mainClass {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("======== PEMESANAN TIKET PESAWAT ========\n");
            System.out.print("Masukkan Jumlah Penumpang: ");
            int jmlPenumpang = Integer.parseInt(reader.readLine());
            System.out.println("\n====================================================");
            System.out.print("\nKota Asal (Surabaya/Jakarta): ");
            String kotaAsal = reader.readLine();
            System.out.print("Pilih Rute Tujuan");
            if (kotaAsal.equalsIgnoreCase("Surabaya")) {
                System.out.println("( Bali, Lombok, Jakarta, Yogyakarta, Balikpapan, Makassar )");
                System.out.print("\nKota Tujuan: ");
                String kotaTujuan = reader.readLine();
                System.out.print("\nTanggal Berangkat: ");
                String tglBerangkat = reader.readLine();
                System.out.print("\nPesan Tiket Pulang Pergi (Y/N): ");
                String pp = reader.readLine();
                if (pp.equalsIgnoreCase("Y")) {
                    System.out.print("\nTanggal Kembali: ");
                    String tglKembali = reader.readLine();
                } else {
                    String tglKembali="";
                }

                System.out.println("======== PILIH MASKAPAI ========");
                System.out.println("1. Lion Air\n2. Citilink");
                System.out.print("\nPilih Maskapai: ");
                int maskapai = Integer.parseInt(reader.readLine());

            }
            for (int i = 0; i < jmlPenumpang; i++) {
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
