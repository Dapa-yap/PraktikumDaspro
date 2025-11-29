import java.util.Scanner;
public class nilaiMahasiswa10 {
    public static int []isianArray (int jumlahMahasiswa){
        Scanner sc = new Scanner(System.in);
        int [] nilai = new int [jumlahMahasiswa];
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Input nilai ke- " +(1+i) +":");
            nilai [i] = sc.nextInt();
        }
        return nilai;
    }
    public static void tampilArray (int []nilaiMahasiswa){
        System.out.println("Nilai mahasiswa: ");
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.println(nilaiMahasiswa[i]);
        }
    }
    public static int hitungTotal(int[]nilaiMahasiswa){
        int hitungtotal = 0;
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            hitungtotal += nilaiMahasiswa[i];
        }
        return hitungtotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah mahasiswa");
        int jumlahMahasiswa = sc.nextInt();
        int [] nilaiMahasiswa = isianArray(jumlahMahasiswa);
        int total = hitungTotal(nilaiMahasiswa);
        System.out.println("Total nilai mahasiswa " + total);
    }
    }

