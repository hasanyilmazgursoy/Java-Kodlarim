import java.util.Scanner;

public class ornek3 {
    public static void main(String[] args) {
        //klavyeden girilen 10 tane string dizisi içinde
        //karekter uzunluğu 5'den büyük olanları toplayan, girilen string exit ise duran

        Scanner scan = new Scanner(System.in);
        System.out.println("String giriniz");
        String[] list = new String[10];
        String s1 = "";

        for (int i = 0; i < list.length; i++) {
            list[i] = scan.next();
            if (list[i].length() > 5) {
                s1 = s1 + list[i];
            }
        }
        System.out.println("klavyeden girilen 10 tane string dizisi içinde karektrer uzunluğu 5,den büyük olanların toplamı= " + s1);

    }
}
