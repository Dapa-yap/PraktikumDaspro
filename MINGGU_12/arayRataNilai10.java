import java.util.Scanner;
public class arayRataNilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah mahasiswa: ");
        int jumlahMhsw = sc.nextInt();
        int [] nilaiMhsw = new int[jumlahMhsw];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        double jumlahLulus = 0;
        double jumlahTidakLulus = 0;
        double ratalulus = 0;
        double rataTidakLulus = 0;
        for (int i = 0; i < nilaiMhsw.length; i++) {
            System.out.print("Masukkan nilai ke " + (i+1) + ": ");
            nilaiMhsw[i] = sc.nextInt();
            if (nilaiMhsw[i] > 70) {
                totalLulus += nilaiMhsw[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhsw[i];
                jumlahTidakLulus++;
            }
        }
        if (jumlahLulus > 0) {
            ratalulus = totalLulus / jumlahLulus;
            System.out.println("Rata-rata nilai lulus: " + ratalulus);
        } if (jumlahTidakLulus > 0) {
            rataTidakLulus = totalTidakLulus / jumlahTidakLulus;
            System.out.println("rata-rata nilai tidak lulus: " + rataTidakLulus);
        }
    }
}
        

