import java.util.Scanner;
public class searchNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai jumlah elemen array: ");
        int jumlahNilai = sc.nextInt();
        int [] arrNilai = new int[jumlahNilai];

        System.out.println("Masukkan nilai nilai array: ");
        for (int i = 0; i < jumlahNilai; i++) {
            arrNilai[i] = sc.nextInt();
        }

        System.out.println("Masukkan nilai yang ingin di cari: ");
        int key = sc.nextInt();
        int hasil = -1;
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }
        System.out.println();
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ditemukan di indeks ke " + hasil);
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan di array ");
        }
        System.out.println();
    }
}
