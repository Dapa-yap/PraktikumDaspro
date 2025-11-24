import java.util.Scanner;

public class kafe10{
    public static void menu(String namaPelanggan, boolean isMember, String kodePromo){
        System.out.println("Selamat datang " + namaPelanggan + "!");
        if(isMember){
            System.out.println("Anda adalah member, Dapatkan diskon 10% untuk setiap pembelian!");

    }    
    if (kodePromo.equalsIgnoreCase("DISKON50")){
        System.out.println("Anda mendapatkan diskon 50%");

    }else if (kodePromo.equalsIgnoreCase("DISKON30")) {
        System.out.println("Anda mendapatkan diskon 30%");
    }else
        System.out.println("Kode invalid");
    
    System.out.println("== MENU RESTO KAFE ==");
    System.out.println("1. Kopi Hitam - Rp.15,000");
    System.out.println("2. Cappucino - Rp.20,000");
    System.out.println("3. Latte - Rp.22,000");
    System.out.println("4. Teh Tarik - Rp.12,000");
    System.out.println("5. Roti Bakar - Rp.10,000");
    System.out.println("6. Mie Goreng - Rp.18,000");
    System.out.println("============================");
    System.out.println("Silakan pilih menu yang anda inginkan");
}
    public static int hitungTotalharga(int pilihanMenu, int banyakItem, String kodePromo){
    int [] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};
    int hargaTotal = hargaItem[pilihanMenu-1]*banyakItem;
    if (kodePromo.equalsIgnoreCase("DISKON50")) {
        int diskon = hargaTotal/2;
        System.out.println("Anda mendapatkan diskon 50%");
        System.out.println("Diskonya dapat " + diskon);
        hargaTotal -= diskon;

    }else if (kodePromo.equalsIgnoreCase("DISKON30")) {
        int diskon = (int)(hargaTotal*0.3);
        System.out.println("Anda mendapatkan diskon 30%");
        System.out.println("Diskonnya dapat " + diskon);
        hargaTotal -= diskon;

    }else 
        System.out.println("Kode promo tidak valid");
    return hargaTotal;
}
public static void main(String[] args){
    menu("Budi", true, "DISKON30");
    Scanner sc = new Scanner(System.in);
    System.out.println("Berapa menu yang ingin anda pesan: ");
    int berapaMenu = sc.nextInt();
    String [] jumlahMenu = new String[berapaMenu];
    int totalKeseluruhan = 0;
    for (int i = 1; i <=jumlahMenu.length;i++){
        System.out.println("Masukkan nomor menu yang ingin anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.println("Masukkan jumlah item yang ingin anda pesan: ");
        int banyakItem = sc.nextInt();
        int totalHarga = hitungTotalharga(pilihanMenu, banyakItem, "DISKON30");
        System.out.println("Total harga untuk pesanan anda: " + totalHarga);
        totalKeseluruhan += totalHarga;
    }
    System.out.println("Total keseluruhan anda adalah "+ totalKeseluruhan);
        
    }
}