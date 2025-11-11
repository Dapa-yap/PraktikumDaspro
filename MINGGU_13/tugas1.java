package MINGGU_13;
import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int responden = 10;
        int pertanyaan = 6;
        int[][] data = new int[responden][pertanyaan];
        for (int i = 0; i < responden; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < pertanyaan; j++) {
                System.out.print("Nilai pertanyaan ke-" + (j + 1) + "(1-    5): ");
                data [i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < responden; i++) {
            double total = 0;
            for (int j = 0; j < pertanyaan; j++) {
                total += data[i][j];
            }
            double rata = total / pertanyaan;
            System.out.println("Rata rata tiap responden ke-" + (i + 1) + " : " + rata);
        }
        for (int j = 0; j < pertanyaan; j++) {
            double total = 0;
            for (int i = 0; i < responden; i++) {
                total += data[i][j];
            }
            double rata = total / responden;
            System.out.println("Rata rata tiap pertanyaan ke-" + (j + 1) + " : " + rata);
        }
        double totalsemua = 0;
        for (int i = 0; i < responden; i++) {
            for (int j = 0; j < pertanyaan; j++) {
                totalsemua += data[i][j];
            }
        }
        double ratasemua = totalsemua / (responden * pertanyaan);
        System.out.println("Rata rata semua responden: " + ratasemua);
    }
}
