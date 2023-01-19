import java.util.Scanner;

public class ornek37 {
    public static void main(String[] args) {
        // Rastgele girilen 20 tane 3 adet sayının her birinin bir üçgeni tanımlayıp tanımlayamayacağını bulan
        // metodu yazınız.

        Scanner scan = new Scanner(System.in);
        int list[] = {3, 4, 5};

        boolean x = ucgenmi(list);
        System.out.println(x);

    }

    public static boolean ucgenmi(int list[]) {
        boolean ucgenMi = true;

        for (int i = 0; i < list.length; i++) {
            if (list[i + 2] < list[i] + list[i + 1] && list[i + 1] - list[i] > list[i + 2]) {
                ucgenMi = true;
            } else
                ucgenMi = false;

        }
        return ucgenMi;
    }
}
