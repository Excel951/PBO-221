package PBO221.M221109.Praktikum.AbstractManusia;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static int umur;
    public static double tb;

    public static void inputan() {
        try {
            System.out.print("Masukkan umur (tahun): ");
            umur = Integer.parseInt(reader.readLine());
            System.out.print("Masukkan tinggi badan (cm): ");
            tb = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void main(String[] args) {
        Manusia laki = new Laki_laki();
        Manusia perempuan = new Perempuan();

        int menu;

        try {
            while (true) {
                System.out.println("============== KALKULATOR BERAT BADAN ==============");
                System.out.println("1. Hitung\n2. Exit");
                menu = Integer.parseInt(reader.readLine());
                switch (menu) {
                    case 1:
                        System.out.println("Gender:\n1. Laki-laki\n2. Perempuan");
                        System.out.print("Silahkan Pilih Gender: ");
                        menu = Integer.parseInt(reader.readLine());
                        switch (menu) {
                            case 1:
                                inputan();
                                laki = new Laki_laki(tb, umur);
                                laki.HtgBB();
                                laki.cetakHasil();
                                break;

                            case 2:
                                inputan();
                                perempuan = new Perempuan(tb, umur);
                                perempuan.HtgBB();
                                perempuan.cetakHasil();
                                break;

                            default:
                                break;
                        }
                        break;

                    case 2:
                        System.exit(0);
                        break;

                    default:
                        break;
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
