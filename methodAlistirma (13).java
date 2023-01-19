import java.util.Scanner;

public class ornek18 {
    public static void main(String[] args) {
        // kendisine parametre olarak gelen tamsayı dizisinin toplamını geri döndüren method yazın

        Scanner scan = new Scanner(System.in);
        int[] list = new int[5];
        for (int i = 0; i < list.length; i++) {
            System.out.println("sayıları giriniz");
            list[i] = scan.nextInt();
        }
        int x = listToplam(list);
        System.out.println(x);
    }

    public static int listToplam(int[] a) {
        int top = 0;
        for (int i = 0; i < a.length; i++) {
            top = top + a[i];
        }
        return top;
    }
}
