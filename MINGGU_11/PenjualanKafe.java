import java.util.Scanner;

public class PenjualanKafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jml_pelanggan = 0;
        int jml_terjual = 0;

        System.out.print("Jumlah cabang kafe :");
        int jml_cabang = sc.nextInt();

        for (int i = 1; i <= jml_cabang; i++) {
            System.out.println("---Cabang " + i + "---");
            System.out.print("jumlah pelanggan : ");
            jml_pelanggan = sc.nextInt();

            int item_terjual =0;
            for (int j = 1; j <= jml_pelanggan ; j++) {
                System.out.print("pelanggan " + j + " memesan beberapa item ? ");
                item_terjual += sc.nextInt();
            }
            jml_terjual += item_terjual;
            jml_pelanggan += jml_pelanggan;
        }
        System.out.println("Jumlah cabang kafe : " + jml_cabang);
        System.out.println("Jumlah pelanggan : " + jml_pelanggan);
        System.out.println("Jumlah item terjual : " + jml_terjual);
    }
}