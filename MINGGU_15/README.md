# 🧪 PRAKTIKUM 14

Berisi hasil percobaan dari praktikum dasar pemrograman miinggu ke 14

## 👤 Identitas Mahasiswa

| Keterangan | Data                  |
| ---------- | --------------------- |
| **Nama**   | Daffa Dwi Nugroho     |
| **NIM**    | 254107020140          |
| **Absen**  | 10                    

## 2.1 
1. tidak, tipe data void digunakan ketika fungsi tersebut tidak mengembalikan nilai
3. jika menggunakan fungsi menu, lebih efektif jika membutuhkan lagi tidak perlu menulis kembali hanya cukup memanggil nama fungsinya
4. pertama dimulai dari program memanggil fungsi main terlebih dahulu setelah itu, main memanggil fungsi menu, semua perintah yang ada di fungsi menu tersebut terus selesai
## 2.2 
1. kegunaan parameter ialah ketika suatu fungsi membutuhkan data dari luar untuk diolah fungsi
2. agar saat fungsi berjalan ia bisa menampilkan nama pelanggannya dan mengetahui bahwa pelanggan tersebut dapat diskon atau tidak
3. parameter itu variable khusus/ variable lokal yang hanya ada di fungsi tersebut, sedangkan variable bisa juga berupa variable lokal atau global dan parameter itu dibuat di struktur fungsinya, jika variable bisa di programnya atau diluar fungsi 
4. cara kerjanya jika saat dipanggil dan panggilan tersebut true, maka algoritma di dalam fungsi akan menyatakan bahwa dia member, dan sebaliknya jika false maka algoritma yang ada didalam akan menyatakan bahwa dia bukan member
5. program akan eror, dikarenakan program membutuhkan 2 data yang data tersebut didapat saat memanggil fungsi tersebut
8. iya karena dengan penggunaan parlementer lebih efisien bisa dipakai untuk pelanggan berbeda beda, selain itu mudah dikembangkan, maksudnya jika ingin menambah sesuatu tinggal menambahkan parlementer, yang terakhir tidak perlu menulis kembali untuk pelanggan yang berbeda beda
## 2.3
1. kapan fungsi membutuhkan nilai return ketika fungsi tersebut masih dipakai di program main atau secara nyata nya ketika pengguna ingin membeli sesuatu nah dia dapat harga dari yang dia beli itu artinya dia membutuhkan nilai return agar mengetahui berapa harga yang dia beli, kapan fungsi tidak membutuhkan nilai return ketika fungsi tersebut hanya mengerjakan saja, secara nyatanya saat pengguna ingin membeli dia hanya menampilkan daftar menu saja, si pengguna tidak membutuhkan berapa harga yang dia beli
2. tipe datanya int dan parameternya pilihan menu dan jumlah pesanan, karena fungsi tersebut membutuhkan data pada nomer berapa menu dipesan dan jumlahnya berapa

## 2.4
1. karena tidak diketahui berapa jumlah pengunjung dengan pasti
3. tidak bisa, menurut aturan varargs varargs hanya bisa sekali dan itu digunakan di terakhir, contohnya String... nama, int... usia ini salah total
4. program tetap berjalan tapi tidak menghasilkan apa apa karena butuh data dari luar.

## 2.5
1. java memulai dari main, program meminta panjang, lebar dan tinggi, program menghitung luas dan menampilkannya, program menghitung volume balok dan menampilkannya selesai. tidak ada pemanggilan fungsi
2. output nya luas nya 12 dan volumenya 60, langkah awalnya program meminta panjang, lebar, dan tinggi, program menghitung luas dan menampilkannya dan menghitung volume balok dan menampilkannya selesai.
3.  fungsi main dijalankan terlebih dahulu, memanggil fungsi jumlah(1,1) karena return mengembalikan ke int temp, setelah itu meamnggil fungsi tampil jumlah, di fuungsi tampil jumlah memanggil fungsi jumlah(2,5) karena return mengembalikan ke tampil jumlah, terus memanggil fungsi tampil hingga kei, karena i = 7 dari penjumlahan terakhir maka program print angka 1234567 selesai.
4. fungsi menggunakan parameter ketika fungsi tersebut membutuhkan data dari luar, ketika fungsi tersebut hanya digunakan untuk menampilkan data yang sudah ada di dalam maka tidak perlu menggunakan parameter. fungsi menggunakan nilai kembali ketika data dari fungsi tersebut diperlukan oleh program lain atau fungsi tersebut ingin kita gunakan kembali, tidak perlu menggunakan nilai kembali jika fungsi tersebut tidak dibutuhkan oleh program lain atau fungsinya hanya menjalankan atau menampilkan.
5. mengacu pada hitungluas dan hitung volume fungsi sebaiknya menggunakan parameter karena fungsi tersebut membutuhkan data dari luar yaitu panjang,lebar dan tinggi, dan sebaliknya tidak perlu menggunakan parameter jika fungsi tersebut tidak memerlukan data dari luar jadi sudah ada data dari dalam
6. mengacu pada hitung luas dan hitung volume fungsi sebaiknya menggunakan nilai kembali karena pada fungsi hitung luas memerlukan nilai kembali yang akan digunakan di fungsi main dan juga di fungsi hitung volume, dan pada fungsi hitung volume juga memerlukan karena akan digunakan di fungsi main, dan sebaliknya tidak perlu menggunakan nilai kembali jika fungsi tersebut tidak memerlukan nilai kembali atau fungsi tersebut tidak digunakan kembali oleh fungsi yang lain.