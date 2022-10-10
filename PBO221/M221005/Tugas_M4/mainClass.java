package PBO221.M221005.Tugas_M4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class mainClass {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        String tglKembali = "";
        int maskapai = 0, index = 0;
        String pesanlagi;

        try {
            do {
                System.out.println("======== PEMESANAN TIKET PESAWAT ========\n");
                System.out.print("Masukkan Jumlah Penumpang: ");
                int jmlPenumpang = Integer.parseInt(reader.readLine());

                // Tiket tiket = new Tiket("", "", "", "", "", "", "");

                System.out.println("\n====================================================");
                System.out.print("\nKota Asal (Surabaya/Jakarta): ");
                String kotaAsal = reader.readLine();
                System.out.print("Pilih Rute Tujuan");
                if (kotaAsal.equalsIgnoreCase("Surabaya")) {
                    System.out.println("( Bali, Lombok, Jakarta, Yogyakarta, Balikpapan, Makassar )");
                    System.out.print("\nKota Tujuan: ");
                    String kotaTujuan = reader.readLine();
                    System.out.print("\nTanggal Berangkat: ");
                    String tglBerangkat = reader.readLine();
                    System.out.print("\nPesan Tiket Pulang Pergi (Y/N): ");
                    String pp = reader.readLine();
                    if (pp.equalsIgnoreCase("Y")) {
                        System.out.print("\nTanggal Kembali: ");
                        tglKembali = reader.readLine();
                    }

                    System.out.println("======== PILIH MASKAPAI ========");
                    System.out.println("1. Lion Air\n2. Citilink");
                    System.out.print("\nPilih Maskapai: ");
                    maskapai = Integer.parseInt(reader.readLine());
                    switch (maskapai) {
                        case 1:
                            LionAir lion[] = new LionAir[jmlPenumpang];

                            System.out.println("======== Selamat Datang di Lion Air ========");
                            System.out.println("Silahkan isi data penumpang");
                            for (int i = 0; i < jmlPenumpang; i++) {
                                System.out.print("Booking ID: ");
                                String bookingID = reader.readLine();
                                System.out.print("NIK: ");
                                String nik = reader.readLine();
                                System.out.print("Nama: ");
                                String nama = reader.readLine();
                                System.out.print("Jenis Kelamin (L/P): ");
                                String kelamin = reader.readLine();
                                System.out.print("No. Pesawat: ");
                                String noPesawat = reader.readLine();
                                System.out.print("No. Kursi: ");
                                String noKursi = reader.readLine();
                                System.out.println("");

                                lion[i] = new LionAir(bookingID, nik, nama, kelamin, tglBerangkat, tglKembali,
                                        kotaAsal, kotaTujuan, noPesawat, noKursi, jmlPenumpang);
                            }

                            // Print
                            for (int i = 0; i < jmlPenumpang; i++) {
                                System.out.print("\n\nPreview Tiket Lion Air");
                                System.out.println("\n====================================================");
                                System.out.println("Booking ID: " + lion[i].getBookingID());
                                System.out.println("NIK: " + lion[i].getNik());
                                System.out.println("Nama: " + lion[i].getNama());
                                System.out.println("Kota Asal: " + lion[i].getKotaAsal());
                                System.out.println("Kota Tujuan: " + lion[i].getKotaTujuan());
                                System.out.println("Tanggal Berangkat: " + lion[i].getTglBerangkat());
                                System.out.println("Tanggal Kembali: " + lion[i].getTglKembali());
                                System.out.println("No. Pesawat: " + lion[i].getNoPesawat());
                                System.out.println("No. Kursi: " + lion[i].getNoKursi());
                                System.out.println("Harga Tiket: " + lion[i].getHarga() + "\n\n");
                            }

                            index = jmlPenumpang - 1;
                            System.out.println("Total: " + lion[index].getTotal());
                            break;

                        case 2:
                            Citilink citilink[] = new Citilink[jmlPenumpang];

                            System.out.println("======== Selamat Datang di Citilink ========");
                            System.out.println("Silahkan isi data penumpang");
                            for (int i = 0; i < jmlPenumpang; i++) {
                                System.out.print("Booking ID: ");
                                String bookingID = reader.readLine();
                                System.out.print("NIK: ");
                                String nik = reader.readLine();
                                System.out.print("Nama: ");
                                String nama = reader.readLine();
                                System.out.print("Jenis Kelamin (L/P): ");
                                String kelamin = reader.readLine();
                                System.out.print("No. Pesawat: ");
                                String noPesawat = reader.readLine();
                                System.out.print("No. Kursi: ");
                                String noKursi = reader.readLine();
                                System.out.println();

                                citilink[i] = new Citilink(bookingID, nik, nama, kelamin, tglBerangkat, tglKembali,
                                        kotaAsal, kotaTujuan, noPesawat, noKursi, jmlPenumpang);

                            }

                            // Print
                            for (int i = 0; i < jmlPenumpang; i++) {
                                System.out.print("\n\nPreview Tiket Citilink");
                                System.out.println("\n====================================================");
                                System.out.println("Booking ID: " + citilink[i].getBookingID());
                                System.out.println("NIK: " + citilink[i].getNik());
                                System.out.println("Nama: " + citilink[i].getNama());
                                System.out.println("Kota Asal: " + citilink[i].getKotaAsal());
                                System.out.println("Kota Tujuan: " + citilink[i].getKotaTujuan());
                                System.out.println("Tanggal Berangkat: " + citilink[i].getTglBerangkat());
                                System.out.println("Tanggal Kembali: " + citilink[i].getTglKembali());
                                System.out.println("No. Pesawat: " + citilink[i].getNoPesawat());
                                System.out.println("No. Kursi: " + citilink[i].getNoKursi());
                                System.out.println("Harga Tiket: " + citilink[i].getHarga() + "\n\n");
                            }

                            index = jmlPenumpang - 1;
                            System.out.println("Total: " + citilink[index].getTotal());
                            break;

                        default:
                            break;
                    }
                } else if (kotaAsal.equalsIgnoreCase("jakarta")) {
                    System.out.println("( Bali, Lombok, Jakarta, Yogyakarta, Balikpapan, Makassar )");
                    System.out.print("\nKota Tujuan: ");
                    String kotaTujuan = reader.readLine();
                    System.out.print("\nTanggal Berangkat: ");
                    String tglBerangkat = reader.readLine();
                    System.out.print("\nPesan Tiket Pulang Pergi (Y/N): ");
                    String pp = reader.readLine();
                    if (pp.equalsIgnoreCase("Y")) {
                        System.out.print("\nTanggal Kembali: ");
                        tglKembali = reader.readLine();
                    }

                    System.out.println("======== PILIH MASKAPAI ========");
                    System.out.println("1. Lion Air\n2. Citilink");
                    System.out.print("\nPilih Maskapai: ");
                    maskapai = Integer.parseInt(reader.readLine());
                    switch (maskapai) {
                        case 1:
                            LionAir lion[] = new LionAir[jmlPenumpang];

                            System.out.println("======== Selamat Datang di Lion Air ========");
                            System.out.println("Silahkan isi data penumpang");
                            for (int i = 0; i < jmlPenumpang; i++) {
                                System.out.print("Booking ID: ");
                                String bookingID = reader.readLine();
                                System.out.print("NIK: ");
                                String nik = reader.readLine();
                                System.out.print("Nama: ");
                                String nama = reader.readLine();
                                System.out.print("Jenis Kelamin (L/P): ");
                                String kelamin = reader.readLine();
                                System.out.print("No. Pesawat: ");
                                String noPesawat = reader.readLine();
                                System.out.print("No. Kursi: ");
                                String noKursi = reader.readLine();
                                System.out.println("");

                                lion[i] = new LionAir(bookingID, nik, nama, kelamin, tglBerangkat, tglKembali,
                                        kotaAsal, kotaTujuan, noPesawat, noKursi, jmlPenumpang);
                            }

                            // Print
                            for (int i = 0; i < jmlPenumpang; i++) {
                                System.out.print("\n\nPreview Tiket Lion Air");
                                System.out.println("\n====================================================");
                                System.out.println("Booking ID: " + lion[i].getBookingID());
                                System.out.println("NIK: " + lion[i].getNik());
                                System.out.println("Nama: " + lion[i].getNama());
                                System.out.println("Kota Asal: " + lion[i].getKotaAsal());
                                System.out.println("Kota Tujuan: " + lion[i].getKotaTujuan());
                                System.out.println("Tanggal Berangkat: " + lion[i].getTglBerangkat());
                                System.out.println("Tanggal Kembali: " + lion[i].getTglKembali());
                                System.out.println("No. Pesawat: " + lion[i].getNoPesawat());
                                System.out.println("No. Kursi: " + lion[i].getNoKursi());
                                System.out.println("Harga Tiket: " + lion[i].getHarga() + "\n\n");
                            }

                            index = jmlPenumpang - 1;
                            System.out.println("Total: " + lion[index].getTotal());
                            break;

                        case 2:
                            Citilink citilink[] = new Citilink[jmlPenumpang];

                            System.out.println("======== Selamat Datang di Citilink ========");
                            System.out.println("Silahkan isi data penumpang");
                            for (int i = 0; i < jmlPenumpang; i++) {
                                System.out.print("Booking ID: ");
                                String bookingID = reader.readLine();
                                System.out.print("NIK: ");
                                String nik = reader.readLine();
                                System.out.print("Nama: ");
                                String nama = reader.readLine();
                                System.out.print("Jenis Kelamin (L/P): ");
                                String kelamin = reader.readLine();
                                System.out.print("No. Pesawat: ");
                                String noPesawat = reader.readLine();
                                System.out.print("No. Kursi: ");
                                String noKursi = reader.readLine();
                                System.out.println();

                                citilink[i] = new Citilink(bookingID, nik, nama, kelamin, tglBerangkat, tglKembali,
                                        kotaAsal, kotaTujuan, noPesawat, noKursi, jmlPenumpang);

                            }

                            // Print
                            for (int i = 0; i < jmlPenumpang; i++) {
                                System.out.print("\n\nPreview Tiket Citilink");
                                System.out.println("\n====================================================");
                                System.out.println("Booking ID: " + citilink[i].getBookingID());
                                System.out.println("NIK: " + citilink[i].getNik());
                                System.out.println("Nama: " + citilink[i].getNama());
                                System.out.println("Kota Asal: " + citilink[i].getKotaAsal());
                                System.out.println("Kota Tujuan: " + citilink[i].getKotaTujuan());
                                System.out.println("Tanggal Berangkat: " + citilink[i].getTglBerangkat());
                                System.out.println("Tanggal Kembali: " + citilink[i].getTglKembali());
                                System.out.println("No. Pesawat: " + citilink[i].getNoPesawat());
                                System.out.println("No. Kursi: " + citilink[i].getNoKursi());
                                System.out.println("Harga Tiket: " + citilink[i].getHarga() + "\n\n");
                            }

                            index = jmlPenumpang - 1;
                            System.out.println("Total: " + citilink[index].getTotal());
                            break;

                        default:
                            break;
                    }
                }

                System.out.print("\n\nPesan Lagi (Y/N): ");
                pesanlagi = reader.readLine();
            } while (pesanlagi.equalsIgnoreCase("y"));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
