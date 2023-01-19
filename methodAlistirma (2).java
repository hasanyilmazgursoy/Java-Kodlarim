import java.util.Scanner;

public class ornek6 {
    public static void main(String[] args) {
        //kendisine parametre olarak gelen sayının faktöriyelin alan programı yazınız

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen faktöreiyelini almak istediğiniz değeri giriniz");
        int x = scan.nextInt();
        int y = faktorielBulma(x);
        System.out.println(y);
    }

    public static int faktorielBulma(int a) {
        int sonuc = 1;
        for (int i = 1; i <= a; i++) {
            sonuc = sonuc * i;
        }
        return sonuc;
    }
}
