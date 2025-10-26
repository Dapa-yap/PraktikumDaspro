import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // untuk menghitung kelipatan 5
        System.out.println("Menghitung kelipatan 5");
        for (int i = 5; i <= 50 ; i +=5) {
            System.out.println(i + "");
        }
        System.out.println("Deret menurun dari 10 ke 1");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i + "");
        }
        System.out.println("Deret kuadrat dari 1 ke 10");
        for (int i = 1; i < 10 ; i++) {
            System.out.println(i * i + "");
        }
        System.out.println("Faktorial");
        int nomor = sc.nextInt();
        long faktorial = 1;
        for (int i = 1; i <= nomor; i++) {
            faktorial *= i;
        }
        System.out.println("faktorial nya dari " + nomor + " adalah " + faktorial);
    }
}
