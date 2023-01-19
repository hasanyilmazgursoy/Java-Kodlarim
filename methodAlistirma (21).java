import java.util.Scanner;

public class ornek30 {
    public static void main(String[] args) {
        //kendisine parametre olarak gelen 3*3 a b matrislerinin toplamını geri döndüren method

        Scanner scan = new Scanner(System.in);
        int list[][] = new int[3][3];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                list[i][j] = scan.nextInt();
            }
        }
        int x = matrisToplami(list);
        System.out.println("toplam= " + x);
    }

    public static int matrisToplami(int[][] list) {
        int top = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                top = top + list[i][j];
            }
        }
        return top;
    }
}
