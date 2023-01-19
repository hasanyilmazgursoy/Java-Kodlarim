import java.util.Scanner;

public class ornek4 {
    public static void main(String[] args) {
        //KLAVYEDEN girilen 10 TANE SAYI dizisi GİRİLİYOR BU SAYILAR İÇİNDE
        //5'E EŞİT OLANLARIN HANGİ SIRADA GİRİLDİĞİNİ EKRANA  YAZAN  PROGRAMI YAZINIZ

        Scanner scan = new Scanner(System.in);
        int[] list = new int[10];
        int sayac = 0;

        for (int i = 0; i < list.length; i++) {
            System.out.println("Sayı giriniz");
            list[i] = scan.nextInt();
            if (list[i] == 5) {
                System.out.println((i + 1) + ". Sırada 5 rakamı girilmiştir");
                sayac = sayac + 1;
            }
        }


    }
}
