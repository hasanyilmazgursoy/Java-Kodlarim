import java.util.Scanner;

public class ornek22 {
    public static void main(String[] args) {
        //kendisine parametre olarak gelen string dizisindeki en uzn stringi bulup indisini gösteren methodu yapınız

        Scanner scan = new Scanner(System.in);
        String list[] = new String[5];
        for (int i = 0; i < list.length; i++) {
            list[i] = scan.next();
        }
        int s = enUzun(list);
        System.out.println(s);
    }

    public static int enUzun(String[] list) {
        int enb = list[0].length();
        int indis = 0;
        for (int i = 1; i < list.length; i++) {
            if (list[i].length() > enb) {
                enb = list[i].length();
                indis = i;
            }
        }
        return indis;
    }
}