        import java.util.Scanner;

        public class rekapPenjualanCafe {
            static int [][]penjualan(String [] Menu){
                int [][] data = new int [5][7];
                Scanner sc = new Scanner(System.in);
                for(int i=0 ;i< data.length ;i++){
                    System.out.println(Menu[i]);
                    for(int j=0 ;j< data[0].length; j++){
                        System.out.println("Hari ke-" + (1+j) + ":");
                        data [i][j]= sc.nextInt();
                    }
                }
                return data;
            }
            static String [] Menu(){
                String [] nama = new String [5];
                nama[0] = "Kopi";
                nama[1] = "Teh";
                nama[2] = "Es Kelapa muda";
                nama[3] = "Roti Bakar";
                nama[4] = "Gorengan";
                return nama;

            }
            static void tampil(int [][] data, String [] nama){
                System.out.println("Daftar Penjualan");
                for(int i=0 ;i< data.length ;i++){
                    System.out.print(nama[i]);
                    for(int j=0 ;j< data[0].length; j++){
                        System.out.println("Hari ke-" + (1+j) + ":" + data [i][j]);
            }
        }
            }
            static void totalTertinggi(int [][] data, String [] nama){
                int totalTertinggi = 0;
                int idxmenutertinggi = 0;
                for(int i=0 ;i< data.length ;i++){
                    int total = 0;
                    for(int j=0 ;j< data[0].length; j++){
                        total += data [i][j];
                    }
                    if (total > totalTertinggi) {
                        totalTertinggi = total;
                        idxmenutertinggi = i;
                    }
                }
                System.out.println("Total tertinggi adalah " + totalTertinggi);
                System.out.println("Menu yang paling laku adalah " + nama[idxmenutertinggi]);
            }
            static void rataRata (int [][] data, String [] nama){
                for(int i=0 ;i< data.length ;i++){
                    int total = 0;
                    for(int j=0 ;j< data[0].length; j++){
                        total += data [i][j];
                    }
                    double rata = (double)total/data[0].length;
                    System.out.println(nama [i] + "Rata rata per menu " + rata);
                }
            }
            public static void main(String[] args) {
                String [] daftarMenu = Menu();
                int [][] dataPenjualan = penjualan(daftarMenu);
                tampil(dataPenjualan,daftarMenu);
                totalTertinggi(dataPenjualan,daftarMenu);
                rataRata(dataPenjualan, daftarMenu);
            }
        }
                
                    

            

            

