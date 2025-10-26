import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis;
        int durasi;
        int total = 0;
        do {
            System.out.println("Masukkan jenis kendaraan (1 = motor, 2 = mobil, 0 = selesai)");
            jenis = sc.nextInt();
            if (jenis == 1 || jenis == 2){
            System.out.println(" Masukkan durasi sewa (jam)");
            durasi = sc.nextInt();
            if (durasi >5){
                total += 12500;
                System.out.println("Total harga: "+total);
            } else if (jenis == 1){
                total += durasi*3000;
                System.out.println("Total harga: "+total);
            } else if (jenis == 2){
                total += durasi*2000;
                System.out.println("Total harga: "+total);
            } else {
                System.out.println("input tidak valid");
            }
        }
        } while (jenis != 0);
        System.out.println("Terima kasih");
    }
}