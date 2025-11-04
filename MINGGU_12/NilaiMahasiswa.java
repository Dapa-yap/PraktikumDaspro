import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlahNilai = sc.nextInt();

        int[] nilaiMahasiswa = new int[jumlahNilai];
        int totalNilai = 0;

        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt();
            totalNilai += nilaiMahasiswa[i];
        }

        
        double rataRata = totalNilai / jumlahNilai;

        int nilaiTertinggi = nilaiMahasiswa[0];
        int nilaiTerendah = nilaiMahasiswa[0];

        for (int i = 1; i < jumlahNilai; i++) {
            if (nilaiMahasiswa[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMahasiswa[i];
            }
        }
        System.out.println("===== HASIL PERHITUNGAN NILAI MAHASISWA =====");
        System.out.println("Semua nilai yang dimasukkan: ");
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + " = " + nilaiMahasiswa[i]);
        }

        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
    }
}
