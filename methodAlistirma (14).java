import java.util.Scanner;

public class ornek19 {
    public static void main(String[] args) {

        //kendisine parametre olarak gelen tamsayı
        //dizisinindeki en küçük elemanın indisi geri döndüren method
        Scanner scan = new Scanner(System.in);

        int list[] = new int[5];
        for (int i = 0; i < list.length; i++) {
            list[i] = scan.nextInt();
        }

        int s = listEnbBulma(list);
        System.out.println(s);
    }

    public static int listEnbBulma(int[] list) {
        int enk = list[0];
        for (int i = 1; i < list.length; i++) {
            if (enk > i) {
                enk = i;
            }
        }
        return enk;
    }
}
