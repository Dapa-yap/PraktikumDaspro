import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai : ");
        int nilai = sc.nextInt();
        if (nilai %2==0) {
            System.out.println("genap");
        } else {
            System.out.println("ganjil");
        }
    }
    
}
