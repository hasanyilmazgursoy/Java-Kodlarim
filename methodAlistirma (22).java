import java.util.Scanner;

public class ornek32 {
    public static void main(String[] args) {
        //10 elemanlı 2 tamsayı dizisinin toplamını geri döndüren method
        Scanner scan = new Scanner(System.in);

        int a[] = {6, 3, 4, 9, 3};
        int b[] = {8, 4, 1, 7, 9};
        int c[] = new int[5];

        c = toplamlariniBulma(a, b, c);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }

    public static int[] toplamlariniBulma(int d[], int e[], int c[]) {
        int f[] = new int[5];

        for (int i = 0; i < f.length; i++) {
            f[i] = d[i] + e[i];
        }
        return f;
    }
}
