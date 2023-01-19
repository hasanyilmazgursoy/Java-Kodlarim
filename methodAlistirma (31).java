import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //kendine parametre olarak gelen ve  klavyeden girilen
        // 2 tam sayının toplamını geri döndüren method programını yazınız

        Scanner scan = new Scanner(System.in);
        int x, y;
        x = scan.nextInt();
        y = scan.nextInt();
        int c = toplam(x, y);
        System.out.println(c);
    }

    public static int toplam(int a, int b) {
        int z = a + b;
        return z;
    }

}