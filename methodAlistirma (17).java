import java.util.Scanner;

public class ornek23 {
    public static void main(String[] args) {
        //kendisine parametre olarak gelen tam sayı dizisindeki
        //en büyük ikinci sayıyı geri döndüren programı yazınız
        Scanner scan = new Scanner(System.in);

        int list[] = {3, 6, 8, 7, 99, 41, 35, 96, 487, 31, 66, 97};
        int x = enbIkinci(list);
        System.out.println(x);

    }

    public static int enbIkinci(int list[]) {
        int enb = list[0];
        int enb2 = list[1];

        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > enb) {
                enb2 = enb;
                enb = list[i];
            }
        }
        return enb2;
    }
}
