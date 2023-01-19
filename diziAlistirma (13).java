import java.util.Scanner;

public class ornek2 {
    public static void main(String[] args) {
        //Girilen sayıdan 5000e kadar olan sayıların toplamı
        Scanner scan = new Scanner(System.in);

        int top = 0;
        int[] list = new int[5000];

        System.out.println("sayı giriniz");
        list[0] = scan.nextInt();

        if (list[0] >= 5000) {
            System.out.println("çıkış yapılıyor");
            System.exit(1);

        } else {
            for (int i = list[0]; i < 5000; i++) {
                top = top + i;

            }
            System.out.println("Girmiş olduğunuz sayıdan 5000e kadar olan sayıların toplamı= " + top);
        }


    }
}