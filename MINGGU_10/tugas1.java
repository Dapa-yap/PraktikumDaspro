import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000;
        int totalTiket = 0;
        int tiket;
        double totalPenjualan = 0;
        String lanjut = "ya";
    do{
        System.out.print("Masukkan jumlah tiket yang dibeli: ");
        tiket = sc.nextInt();
        if (tiket > 4){
            totalPenjualan = (tiket)-(tiket * hargaTiket* 0.1);
        }else if (tiket > 10){
            totalPenjualan = (tiket)-(tiket * hargaTiket* 0.15);
        }else if (tiket < 0) {
            System.out.println("input tidak valid");
        }else {
            totalPenjualan = tiket * hargaTiket;
        }
        totalTiket += tiket;
        sc.nextLine();
        System.out.print("apakah ingin menambah tiket? (ya/tidak)");
        lanjut = sc.nextLine();
    }while (lanjut.equalsIgnoreCase("ya"));    
    System.out.println("total tiket: " + totalTiket);
    System.out.println("total penjualan: " + totalPenjualan);
    }
}