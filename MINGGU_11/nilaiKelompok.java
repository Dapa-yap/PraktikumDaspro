import java.util.Scanner;
public class nilaiKelompok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int i = 1;
        double maxRata = 0;
        int kelompokTerbaik = 0;
        while (i <= 6) {
            System.out.println("kelompok " + i);
            int totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("nilai dari kelompok penilai " + j + " = ");
                int nilai = sc.nextInt();
                totalNilai += nilai;    
            }
            double rataNilai = totalNilai/5;
            System.out.println("rata-rata nilai kelompok " + i + " = " + rataNilai);
            
            if (rataNilai > maxRata) {
                maxRata = rataNilai;
                kelompokTerbaik = i;
            }
            i++;
        }  
        System.out.println("kelompok terbaik adalah " + kelompokTerbaik + " dengan rata-rata " + maxRata);
    }
}