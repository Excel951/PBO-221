package PBO221.M220928.Praktikum;

import java.io.*;

public class mainClass {
    public static void main(String[] args) {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String username, password;

        admin adm = new admin();
        mahasiswa mhs = new mahasiswa("", "", "");

        try {
            System.out.println("=== MENU ===");
            System.out.println("1. Login admin\n2. Login mahasiswa\n3. Keluar");
            System.out.print("Pilih menu: ");
            int menu = Integer.parseInt(rd.readLine());
            switch (menu) {
                case 1:
                    System.out.println("=== login admin ===");
                    System.out.print("Masukkan username: ");
                    username = rd.readLine();
                    System.out.print("Masukkan password: ");
                    password = rd.readLine();
                    if (username.equals(adm.getUsername()) && password.equalsIgnoreCase(adm.getPassword())) {
                        System.out.println("Sukses...");
                        System.out.println("=== admin ===");
                        System.out.println("1. ubah pin mahasiswa");
                        System.out.println("2. ubah password admin");
                        System.out.print("Pilih menu: ");
                        menu = Integer.parseInt(rd.readLine());
                        switch (menu) {
                            case 1:

                                break;
                            case 2:

                                break;

                            default:
                                break;
                        }
                    } else {
                        System.out.println("Gagal...");
                    }
                    break;

                case 2:
                    System.out.println("=== login mahasiswa ===");
                    break;

                case 3:
                    System.out.println("Keluar...");
                    System.exit(0);
                    break;

                default:
                    break;
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
