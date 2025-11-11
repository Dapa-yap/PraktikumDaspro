package MINGGU_13;
import java.util.Scanner;
public class biskopwithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] [] penonton = new String [4][2];
        while (true) {
            System.out.println("Masukkan nama penonton: (exit untuk keluar)");
            String nama = sc.nextLine();
            if (nama.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println("Masukkan baris: ");
            int baris = sc.nextInt();
            System.out.println("Masukkan kolom: ");
            int kolom = sc.nextInt();
            sc.nextLine();
        
            penonton[baris-1][kolom-1] = nama;
            System.out.println("Ingin menambahkan penonton lagi? (y/n)");
            String next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
        System.out.println("Daftar Penonton: ");
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Penonton pada baris ke-" + (i + 1) + ":" + String.join(",", penonton[i]));
        }
    }
}
        
