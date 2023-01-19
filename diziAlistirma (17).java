import java.util.Scanner;

public class ornek7 {
    public static void main(String[] args) {
        //klavyeden rastgele 10 tane  karekter dizisi giriliyor
        //bu karekterleri birleşitirip bilgisayar kelimesi oluşturmak isteniyor

        Scanner scan = new Scanner(System.in);
        String kelime = "bilgisayar";
        String kelimetop = "";

        char[] list = new char[20];

        for (int i = 0; i < list.length; i++) {
            System.out.println("Lütfen bir karekter giriniz");
            list[i] = scan.next().charAt(0);

        }
        for (int j = 0; j < list.length; j++) {

            if (list[j] == kelime.charAt(j)) {
                kelimetop = kelimetop + list[j];
            } else break;
        }
        System.out.println("oluşturulan string" + kelimetop);

    }
}
