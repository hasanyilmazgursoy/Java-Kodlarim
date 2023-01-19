import java.util.Scanner;

public class ornek29 {
    public static void main(String[] args) {
        //kendisine parametre olarak gelen iki boyutlu string dizisindeki
        //en uzun stringi geri döndüren method yazınız
        Scanner scan = new Scanner(System.in);

        String list[][] = new String[3][3];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                System.out.println("lütfen String dizisini giriniz");
                list[i][j] = scan.next();
            }
        }
        String x = enUzun(list);
        System.out.println(x);
    }

    public static String enUzun(String[][] list) {
        String enUzun = list[0][0];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i][j].length() > enUzun.length()) {
                    enUzun = list[i][j];
                }
            }
        }
        return enUzun;
    }
}