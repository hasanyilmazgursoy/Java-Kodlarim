import java.util.Scanner;

public class ornek20 {
    public static void main(String[] args) {
        //kendisine parametre olarak gelen tam sayı dizisinin sıralı olup olmadağını döndüren program
        Scanner scan = new Scanner(System.in);

        int list[] = new int[5];
        for (int i = 0; i < list.length; i++) {
            System.out.println("Sayı giriniz");
            list[i] = scan.nextInt();
        }
        boolean s = siralimi(list);
        System.out.println(s);

    }

    public static boolean siralimi(int[] liste) {
        boolean siraliMi = true;
        for (int i = 0; i < liste.length; i++) {
            if (liste[i] > liste[i + 1])/* küçükten büyüğe mi*/ {
                siraliMi = true;
            }
            if (liste[i] < liste[i + 1])/* büyükten küçüğe mi*/ {
                siraliMi = true;
            } else siraliMi = false;
            break;
        }
        return siraliMi;
    }
}
