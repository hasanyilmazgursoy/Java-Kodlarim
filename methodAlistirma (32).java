import java.util.Scanner;

public class ornek2 {
    public static void main(String[] args) {
        //kendine parametre olarak gelen klavyeden girilen x y
        //sayılarını üslü şekilde yazıp geri döndüren programı yazınız

        Scanner scan = new Scanner(System.in);
        int x, y;
        x = scan.nextInt();
        y = scan.nextInt();
        int c = usalma(x, y);
        System.out.println(c);

    }

    public static int usalma(int a, int b) {
        int sonuc = 1;
        for (int i = 1; i <= b; i++) {
            System.out.println();
            sonuc = sonuc * a;
        }
        return sonuc;
    }
}
