package PBO221.KalkulatorPraktikum;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Main
 */
public class Main {

    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static int angka1;
    public static int angka2;

    static void InputanAngka(int menu) {
        try {
            if (menu <= 4) {
                System.out.print("Angka 1: ");
                angka1 = Integer.parseInt(reader.readLine());
                System.out.print("Angka 2: ");
                angka2 = Integer.parseInt(reader.readLine());
            } else if (menu == 5 || menu == 7) {
                System.out.print("Angka: ");
                angka1 = Integer.parseInt(reader.readLine());
            } else {
                System.out.print("Angka: ");
                angka1 = Integer.parseInt(reader.readLine());
                System.out.print("Pangkat/Akar: ");
                angka2 = Integer.parseInt(reader.readLine());
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void main(String[] args) {

        InterfaceOperasi kalkulator = new Kalkulator();

        int menu;

        try {
            while (true) {
                System.out.println("==================== Kalkulator ====================");
                System.out.println(
                        "1: Tambah\n2: Kurang\n3: Kali\n4: Bagi\n5: Faktorial !n\n6: Pangkat\n7: Akar Kuadrat\nQ: Exit");
                System.out.println("====================================================");
                System.out.print("Masukkan nomor menu: ");
                menu = Integer.parseInt(reader.readLine());
                switch (menu) {
                    case 1:
                        System.out.println("==================== Penambahan ====================");
                        InputanAngka(menu);
                        kalkulator = new Kalkulator(angka1, angka2);
                        System.out.println("====================================================");
                        kalkulator.Penjumlahan();
                        System.out.println("====================================================");
                        break;

                    case 2:
                        System.out.println("==================== Pengurangan ===================");
                        InputanAngka(menu);
                        kalkulator = new Kalkulator(angka1, angka2);
                        System.out.println("====================================================");
                        kalkulator.Pengurangan();
                        System.out.println("====================================================");
                        break;

                    case 3:
                        System.out.println("==================== Perkalian =====================");
                        InputanAngka(menu);
                        kalkulator = new Kalkulator(angka1, angka2);
                        System.out.println("====================================================");
                        System.out.println("Hasil: " + kalkulator.Perkalian());
                        System.out.println("====================================================");
                        break;

                    case 4:
                        System.out.println("==================== Pembagian =====================");
                        InputanAngka(menu);
                        kalkulator = new Kalkulator(angka1, angka2);
                        System.out.println("====================================================");
                        System.out.println("Hasil: " + kalkulator.Pembagian());
                        System.out.println("====================================================");
                        break;

                    case 5:
                        System.out.println("=================== Faktorial n! ===================");
                        InputanAngka(menu);
                        kalkulator = new Kalkulator(angka1, 0);
                        System.out.println("====================================================");
                        System.out.println("Hasil: " + kalkulator.Faktorial());
                        System.out.println("====================================================");
                        break;

                    case 6:
                        System.out.println("===================== Pangkat ======================");
                        InputanAngka(menu);
                        kalkulator = new Kalkulator(angka1, angka2);
                        System.out.println("====================================================");
                        System.out.println("Hasil: " + kalkulator.Pangkat());
                        System.out.println("====================================================");
                        break;

                    case 7:
                        System.out.println("=================== Akar Kuadrat ===================");
                        InputanAngka(menu);
                        kalkulator = new Kalkulator(angka1, 0);
                        System.out.println("====================================================");
                        System.out.println("Hasil: " + kalkulator.AkarKuadrat());
                        System.out.println("====================================================");
                        break;

                    default:
                        break;
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("OK, Program Quitting");
        }
    }
}