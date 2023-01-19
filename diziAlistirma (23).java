import java.util.Scanner;

public class ornek14 {
    public static void main(String[] args) {

        //klavyeden girilen 2*2 sayı dizisinde en büyük olanın satır ve sütünunu bulan programı yazınız
        Scanner scan = new Scanner(System.in);

        int[][] list = new int[3][3];

        for (int i = 0; i < list.length; i++) {

            for (int j = 0; j < list.length; j++) {
                System.out.print("Sayı Girin :");
                list[i][j] = scan.nextInt();
            }
        }
        int enb = list[0][0];
        int satir = 0, sut = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (enb < list[i][j]) {
                    enb = list[i][j];
                    satir = i;
                    sut = j;
                }
            }
        }
        System.out.println("satır=" + satir);
        System.out.println("sütun=" + sut);
    }
}
