import java.util.Scanner;

public class ornek29 {
    public static void main(String[] args) {
        // klavyeden 3*4 elemanlı sayısal matris giriliyor .
        // bu değerleri dizide tutan ve en büyük , en küçük değerleri bulup
        // kaçıncı indiste oldugunu soyleyen program

        Scanner scan = new Scanner(System.in);
        int list[][] = new int[3][4];
        int enb = 0;
        int enk = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                System.out.println("diziyi giriniz");
                list[i][j] = scan.nextInt();
                enb = list[0][0];
                enk = list[0][0];
            }
        }
        int sayacEnki = 0;
        int sayacEnkj = 0;
        int sayacEnbi = 0;
        int sayacEnbj = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i][j] > enb) {
                    enb = list[i][j];
                    sayacEnbi = i;
                    sayacEnbj = j;
                }
            }
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i][j] < enk) {
                    enk = list[i][j];
                    sayacEnki = i;
                    sayacEnkj = j;
                }
            }
        }
        System.out.println("en büyük değer= " + enb + " ve indisi i= " + sayacEnbi + " j= " + sayacEnbj);
        System.out.println("en küçük değer= " + enk + " ve indisi i= " + sayacEnki + " j= " + sayacEnkj);
    }
}