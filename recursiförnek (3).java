import java.util.Scanner;

public class ornek5 {

    //kendisine parametre olarak gelen sayıya kadar adınızı ekrana yazan recursif fonk

    public static void adYazma(int x) {
        if (x <= 0) System.exit(0);
        System.out.println("hasan yılmaz");
        adYazma(--x);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("adınızı kaç defa yazdırmak istiyorsunuz");
        int x = scan.nextInt();
        adYazma(x);
    }
}