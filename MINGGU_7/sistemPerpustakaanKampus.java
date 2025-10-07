import java.util.Scanner;

public class sistemPerpustakaanKampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("__Sistem Perpustakaan Kampus__");
        System.out.println("Apakah kamu membawa kartu mahasiswa ");
        boolean kartuMahasiswa = sc.nextBoolean();
        System.out.println("Apakah kamu sudah melakukan registrasi online");
        boolean registrasiOnline = sc.nextBoolean();
        if (kartuMahasiswa || registrasiOnline) {
            System.out.println("Kamu dapat masuk perpustakaan");
        } else {
            System.out.println("Kamu tidak dapat masuk perpustakaan");
        }
    
    
}
}