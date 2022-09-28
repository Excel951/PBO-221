package PBO221.M220928.Akun;

import java.io.*;

public class mainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        String username, password, oldpassword;
        int index;

        // pemanggilan objek ada 2 constructor
        // admin untuk admin dan akunbaru untuk akun baru
        akun admin = new akun();
        akun akunbaru = new akun("", "");

        // menu
        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Login admin\n2. Buat akun baru\n3. Lihat akun\n4. Ubah password\n5. Keluar");
            System.out.print("Pilih menu: ");
            int menu = Integer.parseInt(rd.readLine());
            switch (menu) {
                case 1:
                    System.out.println("=== login admin ===");
                    System.out.print("Masukkan username: ");
                    username = rd.readLine();
                    System.out.print("Masukkan password: ");
                    password = rd.readLine();

                    // mencocokkan username dan password
                    if (username.equalsIgnoreCase(admin.getUsername()) && password.equals(admin.getPassword())) {
                        System.out.println("Sukses...");
                    } else {
                        System.err.println("Gagal...");
                    }
                    break;

                case 2:
                    System.out.println("=== buat akun baru ===");
                    System.out.println("Masukkan username baru: ");
                    username = rd.readLine();
                    System.out.println("Masukkan password baru: ");
                    password = rd.readLine();

                    // set username dan password baru
                    akunbaru = new akun(username, password);

                    System.out.println("Sukses...");
                    break;

                case 3:
                    System.out.println("=== lihat akun ===");
                    System.out.println("1. Admin");
                    System.out.println("Username: " + admin.getUsername());
                    System.out.println("Password: " + admin.getPassword() + "\n");
                    System.out.println("2. Akun baru");
                    System.out.println("Username: " + akunbaru.getUsername());
                    System.out.println("Password: " + akunbaru.getPassword());
                    break;

                case 4:
                    index = 0;
                    System.out.println("=== ubah password ===");
                    do {
                        System.out.println("Masukkan password lama: ");
                        oldpassword = rd.readLine();
                        if (oldpassword.equals(akunbaru.getPassword())) {
                            System.out.println("Masukkan password baru: ");
                            password = rd.readLine();
                            akunbaru.setPassword(password);
                            System.out.println("Sukses...");
                        } else {
                            System.err.println("Gagal...");
                            index++;
                        }
                    } while (index <= 2);

                    break;

                case 5:
                    System.out.println("Keluar...");
                    System.exit(0);
                    break;

                default:
                    break;
            }
        } while (true);
    }
}
