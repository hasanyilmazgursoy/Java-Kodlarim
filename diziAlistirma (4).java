import java.util.Scanner;

public class ornek22 {
    public static void main(String[] args) {
        //Java’da dizideki bir öğeyi arama

        Scanner scan = new Scanner(System.in);
        int[] list = new int[5];

        for (int i = 0; i < list.length; i++) {
            System.out.println("lütfen sayı dizisi giriniz");
            list[i] = scan.nextInt();
        }
        System.out.println("sayı dizisi içinde aramak istediğiniz rakamı giriniz");
        int x = scan.nextInt();

        for (int i = 0; i < list.length; i++) {
            if (list[i] == x) {
                System.out.println("aradağınız " + x + "sayısı dizisi içinde bulundu");
                break;
            }

        }


    }
}
