package PBO221.M221005.Praktikum.kehidupansehari2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class mainClass {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Masukkan jumlah karyawan: ");
            int jumlah = Integer.parseInt(reader.readLine());
            kantor karyawan[] = new kantor[jumlah];

            System.out.println("=================================");

            for (int i = 0; i < karyawan.length; i++) {
                System.out.print("Masukkan data karyawan ke" + (i + 1));
                System.out.print("\n1. Masukkan NIK: ");
                String nik = reader.readLine();
                System.out.print("2. Masukkan nama: ");
                String nm = reader.readLine();
                System.out.print("3. Masukkan kelamin: ");
                String sex = reader.readLine();
                System.out.print("4. Masukkan pendidikan terakhir: ");
                String lastSchool = reader.readLine();
                System.out.print("5. Masukkan ID karyawan: ");
                String id = reader.readLine();
                System.out.print("6. Masukkan Jabatan (Manager/Karyawan): ");
                String job = reader.readLine();
                System.out.println("=================================");

                karyawan[i] = new kantor(nik, nm, sex, lastSchool, id, job);
            }

            for (int index = 0; index < karyawan.length; index++) {
                karyawan[index].cetakData();
                System.out.println("=================================");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
