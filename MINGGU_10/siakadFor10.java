import java.util.Scanner;
public class siakadFor10 {
    public static void main(String[]args) {
            Scanner sc = new Scanner(System.in);
            double nilai;
            double tertinggi = 0;
            double terendah = 100;
            int jml_mhsw_lulus = 0;
            int jml_mhsw_tidak_lulus = 0;
            for (int i = 1; i <= 10; i++) { 
                System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
                nilai = sc.nextDouble();
                if (nilai > tertinggi) {
                    tertinggi = nilai;
                }
                if (nilai < terendah) {
                    terendah = nilai;
                }
                if (nilai >= 60) {
                    jml_mhsw_lulus++;
                } else {
                    jml_mhsw_tidak_lulus++;
                }
            }
            System.out.println("Nilai tertinggi: " + tertinggi);
            System.out.println("Nilai terendah: " + terendah);
            System.out.println("Jumlah mahasiswa lulus: " + jml_mhsw_lulus);
            System.out.println("Jumlah mahasiswa tidak lulus: " + jml_mhsw_tidak_lulus);
        }
    }