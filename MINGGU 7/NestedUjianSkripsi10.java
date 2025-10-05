import java.util.Scanner;
public class NestedUjianSkripsi10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;
        System.out.println("Apakah mahasiswa bebas kompen? (ya/tidak): ");
        String bebasKompen = sc.nextLine().trim();
        System.out.println("Masukkan jumlah log pembimbing 1");
        int logPembimbing1 = sc.nextInt();
        System.out.println("Masukkan jumlah log pembimbing 2");
        int logPembimbing2 = sc.nextInt();
        if (bebasKompen.equals("ya")) {
            if (logPembimbing1 >= 8 && logPembimbing2 >= 4) {
                pesan = "Anda bisa daftar ujian skripsi";
            } else if (logPembimbing1 <8 && logPembimbing2 <4) {
                pesan = "Tidak bisa daftar ujian skripsi";
            } else if (logPembimbing1 < 8){
                pesan = "Tidak bisa daftar ujian skripsi";
            } else {
                pesan = "Tidak bisa daftar ujian skripsi";
            }
        } else {
            pesan = "Tidak lulus ujian skripsi";
        }
        System.out.println(pesan);        
    }
    
}
