import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] Makanan = {"Nasi goreng", "Mie goreng", "Roti bakar", "Kentang goreng", "Teh tarik", "Cappucino", "Chocolate Ice"};
        boolean ditemukan = false;
        System.out.println("Menu Makanan");
        for (int i = 0; i < Makanan.length; i++) {
            System.out.println((i+1) + ". " + Makanan[i]);
        }
        System.out.println("Masukkan pilihan menu yang anda inginkan: ");
        String pilihan = sc.nextLine();
        for (int i = 0; i < Makanan.length; i++) {
            if(Makanan[i].equalsIgnoreCase(pilihan)){
                System.out.println("Menu Makananan Tersedia: " + Makanan[i] + " tersedia di nomor " + (i+1));
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Maaf" + pilihan + "Menu Makanan Tidak Tersedia");
        }
    }
}