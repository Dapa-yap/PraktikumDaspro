import java.util.Scanner;

public class kubus10 {
    public static int volumeKubus(int sisi){
        int volume = sisi*sisi*sisi;
        return volume;
    }
    public static int luasPermukaankubus(int sisi){
        int luasPermukaan = 6*(sisi*sisi);
        return luasPermukaan;
    }   
    public static void main(String[] args) {
        System.out.println("Masukkan sisi kubus");
        Scanner sc = new Scanner(System.in);
        int sisi = sc.nextInt();
        System.out.println("Volume kubus adalah " + volumeKubus(sisi));
        System.out.println("Luas permukaan kubus adalah " + luasPermukaankubus(sisi));
    }
}
