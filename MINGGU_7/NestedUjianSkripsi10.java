import java.util.Scanner;

public class NestedUjianSkripsi10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;

        System.out.print("Apakah mahasiswa bebas kompen? (ya/tidak): ");
        String bebasKompen = sc.nextLine().trim();

        if (bebasKompen.equalsIgnoreCase("ya")) {
            System.out.print("Masukkan jumlah log pembimbing 1: ");
            int logPembimbing1 = sc.nextInt();

            System.out.print("Masukkan jumlah log pembimbing 2: ");
            int logPembimbing2 = sc.nextInt();

            if (logPembimbing1 >= 8 && logPembimbing2 >= 4) {
                pesan = "Anda bisa daftar ujian skripsi";
            } else if (logPembimbing1 < 8 && logPembimbing2 < 4) {
                pesan = "Tidak bisa daftar ujian skripsi";
            } else if (logPembimbing1 < 8) {
                pesan = "log pembimbing kurang dari 8";
            } else {
                pesan = "log pembimbing kurang dari 4";
            }
        } else {
            pesan = "gagal karena tanggungan kompen";
        }

        System.out.println(pesan);
        sc.close();
    }
}
