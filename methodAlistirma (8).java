import java.util.Scanner;

public class ornek12 {
    public static void main(String[] args) {
        // kendisine parametre olarak gelen stringdeki
        // küçük karekterleri büyük, büyük karekterleri küçük yapıp geri döndüren method
        Scanner scan = new Scanner(System.in);

        System.out.println("String giriniz");
        String kelime = scan.next();
        String x = donusum(kelime);
        System.out.println(x);

    }

    public static String donusum(String yeniKelime) {
        String bos = "";
        for (int i = 0; i < yeniKelime.length(); i++) {
            if (yeniKelime.charAt(i) >= 'a' && yeniKelime.charAt(i) <= 'z') {
                bos = bos + (yeniKelime.charAt(i) - 32);
            }
            if (yeniKelime.charAt(i) >= 'A' && yeniKelime.charAt(i) <= 'Z') {
                bos = bos + (yeniKelime.charAt(i) + 32);
            }
        }
        return bos;
    }
}
