import java.util.Scanner;

public class ornek38 {
    public static void main(String[] args) {
        //Klavyeden girilen stringi karakterleri girilir girilmez büyük-küçük harf değişimi yapan program

        Scanner scan = new Scanner(System.in);
        for (; ; ) {
            String y = scan.next();
            String x = buyukyapan(y);
            System.out.println(x);
        }
    }

    public static String buyukyapan(String z) {
        String bos = "";
        for (int i = 0; i < z.length(); i++) {
            if (z.charAt(i) >= 'a' && z.charAt(i) <= 'z') {
                bos = bos + (char) (z.charAt(i) - 32);
            }
            if (z.charAt(i) >= 'A' && z.charAt(i) <= 'Z') {
                bos = bos + (char) (z.charAt(i) + 32);
            }

        }
        return bos;
    }
}