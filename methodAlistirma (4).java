import java.util.Scanner;

public class ornek8 {
    public static void main(String[] args) {
        // kendisine parametre olarak gelen iki tam sayıdan büyük olanı döndüren programı yazınız
        Scanner scan = new Scanner(System.in);
        System.out.println("iki sayıyıda giriniz");
        int x = scan.nextInt();
        int y = scan.nextInt();

        int z = enbBulma(x, y);
        System.out.println("büyük olan= " + z);

    }

    public static int enbBulma(int a, int b) {
        int enb = a;
        if (enb > b) {
            System.out.println("ilk girdiğiniz sayı daha büyüktür");
        } else {
            enb = b;
            System.out.println("ikinci girdiğiniz sayı daha büyüktür");
        }
        return enb;
    }
}
