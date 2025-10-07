# JobSheet 5 PEMILIHAN

**Daffa Dwi Nugroho**
**TI 1C**

**2. Praktikum**

**2.1 Percobaan 1**
1. Mengapa pengecekan pada struktur IF tersebut tidak melibatkan kondisi dengan
operator relasional?
2. Saat program dijalankan, kemudian Anda mengisikan nilai false, bagaimana hasilnya?
3. Sistem perlu memberikan informasi apabila pengguna memasukkan nilai false, maka
terdapat keluaran “Registrasi ditolak. Silakan lunasi UKT terlebih dahulu”. Modifikasi
program tersebut dengan menambahkan struktur ELSE!
4. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi
Percobaan 1”
<p>**Jawaban**</p>

1. Karena kondisi yang dibutuhkan hanya 1 kondisi saja tidak lebih

2. hasilnya akan menunjukan negasi dari true yaitu registrasi ditolak  dan silahkan lunasi UKT terlebih dahulu

3. codingan

![Flowchart 1](https://github.com/Dapa-yap/PraktikumDaspro/blob/main/MINGGU_7/img/prak.png?raw=true)

**2.2 Percobaan 2**
1. Apa fungsi dari sintaks break?
2. Apa peran dari sintaks default pada struktur pemilihan SWITCH-CASE?
3. Buat file baru dengan nama ifElseCetakKRSNoPresensi.java. File ini berisi program hasil
transformasi dari program cetak KRS menggunakan struktur SWITCH-CASE yang telah
dibuat ke dalam bentuk IF-ELSE IF-ELSE.
4. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi
Percobaan 2”
<p>**Jawaban**</p>

1. Sintaks break digunakan untuk menghentikan atau keluar dari suatu blok perulangan (looping) atau struktur switch-case sebelum selesai seluruhnya dijalankan.

2. default digunakan untuk menangani kasus yang tidak sesuai dengan semua pilihan case

3. codingan

![Flowchart 2](https://github.com/Dapa-yap/PraktikumDaspro/blob/main/MINGGU_7/img/2.png?raw=true)

**2.3 Percobaan 3**
1. Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen?
Mengapa demikian?
2. Jelaskan maksud dari potongan kode berikut!
3. Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara
runtut untuk semua kondisi!

<p>**Jawaban**</p>

1. akan langsung mengeluarkan hasil bahwa dia gagal karena tanggungan kompen
2. jika log pembimbing 1 lebih dari 8 atau sama dengan 8 dan log pembimbing 2 lebih dari 4 atau sama dengan 4 maka dia bisa daftar ujian skripsi jika hanya salah satu maka tidak bisa daftar ujian skripsi
3. alur pemeriksaan syarat mahasiswa dari awal sampai akhir adalah jika mahasiswa lanjut bebas kompen maka akan mengecek log pembimbing 1 dan log pembimbing 2 jika log pembimbing 1 lebih dari 8 atau sama dengan 8 dan log pembimbing 2 lebih dari 4 atau sama dengan 4 maka dia bisa daftar ujian skripsi jika hanya salah satu maka tidak bisa daftar ujian skripsi jika tidak bebas kompen maka akan langsung mengeluarkan hasil bahwa dia gagal karena tanggungan kompen