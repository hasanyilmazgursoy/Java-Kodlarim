import java.util.Scanner;

public class ornek10 {
    public static void main(String[] args) {

        //Java’da dizi öğelerini tersine çevirme

        // 1 2 3 4 5
        int i, j, temp;
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            System.out.print("Sayı Girin :");
            arr[i] = sc.nextInt();
        }
        j = 5 - 1;
        for (i = 0; i < j; i++) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        System.out.print("\nTerse Çevrilmiş Dizi :");
        for (i = 0; i < 5; i++) {
            System.out.print(" " + arr[i]);
        }

    }
}