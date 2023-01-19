import java.util.Scanner;

public class ornek15 {
    public static void main(String[] args) {
        //kendisine parametre olarak gelen stringdeki kelime sayısını geri döndüren program
        Scanner scan = new Scanner(System.in);
        String cumle = scan.nextLine();
        int s = kelimeSayisiBulma(cumle);
        System.out.println(s);

    }

    public static int kelimeSayisiBulma(String yeniCumle) {
        int sayac = 1;
        for (int i = 0; i < yeniCumle.length(); i++) {
            if (yeniCumle.charAt(i) == ' ') {
                sayac++;
            }
        }
        return sayac;
    }
}
