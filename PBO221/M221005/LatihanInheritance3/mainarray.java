package PBO221.M221005.LatihanInheritance3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class mainarray {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // employee emp[] = new employee[0];

        try {
            System.out.print("Berapa data yang masuk:");
            int jml = Integer.parseInt(reader.readLine());
            employee emp[] = new employee[jml];

            for (int i = 0; i < emp.length; i++) {
                System.out.print("Masukkan ID: ");
                String id = reader.readLine();
                System.out.print("Masukkan nama: ");
                String nm = reader.readLine();
                System.out.print("Masukkan alamat: ");
                String alm = reader.readLine();
                // System.out.print("Masukkan departemen: ");
                // String dpt = reader.readLine();
                System.out.print("Masukkan title: ");
                String ttl = reader.readLine();
                System.out.println("======================");

                emp[i] = new employee(id, nm, alm, null, ttl);
            }

            for (int i = 0; i < emp.length; i++) {
                emp[i].getData();
                System.out.println("======================");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
