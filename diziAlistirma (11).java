import java.util.Scanner;

public class ornek32 {
    public static void main(String[] args) {
        //// 2*2 iki matrisin toplamını bulmak için C programı

        Scanner scan = new Scanner(System.in);
        int[][] list = new int[3][3];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                System.out.println("lütfen sayı dizisini giriniz");
                list[i][j] = scan.nextInt();
            }
        }
        int toplam = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                toplam = toplam + list[i][j];
            }
        }
        System.out.println(toplam);
    }
}