import java.util.Scanner;

public class ornek9 {
    public static void main(String[] args) {

        //Java dizideki çift ve tek öğelerin toplamını bulma

        Scanner scan = new Scanner(System.in);
        int tektoplam = 0;
        int cifttoplam = 0;
        int[] list = new int[10];

        for (int i = 0; i < list.length; i++) {
            System.out.println("Sayı giriniz");
            list[i] = scan.nextInt();
        }
        for (int j = 0; j < list.length; j++) {
            if (list[j] % 2 == 0) {
                cifttoplam = cifttoplam + list[j];
            } else
                tektoplam = tektoplam + list[j];
        }
        System.out.println("Girmiş olduğunz çift sayıların toplamı= " + cifttoplam);
        System.out.println("Girmiş olduğunz tek sayıların toplamı= " + tektoplam);
    }
}