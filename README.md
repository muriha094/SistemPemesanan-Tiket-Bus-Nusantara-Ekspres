# 🚍 Nusantara Ekspres - Aplikasi Pemesanan Tiket Bus

Aplikasi berbasis Java yang digunakan untuk melakukan simulasi pemesanan tiket bus antarkota di Indonesia. Aplikasi ini bekerja melalui interaksi konsol dan menghitung total harga tiket berdasarkan kota asal dan tujuan, kelas layanan, serta jumlah penumpang.

---

## 📋 Fitur Utama

- Input data penumpang (nama, nomor kursi, nomor urut)
- Pemilihan kota asal dan kota tujuan
- Validasi rute (asal ≠ tujuan)
- Pemilihan kelas bus: Ekonomi, Bisnis, Eksekutif
- Hitung tarif berdasarkan jarak dan kelas
- Diskon untuk jumlah penumpang ≥ 3 orang
- Tambahan biaya layanan tetap
- Output nota tiket dengan format profesional
- Tanggal dan waktu otomatis

---

## 🔁 Alur Kerja Sistem

Berikut adalah alur kerja sistem Nusantara Ekspres:

1. **Input Data Pengguna**:
   - Nomor urut
   - Nomor kursi
   - Nama penumpang

2. **Pilih Kota Asal dan Tujuan**:
   - Sistem menampilkan 6 pilihan kota.
   - Validasi: kota asal dan tujuan tidak boleh sama.

3. **Pilih Kelas Bus**:
   - Ekonomi
   - Bisnis
   - Eksekutif

4. **Input Jumlah Penumpang**

5. **Hitung Jarak Tempuh**:
   - Jarak antar kota ditentukan dengan if-else majemuk.

6. **Hitung Tarif per Kilometer**:
   - Berdasarkan kelas yang dipilih.

7. **Hitung Harga Tiket**:
   - Tarif per km × Jarak × Jumlah penumpang

8. **Hitung Diskon (Jika Berlaku)**:
   - Jumlah penumpang ≥ 3 → diskon berdasarkan kelas.

9. **Tambahkan Biaya Layanan Tetap**
   - Rp2.000 per transaksi

10. **Hitung Total Pembayaran**:
    - Harga tiket × jumlah penumpang - diskon + biaya layanan

11. **Tampilkan Nota Pembayaran**
    - Informasi lengkap ditampilkan di konsol.

---

## 🏷️ Struktur Tarif dan Diskon

| Kelas     | Tarif per km | Diskon (Penumpang ≥ 3) |
|-----------|---------------|-----------------------|
| Ekonomi   | Rp400         | 5%                    |
| Bisnis    | Rp600         | 10%                   |
| Eksekutif | Rp800         | 15%                   |

> Biaya layanan: **Rp2.000** (tetap)

---

## 🛠️ Teknologi yang Digunakan

- **Bahasa**: Java
- **Library**:
  - `java.util.Scanner` untuk input
  - `java.text.NumberFormat` untuk format rupiah
  - `java.time.LocalDateTime` dan `DateTimeFormatter` untuk tanggal dan waktu

---

## ▶️ Cara Menjalankan

1. **Clone atau Download Proyek dari GitHub**
   ```bash
   git clone https://github.com/usernameAnda/nusantara-ekspres.git
2. Buka IDE Java seperti IntelliJ, Eclipse, NetBeans, Vs Code.
3. Pilih folder yang sudah didownloa/clone tadi
4. Kemudian, jalankan program.
5. Ikuti petunjuk input di terminal.
6. Program akan mencetak nota tiket setelah input lengkap dan valid.

## 🗒️ Contoh output

1. Output dengan diskon
   
   ![Screenshot 2025-05-21 215341](https://github.com/user-attachments/assets/766134a1-bdc9-44ae-ba13-66bbb94e543a)

2. Output tanpa diskon

   ![Screenshot 2025-05-21 215645](https://github.com/user-attachments/assets/cdce5e15-aa95-4b9e-83f0-626e2aeac8a3)

