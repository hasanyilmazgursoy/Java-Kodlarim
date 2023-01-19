import java.util.Scanner;

public class ornek33 {
    public static void main(String[] args) {
        //kendsine parametre olarak gelen tam sayının asal olup olmadığını geri döndüren method
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        boolean y = asalMi(x);
        if (y == true) {
            System.out.println("sayı asaldır");
        } else System.out.println("sayı asal değildir");
    }

    public static boolean asalMi(int z) {
        boolean x = true;
        for (int i = 2; i < z; i++) {
            if (z % i == 0) {
                x = false;
                break;
            } else x = true;
        }
        return x;
    }
}
