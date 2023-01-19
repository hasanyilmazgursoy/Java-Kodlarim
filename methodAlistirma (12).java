import java.util.Scanner;

public class ornek16 {
    public static void main(String[] args) {
        //kendisine parametre olarak gelen stringdeki
        // 'a' karaktenin olup olmadığını geri döndüren methodu yazınız

        Scanner scan = new Scanner(System.in);
        System.out.println("string giriniz");
        String kelime = scan.next();

        int y = aBulma(kelime);
        System.out.println(y);

    }

    public static int aBulma(String yeniKelime) {
        int sayac = 0;

        for (int i = 0; i < yeniKelime.length(); i++) {
            if (yeniKelime.charAt(i) == 'a') {
                sayac++;
            }
        }
        if (sayac > 0) {
            return sayac;
        } else
            return 0;
    }
}
