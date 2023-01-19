import java.util.Scanner;

public class ornek27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] list = new int[2][2];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                System.out.println("lütfen sayı dizisini giriniz");
                list[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println(" ");
        }
        int top = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                top = top + list[i][j];
            }
            System.out.println("Satırlar toplamı=" + " " + top);
            top = 0;
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                top = top + list[j][i];
            }
            System.out.println(i + ". sütunlar toplamı: " + top + "");
            top = 0;
        }
        for (int i = 1; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                System.out.println("1.satırın elemanları= " + list[i][j]);

            }
        }
        for (int i = 0; i < list.length; i++) {

            System.out.println("1.sütunun elemanları= " + list[i][0]);


        }
    }
}