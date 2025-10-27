import java.util.Scanner;
public class tes2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan berapa ukuran : ");
        int ukuran = sc.nextInt();

        for (int i = ukuran; i >= 1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
