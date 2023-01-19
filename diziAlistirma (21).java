import java.util.Scanner;

public class ornek11 {
    public static void main(String[] args) {
        //Java’da bir dizideki en büyük sayıyı bulma

        Scanner scan = new Scanner(System.in);
        int enb = 0;
        int[] list = new int[10];

        for (int i = 0; i < list.length; i++) {
            System.out.print("Sayı Girin :");
            list[i] = scan.nextInt();
            list[0] = enb;
        }
        for (int j = 1; j < list.length; j++) {
            if (list[j] > enb) {
                enb = list[j];
            }
        }
        System.out.println("girmiş olduğunuz sayılar içinde ki en büyük değer= " + enb);
    }
}
