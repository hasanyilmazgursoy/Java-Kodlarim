import java.util.Scanner;

public class ornek14 {
    public static void main(String[] args) {
        //kendisine parametre olarak gelen iki stringten
        //büyük olanı geri döndüren method yazınız
        Scanner scan = new Scanner(System.in);

        System.out.println("ilk sayıyı giriniz");
        int x = scan.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int y = scan.nextInt();

        int z = buyukOlaniBulma(x, y);
        System.out.println(z);

    }

    public static int buyukOlaniBulma(int a, int b) {
        int enb = 0;

        if (a > b) {
            enb = a;
        } else
            enb = b;
        return enb;
    }

}