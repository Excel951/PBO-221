package PBO221.M220914.TransaksiHP;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        Handphone hp = new Handphone();
        Samsung s = new Samsung();

        try {
            do {
                System.out.println("========== GEDS CELL ==========");
                System.out.println("1. Isi Data HP");
                System.out.println("2. Beli HP");
                System.out.println("3. Keluar Aplikasi");
                System.out.print("Pilih menu: ");
                int menu = Integer.parseInt(rd.readLine());

                switch (menu) {
                    case 1:
                        System.out.println("===== ISI DATA =====");
                        System.out.print("Tipe: ");
                        hp.setTipe(rd.readLine());
                        System.out.print("Warna: ");
                        hp.setWarna(rd.readLine());
                        System.out.print("Kapasitas: ");
                        hp.setKapasitas(rd.readLine());
                        System.out.print("Harga: ");
                        s.setHarga(Integer.parseInt(rd.readLine()));
                        System.out.println();
                        break;

                    case 2:
                        System.out.println("===== BELI HP =====");
                        System.out.print("Jumlah beli: ");
                        s.setJumlah(Integer.parseInt(rd.readLine()));
                        System.out.println("Total bayar: " + s.getBeli());
                        break;

                    case 3:
                        System.exit(0);
                        break;

                    default:
                        break;
                }
            } while (true);
        } catch (Exception e) {
            System.out.println("Inputan Salah");
        }

    }

}