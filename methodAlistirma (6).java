import java.util.Scanner;

public class ornek10 {
    public static void main(String[] args) {
        // kendisine parametre olarak gelen stiringi ters çevirip geri döndüren programı yazınız
        Scanner scan = new Scanner(System.in);

        System.out.println("ters çevrilmesini istediğiniz stringi giriniz");
        String kelime = scan.next();
        String x = ters(kelime);
        System.out.println("Girdiğiniz stringin tersi= " + x);
    }

    public static String ters(String yeniKelime) {
        String bos = "";
        for (int i = yeniKelime.length() - 1; i >= 0; i--) {
            bos += yeniKelime.charAt(i);
        }
        return bos;
    }

}
