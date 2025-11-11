package MINGGU_13;
import java.util.Scanner;
public class SIAKAD10 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int [][] nilai = new int[4][3];
     for (int i = 0; i < nilai.length; i++) {
        System.out.println("Input nilai mahasiswa ke- " + (i+1));
        int total = 0;
        for (int j = 0; j < nilai[i].length; j++) {
            System.out.print("Nilai ke- " + (j+1) + ": ");
            nilai[i][j] = sc.nextInt();
            total += nilai[i][j];
        }
        System.out.println("Nilai rata rata " + total/3);
    }
        System.out.println("\n==============================");
        System.out.println("Rata rata Nilai setiap mata kuliah: ");
        for (int j = 0; j < 3; j++) {
            double totalPermatkul = 0;
            for (int k = 0; k < 4; k++) {
                totalPermatkul += nilai[k][j];
            }
            System.out.println("Nilai rata rata mata kuliah ke- " + (j+1) + ": " + totalPermatkul/4);
        }
     }   
    }

