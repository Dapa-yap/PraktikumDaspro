import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int total = 0;
            System.out.print("n= " + i + "   -> jumlah kuadrat = ");
            for (int j = 1; j <= i; j++) {
                int kuadrat = j * j;
                total += kuadrat;
                System.out.print(kuadrat);

                if (j < i) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + total);
        }
    }
}
