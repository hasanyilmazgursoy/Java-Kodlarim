import java.util.Scanner;

public class ornek35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x[][] = new int[3][2];
        int y[][] = {{8, 9}, {4, 6}, {3, 6}};

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                x[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y.length; j++) {
                System.out.print(y[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("----------------------------");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}