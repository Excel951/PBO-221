package PBO221.M221005.LatihanInheritance3;

import java.io.*;

public class mainClass {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        employee employee = new employee("", "", "", "", "");

        try {
            System.out.print("Masukkan ID: ");
            String id = reader.readLine();
            System.out.print("Masukkan nama: ");
            String nm = reader.readLine();
            System.out.print("Masukkan alamat: ");
            String alm = reader.readLine();
            System.out.print("Masukkan departemen: ");
            String dpt = reader.readLine();
            System.out.print("Masukkan title: ");
            String ttl = reader.readLine();
            System.out.println("======================");

            employee = new employee(id, nm, alm, dpt, ttl);

            employee.getData();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
