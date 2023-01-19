import java.util.Scanner;

public class ornek11 {
    public static void main(String[] args) {
        //kendisine parametre olarak gelen stringdeki
        //küçük harfleri büyük yapan ve sonucu geri döndüren algoritmayı yazınız
        Scanner scan = new Scanner(System.in);

        System.out.println("String giriniz");
        String kelime = scan.next();
        String x = buyukYapma(kelime);
        System.out.println(x);
    }

    public static String buyukYapma(String yeniKelime) {
        String bos = "";
        for (int i = 0; i < yeniKelime.length(); i++) {
            if (yeniKelime.charAt(i) >= 'a' && yeniKelime.charAt(i) <= 'z') {
                bos = bos + (char) (yeniKelime.charAt(i) - 32);
            } else bos = bos + yeniKelime.charAt(i);
        }
        return bos;
    }
}
