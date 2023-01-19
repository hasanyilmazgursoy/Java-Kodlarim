import java.util.Scanner;

public class ornek21 {
    public static void main(String[] args) {
        // Java’daki dizide en büyük ve en küçük öğeyi bulma
        Scanner scan = new Scanner(System.in);
        int enb = 0;
        int enk = 0;

        int[] list = new int[5];

        for (int i = 0; i < list.length; i++) {
            list[i] = scan.nextInt();
            enb = list[0];
            enk = list[0];
        }
        for (int j = 1; j < list.length; j++) {
            if (list[j] > enb) {
                enb = list[j];
            }
        }
        System.out.println("girmiş olduğunuz sayılar içinde ki en büyük değer= " + enb);
        for (int j = 1; j < list.length; j++) {
            if (list[j] < enk) {
                enk = list[j];
            }
        }
        System.out.println("girmiş olduğunuz sayılar içinde ki en küçük değer= " + enk);
    }
}
