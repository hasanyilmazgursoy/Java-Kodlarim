import java.util.Scanner;

public class ornek30 {
    public static void main(String[] args) {
        //ortalamadan küçük olanları yazan program
        Scanner scan = new Scanner(System.in);
        int list[] = new int[10];
        int top = 0;

        for (int i = 0; i < list.length; i++) {
            list[i] = scan.nextInt();
        }
        for (int i = 0; i < list.length; i++) {
            top = top + list[i];
        }
        int ortalama = top / list.length;
        System.out.println("ortalama= " + ortalama);
        for (int i = 0; i < list.length; i++) {
            if (list[i] < ortalama) {
                System.out.println(list[i]);
            }
        }
    }
}