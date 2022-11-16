package PBO221.M221109.TugasAbstract;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Barang barang = new DetailBarang();

        String namaBarang, kodeBarang, jenis;
        int stok, harga;

        try {
            do {
                System.out.println("\n========== MENU TOKO ==========");
                System.out.println("1. Entri Data Barang\n2. Entri Data Penjualan\n3. Keluar");
                System.out.print("Pilih menu: ");
                int menu = Integer.parseInt(reader.readLine());
                switch (menu) {
                    case 1:
                        System.out.println("\n========== DATA BARANG ==========");
                        System.out.print("Kode Barang: ");
                        kodeBarang = reader.readLine();
                        System.out.print("Nama Barang: ");
                        namaBarang = reader.readLine();
                        System.out.print("Jenis Barang: ");
                        jenis = reader.readLine();
                        System.out.print("Harga Barang: ");
                        harga = Integer.parseInt(reader.readLine());
                        System.out.print("Stok Barang: ");
                        stok = Integer.parseInt(reader.readLine());

                        barang = new DetailBarang(kodeBarang, namaBarang, harga, stok, jenis);

                        // barang.entriData();

                        break;

                    case 2:
                        barang.entriData();
                        System.out.print("Cetak Struk? Ya/Tidak: ");
                        String konfirm = reader.readLine();
                        if (konfirm.equalsIgnoreCase("ya")) {
                            barang.invoice();
                        } else {
                            System.out.println("Terima kasih telah berbelanja");
                        }

                        break;

                    case 3:
                        System.exit(0);
                        break;

                    default:
                        break;
                }
            } while (true);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
