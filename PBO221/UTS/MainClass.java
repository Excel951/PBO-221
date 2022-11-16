package PBO221.UTS;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainClass {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        Barang minuman = new Minuman();
        
        String namaBarang, kodeBarang, jenis;
        int stok, harga;

        try {
            do {
                System.out.println("\n========== MENU TOKO ==========");
                System.out.println("1. Entri Data Barang\n2. Entri Data Penjualan\n3. Keluar");
                System.out.print("Pilih menu: ");
                int menu=Integer.parseInt(reader.readLine());
                switch (menu) {
                    case 1:
                        System.out.println("\n========== DATA MINUMAN ==========");
                        System.out.print("Kode Barang: ");
                        kodeBarang=reader.readLine();
                        System.out.print("Nama Barang: ");
                        namaBarang=reader.readLine();
                        System.out.print("Jenis Barang: ");
                        jenis=reader.readLine();
                        System.out.print("Harga Barang: ");
                        harga=Integer.parseInt(reader.readLine());
                        System.out.print("Stok Barang: ");
                        stok=Integer.parseInt(reader.readLine());

                        minuman = new Minuman(kodeBarang, namaBarang, jenis, harga, stok);

                        minuman.entriData(minuman);

                        break;

                    case 2:
                        minuman.entriData();
                        System.out.print("Cetak Struk? Ya/Tidak: ");
                        String konfirm = reader.readLine();
                        if (konfirm.equalsIgnoreCase("ya")) {
                            minuman.struk();
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