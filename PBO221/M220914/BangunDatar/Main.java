package PBO221.M220914.BangunDatar;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        persegi pg = new persegi();
        persegipanjang pp = new persegipanjang();

        try {
            do {
                System.out.println("HITUNG LUAS DAN KELILING BANGUN DATAR");
                System.out.println("1. Persegi");
                System.out.println("2. Persegi Panjang");
                System.out.println("3. Segitiga");
                System.out.println("0. Exit");
                System.out.print("Pilih menu: ");
                int menu = Integer.parseInt(rd.readLine());
                switch (menu) {
                    case 1:
                        System.out.print("Sisi: ");
                        pg.setSisi(Integer.parseInt(rd.readLine()));
                        System.out.println("Luas: " + pg.hitungLuas());
                        System.out.println("Keliling: " + pg.hitungKeliling());
                        break;
                    case 2:
                        System.out.println("Panjang: ");
                        pp.setPanjang(Integer.parseInt(rd.readLine()));
                        System.out.println("Lebar: ");
                        pp.setLebar(Integer.parseInt(rd.readLine()));
                        System.out.println("Luas: " + pp.hitungLuas());
                        System.out.println("Keliling: " + pp.hitungKeliling());
                        break;
                    case 3:

                        break;
                    case 0:
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
