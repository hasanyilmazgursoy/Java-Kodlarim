import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // klavyeden girilen 10 sayıdan tek olanları toplayan sayı dizisi

        Scanner scan = new Scanner(System.in);
        int[] list = new int[10];
        int top = 0;

        for (int i = 0; i < list.length; i++) {
            System.out.println("Sayı giriniz");
            list[i] = scan.nextInt();

            if (list[i] % 2 == 1) {
                top = top + list[i];
            } else System.out.println("Girmiş olduğunuz sayı çift sayıdır");


        }

        System.out.println("Girmiş olduğunuz sayılardan tek olanların toplamı" + top);
    }
}