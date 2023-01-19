import java.util.Scanner;

public class ornek12 {
    public static void main(String[] args) {
        //Java’daki bir dizide en büyük ikinci sayıyı bulma

        Scanner scan = new Scanner(System.in);
        int enb = 0;
        int temp = 0;
        int enb2 = 0;
        int[] list = new int[5];

        for (int i = 0; i < list.length; i++) {
            list[i] = scan.nextInt();
            list[0] = enb;
        }
        for (int j = 1; j < list.length; j++) {
            if (list[j] > enb) {
                temp = enb;
                enb = list[j];
                enb2 = temp;
            }
        }
        System.out.println("girmiş olduğunuz sayılar içinde ki en büyük 2. değer= " + enb2);
    }
}