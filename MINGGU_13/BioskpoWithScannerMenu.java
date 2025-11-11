package MINGGU_13;
import java.util.Scanner;

public class BioskpoWithScannerMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n=== MENU BIOSKOP MINI ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            int pilihan = sc.nextInt();
            sc.nextLine();
        
        if (pilihan == 1) {
            System.out.print("Masukkan nama penonton: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan baris: ");
            int baris = sc.nextInt();
            System.out.print("Masukkan kolom: ");
            int kolom = sc.nextInt();
            sc.nextLine();
            penonton[baris - 1][kolom - 1] = nama;
            if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                System.out.println("Baris atau kolom tidak valid!");
                continue;
    
            } 
            if (penonton[baris - 1][kolom - 1] != null) {
                System.out.println("Kursi sudah ditempati!");
                continue;
            }
        } else if (pilihan == 2) {
            System.out.println("\n=== DAFTAR PENONTON ===");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Baris ke-" + (i + 1) + ": ");
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("***");
                        } else {
                            System.out.print(penonton[i][j]);
                        }
                        if (j < penonton[i].length - 1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println();
                }
            } else if (pilihan == 3) {
                System.out.println("Terima kasih! Program selesai.");
                break;
            } else {
                System.out.println("Pilihan tidak valid, coba lagi!");
            }
        }

        sc.close();
    }
}
