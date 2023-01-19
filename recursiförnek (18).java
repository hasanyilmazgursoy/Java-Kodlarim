import java.util.Scanner;

public class ornek20 {
    //girdiğiniz sayı adeti kadar adınızı ekrana yazan rekürsif method

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("sayı giriniz ");
        int n = scanner.nextInt();
        adyazma(n);
    }

    public static void adyazma(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println("Hasan Yılmaz");
        adyazma(n - 1);
    }
}


