package PBO221.UTS;

import java.io.*;
import java.util.*;

public class Minuman extends Barang {
    String jenis;
    int jumlahBeli, total, diskon;

    Date date = new Date();

    public Minuman() {
    }

    public Minuman(String kodeBarang, String namaBarang, String jenis, int harga, int stok) {
        super(kodeBarang, namaBarang, harga, stok);
        this.jenis=jenis;
        //TODO Auto-generated constructor stub
    }
    
    public String getJenis() {
        return jenis;
    }
    
    public int total() {
        return harga*jumlahBeli;
    }
    
    public int diskon() {
        if (total()>200000) {
            diskon=(int)(total()*0.1);
        } else {
            diskon=0;
        }
        return diskon;   
    }

    @Override
    public int stokUpdate() {
        // TODO Auto-generated method stub
        return super.stokUpdate()-jumlahBeli;
    }

    @Override
    public void entriData(Barang a) throws IOException {
        
        
    }

    @Override
    public void entriData() throws IOException {
        // TODO Auto-generated method stub
        super.entriData();
        System.out.println("\n========== INPUT DATA PENJUALAN ==========");
        System.out.println("Hari/Tanggal: "+date.toString());
        System.out.print("\nKode Barang: ");
        kodeBarang=reader.readLine();
        System.out.println("Nama Barang: "+namaBarang);
        System.out.println("Jenis Barang: "+getJenis());
        System.out.println("Harga: "+harga);
        System.out.println("Stok saat ini: "+stok);
        System.out.print("Jumlah yang dibeli: ");
        jumlahBeli=Integer.parseInt(reader.readLine());
        System.out.println("Stok tersisa: "+stokUpdate());
        System.out.println("Total Bayar: "+total());
        if (total()>200000) {
            System.out.println("Selamat Anda mendapatkan diskon 10%");
            System.out.println("Sisa Total Bayar: "+(total()-diskon()));
        }
        
    }
    
    @Override
    public void struk() {
        System.out.println("\n=================================================");
        System.out.println("                 TOKO MINUMAN");
        System.out.println("Hari/Tanggal: "+date.toString());
        System.out.println("Kasir: Admin");
        System.out.println("=================================================");
        System.out.println("Nama Barang: "+getNamaBarang());
        System.out.println("Jumlah: "+jumlahBeli+" x "+getHarga()+" = "+total());
        System.out.println("=================================================");
        System.out.println("Subtotal = "+total());
        System.out.println("Diskon = "+diskon());
        System.out.println("Total = "+(total()-diskon()));
        System.out.println("=================================================");
        System.out.println("Barang yang sudah dibeli tidak dapat dikembalikan");
        System.out.println("Terima kasih telah berbelanja");
        System.out.println();
    }
}
