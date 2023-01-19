import java.util.Scanner;

public class ornek25 {
    public static void main(String[] args) {
        //satırları toplayan programı yazınız

        Scanner scan = new Scanner(System.in);
        int[][] list = new int[2][2];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                System.out.println("lütfen sayı dizisini giriniz");
                list[i][j] = scan.nextInt();
            }
        }
        int toplam = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                toplam = toplam + list[0][j];
            }
        }
        System.out.println(toplam);
    }
}