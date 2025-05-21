package project_uts;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class Project_uts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data pengguna
        System.out.print("Masukkan No. Urut : ");
        String no = input.nextLine();

        System.out.print("Masukkan No.Kursi : ");
        String nim = input.nextLine();

        System.out.print("Masukkan Nama     : ");
        String nama = input.nextLine();

        // Pilihan kota asal
        System.out.println("Pilih Kota Asal :");
        System.out.println("1. Jakarta");
        System.out.println("2. Bandung");
        System.out.println("3. Surabaya");
        System.out.println("4. Yogyakarta");
        System.out.println("5. Semarang");
        System.out.println("6. Bali");
        System.out.print("Pilihan (1-6): ");
        int pilihAsal = input.nextInt();
        String asal = switch (pilihAsal) {
            case 1 -> "Jakarta";
            case 2 -> "Bandung";
            case 3 -> "Surabaya";
            case 4 -> "Yogyakarta";
            case 5 -> "Semarang";
            case 6 -> "Bali";
            default -> "Tidak Valid";
        };

        // Pilihan kota tujuan
        System.out.println("Pilih Kota Tujuan:");
        System.out.println("1. Yogyakarta");
        System.out.println("2. Semarang");
        System.out.println("3. Bali");
        System.out.println("4. Jakarta");
        System.out.println("5. Bandung");
        System.out.println("6. Surabaya");
        System.out.print("Pilihan (1-6): ");
        int pilihTujuan = input.nextInt();
        String tujuan = switch (pilihTujuan) {
            case 1 -> "Yogyakarta";
            case 2 -> "Semarang";
            case 3 -> "Bali";
            case 4 -> "Jakarta";
            case 5 -> "Bandung";
            case 6 -> "Surabaya";
            default -> "Tidak Valid";
        };

        // Cek jika asal sama dengan tujuan
        if (asal.equals(tujuan)) {
            System.out.println("Kota asal dan tujuan tidak boleh sama.");
            return;
        }

        // Pilihan kelas bus
        System.out.println("Pilih Kelas Bus:");
        System.out.println("1. Ekonomi");
        System.out.println("2. Bisnis");
        System.out.println("3. Eksekutif");
        System.out.print("Pilihan (1-3): ");
        int pilihKelas = input.nextInt();
        String kelas = switch (pilihKelas) {
            case 1 -> "Ekonomi";
            case 2 -> "Bisnis";
            case 3 -> "Eksekutif";
            default -> "Tidak Valid";
        };

        // Input jumlah penumpang
        System.out.print("Masukkan Jumlah Penumpang: ");
        int jumlahPenumpang = input.nextInt();

        // PENERAPAN IF MAJEMUK
        // Tentukan jarak
        int jarak = 0; // dalam kilometer
        if ((asal.equals("Jakarta") && tujuan.equals("Yogyakarta")) || (asal.equals("Yogyakarta") && tujuan.equals("Jakarta"))) {
            jarak = 540;
        } else if ((asal.equals("Jakarta") && tujuan.equals("Semarang")) || (asal.equals("Semarang") && tujuan.equals("Jakarta"))) {
            jarak = 455;
        } else if ((asal.equals("Jakarta") && tujuan.equals("Bali")) || (asal.equals("Bali") && tujuan.equals("Jakarta"))) {
            jarak = 1200;
        } else if ((asal.equals("Bandung") && tujuan.equals("Yogyakarta")) || (asal.equals("Yogyakarta") && tujuan.equals("Bandung"))) {
            jarak = 390;
        } else if ((asal.equals("Bandung") && tujuan.equals("Semarang")) || (asal.equals("Semarang") && tujuan.equals("Bandung"))) {
            jarak = 350;
        } else if ((asal.equals("Bandung") && tujuan.equals("Bali")) || (asal.equals("Bali") && tujuan.equals("Bandung"))) {
            jarak = 1100;
        } else if ((asal.equals("Surabaya") && tujuan.equals("Yogyakarta")) || (asal.equals("Yogyakarta") && tujuan.equals("Surabaya"))) {
            jarak = 330;
        } else if ((asal.equals("Surabaya") && tujuan.equals("Semarang")) || (asal.equals("Semarang") && tujuan.equals("Surabaya"))) {
            jarak = 320;
        } else if ((asal.equals("Surabaya") && tujuan.equals("Bali")) || (asal.equals("Bali") && tujuan.equals("Surabaya"))) {
            jarak = 410;
        } else {
            System.out.println("Rute tidak tersedia untuk kombinasi asal dan tujuan ini.");
            return;
        }

        // PENERAPAN IF MAJEMUK
        // Tentukan tarif per km berdasarkan kelas
        double tarifPerKm;
        if (kelas.equals("Eksekutif")) {
            tarifPerKm = 800;
        } else if (kelas.equals("Bisnis")) {
            tarifPerKm = 600;
        } else {
            tarifPerKm = 400;
        }

        // Hitung harga tiket total (per orang)
        double hargaTiket = jarak * tarifPerKm;
        
        // PENERAPAN IF BERSARANG
        // Hitung diskon
        double diskon = 0;
        if (jumlahPenumpang >= 3) {
            if (kelas.equals("Eksekutif")) {
                diskon = 0.15 * (hargaTiket * jumlahPenumpang);
            } else if (kelas.equals("Bisnis")) {
                diskon = 0.10 * (hargaTiket * jumlahPenumpang);
            } else {
                diskon = 0.05 * (hargaTiket * jumlahPenumpang);
            }
        }

        // Biaya layanan tetap
        double biayaLayanan = 2000;

        // Hitung total harga akhir
        double totalHarga = (hargaTiket * jumlahPenumpang) + biayaLayanan - diskon;
        
        // Format untuk mengkonversi ke rupiah
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));
        
        String sTarifPerKm     = rupiahFormat.format(tarifPerKm);
        String sHargaTiket     = rupiahFormat.format(hargaTiket);
        String sDiskon         = rupiahFormat.format(diskon);
        String sBiayaLayanan   = rupiahFormat.format(biayaLayanan);
        String sTotalHarga     = rupiahFormat.format(totalHarga);
        
        //Format untuk menampilkan tanggal dan waktu secara otomatis
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatterTanggal = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterWaktu = DateTimeFormatter.ofPattern("HH:mm");

        String tanggal = now.format(formatterTanggal);
        String waktu = now.format(formatterWaktu);
        // Tampilkan hasil
        System.out.println("");
        System.out.println("Nota :");
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("|                       NUSANTARA EKSPRES                     |");
        System.out.println("|                     Tiket Perjalanan Bus                    |");
        System.out.println("|=============================================================|");
        System.out.printf ("| No. Urut : %-49s|%n", "TK-" + no);                                    
        System.out.printf ("| Tanggal  : " + tanggal + "                      Waktu: " + waktu + " WIB |");
        System.out.println("");
        System.out.println("|-------------------------------------------------------------|");
        System.out.println("| INFORMASI PENUMPANG                                         |");
        System.out.printf ("| Nama         : %-45s|%n", nama);
        System.out.printf ("| No.Kursi     : %-45s|%n", nim);
        System.out.println("|-------------------------------------------------------------|");
        System.out.println("| INFORMASI PERJALANAN                                        |");
        System.out.printf ("| Kota Asal    : %-45s|%n", asal);
        System.out.printf ("| Kota Tujuan  : %-45s|%n", tujuan);
        System.out.printf ("| Jarak Tempuh : %-4s km                                      |%n", jarak);
        System.out.printf ("| Kelas Bus    : %-45s|%n", kelas);
        System.out.println("|-------------------------------------------------------------|");
        System.out.println("| DETAIL PEMBAYARAN                                           |");
        System.out.printf ("| Tarif per Km : %-45s|%n", sTarifPerKm);
        System.out.printf ("| Harga Tiket  : %-45s|%n", sHargaTiket);
        System.out.printf ("| Diskon       : %-45s|%n", sDiskon);
        System.out.printf ("| Biaya Layanan: %-45s|%n", sBiayaLayanan);
        System.out.println("|-------------------------------------------------------------|");
        System.out.printf ("| TOTAL BAYAR  : %-45s|%n", sTotalHarga);
        System.out.println("|=============================================================|");
        System.out.println("| Terima kasih telah memilih layanan kami!                    |");
        System.out.println("| Simpan tiket ini sebagai bukti perjalanan Anda              |");
        System.out.println("+-------------------------------------------------------------+");
    }
}
