import java.util.Scanner;
public class kafedowhile {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int kopi,teh,roti,totalharga;
     String namaPelanggan;
     int hargaKopi =12000;
     int hargaTeh =7000;
     int hargaRoti =20000;
     do {
        System.out.println("Masukkan nama pelanggan (ketik batal untuk keluar): ");
        namaPelanggan = sc.nextLine();
        if (namaPelanggan.equalsIgnoreCase("batal")) {
            System.out.println("Transaksi Batal");
            break;
        }
        System.out.println("Jumlah Kopi: ");
        kopi = sc.nextInt();
        System.out.println("Jumlah Teh: ");
        teh = sc.nextInt();
        System.out.println("Jumlah Roti: ");
        roti = sc.nextInt();
        totalharga =(kopi*hargaKopi)+(teh*hargaTeh)+(roti*hargaRoti);
        System.out.println("Total harga : Rp."+totalharga);
        sc.nextLine();
        

     }while (true);
    }
}
