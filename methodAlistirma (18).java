import java.util.Scanner;

public class ornek24 {
    public static void main(String[] args) {

        //kendisine parametre olarak gelen tam sayı dizisindeki en büyük ve en küçüğü bulan method
        Scanner scan = new Scanner(System.in);
        int list[] = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = scan.nextInt();
        }
        int x = enbBulma(list);
        System.out.println("en büyük = " + x);

        int z = enkBulma(list);
        System.out.println("en küçük = " + z);
    }

    public static int enbBulma(int[] list) {
        int enb = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > enb) {
                enb = list[i];
            }
        }
        return enb;
    }

    public static int enkBulma(int[] list) {
        int enk = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] < enk) {
                enk = list[i];
            }
        }
        return enk;
    }
}