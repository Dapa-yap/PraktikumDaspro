
import java.util.Scanner;
public class iFCetakKRS10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("__Cetak KRS__");
        System.out.println("Apakah UKT sudah lunas? (true/false): ");
        boolean ukt = sc.nextBoolean();
        if (ukt) {
            System.out.println("Pembayaran UKT Terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi ditolak");
            System.out.println("Silahkan lakukan pembayaran Ukt terlebih dahulu");
        }
        System.out.println(ukt ? "Pembayaran UKT Terverifikasi" : "Silakan lunasi UKT terlebih dahulu");
    }
}
    
