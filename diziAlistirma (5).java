import java.util.Scanner;

public class ornek23 {
    public static void main(String[] args) {
        //girilen dizinin en uzunu olanı boyunu ve indisini yazan progrm
        Scanner scan = new Scanner(System.in);
        String list[] = new String[5];

        for (int i = 0; i < list.length; i++) {
            list[i] = scan.next();
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i].charAt(0) == 'a') {
                System.out.println(list[i]);
            }
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i].charAt(list[i].length() - 1) == 'z') {
                System.out.println(list[i]);
            }
        }
        int maxs = list[0].length();
        String ss = "";
        int indexs = 0;
        for (int i = 1; i < list.length; i++) {
            if (maxs < list[i].length()) {
                ss = list[i];
                maxs = list[i].length();
                indexs = i;
            }
        }
        System.out.println("en uzun= " + ss);
        System.out.println("ve boyu= " + maxs);
        System.out.println("ve indeksi= " + indexs);
    }
}