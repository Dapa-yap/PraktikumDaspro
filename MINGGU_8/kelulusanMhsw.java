import java.util.Scanner;

public class kelulusanMhsw {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilaiAvg;
        double nilaiAvg2;
        double nilaiAvg3;
        double nilaiAvgTotal;
        
        System.out.println("__ INPUT DATA MAHASISWA__");
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Nim Mahasiswa: ");
        String nim = sc.nextLine();
        
        System.out.println("====================================");
        System.out.println("         DATA MATA KULIAH 1         ");
        System.out.println("====================================");
        System.out.println("Mata Kuliah 1: Algoritma dan Pemrograman");
        System.out.print("Masukkan Nilai UTS anda: ");
        int uts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS anda: ");
        int uas = sc.nextInt();
        System.out.print("Masukkan Nilai Tugas anda: ");
        int tugas = sc.nextInt();
        
        sc.nextLine(); // membersihkan buffer

        System.out.println("====================================");
        System.out.println("         DATA MATA KULIAH 2         ");
        System.out.println("====================================");
        System.out.println("Mata Kuliah 2: Struktur Data");
        System.out.print("Masukkan Nilai UTS anda: ");
        int uts2 = sc.nextInt();
        System.out.print("Masukkan Nilai UAS anda: ");
        int uas2 = sc.nextInt();
        System.out.print("Masukkan Nilai Tugas anda: ");
        int tugas2 = sc.nextInt();

        System.out.println("====================================");
        System.out.println("         DATA MATA KULIAH 3         ");
        System.out.println("====================================");
        System.out.println("Mata Kuliah 3: Basis Data");
        System.out.print("Masukkan Nilai UTS anda: ");
        int uts3 = sc.nextInt();
        System.out.print("Masukkan Nilai UAS anda: ");
        int uas3 = sc.nextInt();
        System.out.print("Masukkan Nilai Tugas anda: ");
        int tugas3 = sc.nextInt();

        // Hitung nilai rata-rata masing-masing matkul
        nilaiAvg = (uts*0.3) + (uas*0.4) + (tugas*0.3) / 3.0;
        nilaiAvg2 = (uts2*0.3) + (uas2*0.4) + (tugas2*0.3) / 3.0;
        nilaiAvg3 = (uts3*0.3) + (uas3*0.4) + (tugas3*0.3) / 3.0;

        // Konversi nilai ke huruf
        String huruf1 = getNilaiHuruf(nilaiAvg);
        String huruf2 = getNilaiHuruf(nilaiAvg2);

        // Status lulus per matkul
        String status1 = (nilaiAvg >= 60) ? "LULUS" : "TIDAK";
        String status2 = (nilaiAvg2 >= 60) ? "LULUS" : "TIDAK";

        // Hitung rata-rata akhir
        nilaiAvgTotal = (nilaiAvg + nilaiAvg2 + nilaiAvg3) / 3.0;

        // OUTPUT
        System.out.println();
        System.out.println("================ HASIL PENILAIAN AKADEMIK ================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println();
        System.out.printf("%-22s %-6s %-6s %-6s %-13s %-11s %-8s%n", 
            "Mata Kuliah", "UTS", "UAS", "Tugas", "Nilai Akhir", "Nilai Huruf", "Status");
        System.out.println("----------------------------------------------------------------");
        System.out.printf("%-22s %-6d %-6d %-6d %-13.2f %-11s %-8s%n", 
            "Algoritma Pemrograman", uts, uas, tugas, nilaiAvg, huruf1, status1);
        System.out.printf("%-22s %-6d %-6d %-6d %-13.2f %-11s %-8s%n", 
            "Struktur Data", uts2, uas2, tugas2, nilaiAvg2, huruf2, status2);

        System.out.println();
        System.out.printf("Rata-rata Nilai Akhir: %.2f%n", nilaiAvgTotal);
        if (nilaiAvgTotal >= 70) {
            System.out.println("Status Semester : LULUS (Rata-rata ≥ 70)");
        } else if (nilaiAvgTotal >= 60 && nilaiAvgTotal <= 69){
            System.out.println("Status Semester : LULUS Bersyarat (Rata-rata 60-69)");
        }else 
            System.out.println("Status Semester : Tidak Lulus (Rata-rata < 60)");
        }
        System.out.println("==========================================================");

        sc.close();
    }

    // Fungsi konversi nilai angka ke huruf
    public static String getNilaiHuruf(double nilai) {
        if (nilai > 80 && nilai <= 100) {
            return "A";
        } else if (nilai > 73 && nilai <= 80) {
            return "B+";
        } else if (nilai > 65 && nilai <= 73) {
            return "B";
        } else if (nilai > 60 && nilai <= 65) {
            return "C+";
        } else if (nilai > 50 && nilai <= 60) {
            return "C";
        } else if (nilai > 39 && nilai <= 50) {
            return "D";
        } else {
            return "E";
        }
    }
}
