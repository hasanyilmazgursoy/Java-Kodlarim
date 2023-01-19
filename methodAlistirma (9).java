import java.util.Scanner;

public class ornek13 {
    public static void main(String[] args) {
        //kendisine parametre olarak gelen stringdeki
        //"aa" stringlerinden kaç tane olduğunu döndüren programı yazınız

        Scanner scan = new Scanner(System.in);
        System.out.println("String giriniz");
        String kelime = scan.next();
        int s = aaSayisiniBulma(kelime);
        System.out.println(s);

    }

    public static int aaSayisiniBulma(String yeniKelime) {
        int sayac = 0;
        for (int i = 0; i < yeniKelime.length(); i++) {
            if (yeniKelime.charAt(i) == 'a' && yeniKelime.charAt(i + 1) == 'a') {
                sayac++;
            }
        }
        return sayac;
    }
}
