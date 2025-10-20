import java.util.Scanner;
public class wifiGratis {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Layanan Wifi Gratis");
    System.out.println("Masukkan jenis pengguna Dosen/Mahasiswa/Lainnya");
    String jenisPengguna = sc.nextLine();
    if (jenisPengguna.equals("Dosen")) {
        System.out.println("Selamat datang di layanan wifi gratis");
    } else if (jenisPengguna.equals("Mahasiswa")) {
        System.out.println("Masukkan jumlah sks ");
        int sks = sc.nextInt(); 
        if (sks >= 12) {
            System.out.println("Selamat datang di layanan wifi gratis");
        } else {
            System.out.println("Anda tidak dapat menggunakan layanan wifi gratis");
        }
    } else {
        System.out.println("Anda tidak dapat menggunakan layanan wifi gratis");
    }
    
    
}
}