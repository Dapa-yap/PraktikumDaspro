package MINGGU_13;
import java.util.Scanner;
public class SIAKAD10 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Masukkan Jumlah Mahasiswa: ");
     int jumlahMahasiswa = sc.nextInt();
     sc.nextLine();
     System.out.println("Masukkan Jumlah Mata Kuliah: ");
     int jumlahMataKuliah = sc.nextInt();
     int [][] nilai = new int[jumlahMahasiswa][jumlahMataKuliah];
     for (int i = 0; i < jumlahMahasiswa; i++) {
        System.out.println("Input nilai mahasiswa ke- " + (i+1));
        int total = 0;
        for (int j = 0; j < jumlahMataKuliah; j++) {
            System.out.print("Nilai ke- " + (j+1) + ": ");
            nilai[i][j] = sc.nextInt();
            total += nilai[i][j];
        }
        System.out.println("Nilai rata rata " + total/jumlahMataKuliah);
    }
        System.out.println("\n==============================");
        System.out.println("Rata rata Nilai setiap mata kuliah: ");
        for (int j = 0; j < jumlahMataKuliah; j++) {
            double totalPermatkul = 0;
            for (int k = 0; k < jumlahMahasiswa; k++) {
                totalPermatkul += nilai[k][j];
            }
            System.out.println("Nilai rata rata mata kuliah ke- " + (j+1) + ": " + totalPermatkul/jumlahMahasiswa);
        }
     }   
    }

