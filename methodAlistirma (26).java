import java.util.Scanner;

public class ornek36 {
    public static void main(String[] args) {
        //3 basamaklı sayının kareleri toplamı kendine eşit olan sayıları bulup
        //ekrana yazan normal metodu gerçekleştirin
        //371

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        boolean y = amostrongMu(x);
        System.out.println(y);

    }

    public static boolean amostrongMu(int x) {
        boolean amosMu = true;

        int temp = x;

        int yuzler = temp / 100;
        temp = temp - yuzler * 100;

        int onlar = temp / 10;
        temp = temp - onlar * 10;

        int birler = temp;
        int kareler = (yuzler * yuzler * yuzler) + (onlar * onlar * onlar) + (birler * birler * birler);

        if (x == kareler) {

            return true;
        } else {
            return false;
        }
    }
}


