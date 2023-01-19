import java.util.Scanner;

public class ornek26 {
    public static void main(String[] args) {
        ////kendisine parametre olarak gelen tam sayı dizisindeki
        //en büyük sayıyı geri döndüren method yazınız

        Scanner scan = new Scanner(System.in);
        int list[][] = new int[2][2];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                System.out.println("lütfen sayı dizisini giriniz");
                list[i][j] = scan.nextInt();
            }
        }
        int x = enbBulma(list);
        System.out.println("en büyük = " + x);
    }

    public static int enbBulma(int[][] list) {
        int enb = list[0][0];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i][j] > enb) {
                    enb = list[i][j];
                } else break;
            }
        }
        return enb;
    }
}