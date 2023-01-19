import java.util.Scanner;

public class ornek34 {
    public static void main(String[] args) {
        //kendisine parametre olarak gelen 10 elemanlı tam sayı dizisindeki tek olanların ortalamasını geri döndüre method
        Scanner scan = new Scanner(System.in);

        int list[] = new int[10];

        for (int i = 0; i < list.length; i++) {
            System.out.println("sayı giriniz: ");
            list[i] = scan.nextInt();
        }

        double x = tekOrt(list);
        System.out.println(x);
    }

    public static double tekOrt(int dizi[]) {
        int top = 0;
        int sayac = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 1) {
                top = top + dizi[i];
                sayac++;
            }
        }
        return (top / sayac);
    }
}
