import java.util.Scanner;

public class ornek5 {
    public static void main(String[] args) {
        //klavyeden rastgele 10 tane karekter dizisi giriliyor bu karekterleri birleşitirip
        //isteniyor bu işlemi gerçekleştiren programı yapınız
        Scanner scan = new Scanner(System.in);

        char[] list = new char[10];
        String kelime = "";

        for (int i = 0; i < list.length; i++) {

            System.out.println("lütfen bir harf giriniz");
            list[i] = scan.next().charAt(0);
            kelime = kelime + list[i];

        }
        System.out.println("Oluşturulan String= " + kelime);

    }
}
