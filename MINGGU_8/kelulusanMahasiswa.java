import java.util.Scanner;
public class kelulusanMahasiswa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilaiAvg, nilaiAvg2, nilaiAvg3, nilaiAvgTotal;
        
        System.out.println("__ INPUT DATA MAHASISWA__");
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Nim Mahasiswa: ");
        String nim = sc.nextLine();
        
        // ================= MATKUL 1 =================
        System.out.println("\n====================================");
        System.out.println("         DATA MATA KULIAH 1         ");
        System.out.println("====================================");
        System.out.println("Mata Kuliah 1: Algoritma dan Pemrograman");
        System.out.print("Masukkan Nilai UTS: ");
        double uts = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas = sc.nextDouble();
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = sc.nextDouble();

        nilaiAvg = (uts * 0.3) + (uas * 0.4) + (tugas * 0.3);
        boolean lulus1 = nilaiAvg >= 60;

        // ================= MATKUL 2 =================
        System.out.println("\n====================================");
        System.out.println("         DATA MATA KULIAH 2         ");
        System.out.println("====================================");
        System.out.println("Mata Kuliah 2: Struktur Data");
        System.out.print("Masukkan Nilai UTS: ");
        double uts2 = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas2 = sc.nextDouble();
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas2 = sc.nextDouble();

        nilaiAvg2 = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);
        boolean lulus2 = nilaiAvg2 >= 60;

        // ================= MATKUL 3 =================
        System.out.println("\n====================================");
        System.out.println("         DATA MATA KULIAH 3         ");
        System.out.println("====================================");
        System.out.println("Mata Kuliah 3: Basis Data");
        System.out.print("Masukkan Nilai UTS: ");
        double uts3 = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas3 = sc.nextDouble();
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas3 = sc.nextDouble();

        nilaiAvg3 = (uts3 * 0.3) + (uas3 * 0.4) + (tugas3 * 0.3);
        boolean lulus3 = nilaiAvg3 >= 60;

        // ================= HASIL SETIAP MATKUL =================
        System.out.println("\n====================================");
        System.out.println("          HASIL PENILAIAN           ");
        System.out.println("====================================");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("NIM Mahasiswa  : " + nim);
        System.out.println("------------------------------------");
        System.out.println("Mata Kuliah 1 : " + (lulus1 ? "Lulus" : "Tidak Lulus"));
        System.out.println("Mata Kuliah 2 : " + (lulus2 ? "Lulus" : "Tidak Lulus"));
        System.out.println("Mata Kuliah 3 : " + (lulus3 ? "Lulus" : "Tidak Lulus"));
        System.out.println("------------------------------------");

        // ================= CEK SEMUA LULUS BARU HITUNG RATA-RATA =================
        if (lulus1 && lulus2 && lulus3) {
            nilaiAvgTotal = (nilaiAvg + nilaiAvg2 + nilaiAvg3) / 3;
            System.out.println("SEMUA MATA KULIAH LULUS ✅");
            System.out.println("Nilai rata-rata akhir: " + nilaiAvgTotal);

            if (nilaiAvgTotal >= 70) {
                System.out.println("Status Semester Anda: Lulus");
            } else if (nilaiAvgTotal >= 60) {
                System.out.println("Status Semester Anda: Lulus dengan bersyarat");
            } else {
                System.out.println("Status Semester Anda: Tidak Lulus");
            }
        } else {
            System.out.println("❌ Anda belum lulus semua mata kuliah.");
            System.out.println("Rata-rata nilai akhir tidak dapat dihitung.");
        }

        System.out.println("====================================");
    }
}
