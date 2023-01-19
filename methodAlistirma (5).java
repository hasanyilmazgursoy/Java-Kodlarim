import java.util.Scanner;

public class ornek9 {
    public static void main(String[] args) {
        // kendisine parametre olarak gelen stringdeki küçük karekterlerin sayısını döndüren program
        Scanner scan = new Scanner(System.in);

        System.out.println("stringi giriniz");
        String kelime = scan.nextLine();
        int x = kucukKarekterSayisi(kelime);
        System.out.println("Küçük karekterlerin sayısı= " + x);

    }

    public static int kucukKarekterSayisi(String yeniKelime) {
        int sayac = 0;
        for (int i = 0; i < yeniKelime.length(); i++) {
            if (yeniKelime.charAt(i) >= 'a' && yeniKelime.charAt(i) <= 'z') {
                sayac++;
            }
        }
        return sayac;
    }
}