import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();
        String [] namaPesanan = new String[jumlahPesanan];
        int [] pesanan = new int[jumlahPesanan];
        for (int i = 0; i < pesanan.length; i++) {
            System.out.print("Masukkan Makanan/Minuman  " + (i+1) + ": ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga masing-masing: " +(i+1)+": ");
            pesanan[i] = sc.nextInt();
            sc.nextLine();
        }
        for (int i = 0; i < pesanan.length; i++) {
            System.out.println("Pesanan " + (i+1) + ": " + pesanan[i]); 
        }
        int totalHarga = 0;
        for (int i = 0; i < pesanan.length; i++) {
            totalHarga += pesanan[i];
        }
        System.out.println("Total harga: " + totalHarga);
    }
}
