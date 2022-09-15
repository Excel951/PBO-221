import java.io.*;

import PBO221.M220914.Tugas.karyawan;
import PBO221.M220914.Tugas.mahasiswa;
import PBO221.M220914.Tugas.undika;

public class main {
    public static void main(String[] args) {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        undika univ = new undika();
        karyawan kry = new karyawan();
        mahasiswa mhs = new mahasiswa();

        try {
            do {
                System.out.println("========== MENU ==========");
                System.out.println("1. Cek SPP Mahasiswa");
                System.out.println("2. Cek Gaji Karyawan");
                System.out.println("3. Keluar Aplikasi");
                System.out.print("Pilih menu: ");
                int menu = Integer.parseInt(rd.readLine());
                System.out.println("====================");
                switch (menu) {
                    case 1:
                        System.out.println("========== INPUT DATA ==========");
                        System.out.print("Nama\t\t: ");
                        univ.setNama(rd.readLine());
                        System.out.print("Alamat\t\t: ");
                        univ.setAlamat(rd.readLine());
                        System.out.print("NIM\t\t: ");
                        mhs.setNim(rd.readLine());
                        System.out.print("Prodi\t\t: ");
                        mhs.setProdi(rd.readLine());
                        System.out.print("Angkatan\t: ");
                        mhs.setAngkatan(Integer.parseInt(rd.readLine()));
                        mhs.setSPP();
                        System.out.print("Semester\t: ");
                        mhs.setSemester(Integer.parseInt(rd.readLine()));

                        System.out.println("========== SPP Mahasiswa ==========");
                        System.out.println("Nama\t\t: " + univ.getNama());
                        System.out.println("Alamat\t\t: " + univ.getAlamat());
                        System.out.println("NIM\t\t: " + mhs.getNim());
                        System.out.println("Prodi\t\t: " + mhs.getProdi());
                        System.out.println("Angkatan\t: " + mhs.getAngkatan());
                        System.out.println("Semester\t: " + mhs.getSemester());
                        System.out.println("SPP\t\t: Rp " + mhs.getSPP());
                        System.out.println("===================================");
                        break;

                    case 2:
                        System.out.println("========== INPUT DATA ==========");
                        System.out.print("Nama\t\t: ");
                        univ.setNama(rd.readLine());
                        System.out.print("Alamat\t\t: ");
                        univ.setAlamat(rd.readLine());
                        System.out.print("NIK\t\t: ");
                        kry.setNIK(rd.readLine());
                        System.out.print("Bagian\t\t: ");
                        kry.setBagian(rd.readLine());
                        System.out.print("Kehadiran\t: ");
                        kry.setKehadiran(Integer.parseInt(rd.readLine()));
                        System.out.print("Gaji per hari\t: ");
                        kry.setGaji(Integer.parseInt(rd.readLine()));

                        System.out.println("========== Gaji Karyawan ==========");
                        System.out.println("Nama\t\t: " + univ.getNama());
                        System.out.println("Alamat\t\t: " + univ.getAlamat());
                        System.out.println("NIK\t\t: " + kry.getNIK());
                        System.out.println("Bagian\t\t: " + kry.getBagian());
                        System.out.println("Kehadiran\t: " + kry.getKehadiran());
                        System.out.println("Gaji per hari\t: " + kry.getGPH());
                        System.out.println("Total gaji\t: " + kry.getGaji());
                        System.out.println("===================================");
                        break;

                    case 3:
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
