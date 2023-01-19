import java.util.Scanner;

public class ornek28 {
    public static void main(String[] args) {
        //dizinin ilk elemanlarını yazan program

        Scanner scan = new Scanner(System.in);
        String[] list = new String[3];

        for (int i = 0; i < list.length; i++) {
            System.out.println("string giriniz");
            list[i] = scan.next();
            System.out.println(list[i].charAt(0));
        }
    }
}