import java.util.Scanner;

public class ornek7 {
    public static void main(String[] args) {
        // kendisine parametre olarak gelen sayının pozitif tam sayıya kadar ki
        // tüm sayıları toplayan geri döndüren programı yazınız

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir değer giriniz");
        int x = scan.nextInt();
        int y = sayiToplama(x);
        System.out.println(y);

    }

    public static int sayiToplama(int z) {
        int toplam = 0;
        for (int i = 1; i <= z; i++) {
            toplam = toplam + i;
        }
        return toplam;
    }
}
