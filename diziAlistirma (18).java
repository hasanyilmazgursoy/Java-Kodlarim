import java.util.Scanner;

public class ornek8 {
    public static void main(String[] args) {
        //Java’da dizideki çift ve tek öğeler nasıl bulunur?

        Scanner scan =new Scanner(System.in);

        int []list=new int[10];

        for (int i=0; i< list.length;i++){
            System.out.println("Sayı giriniz");
            list[i]= scan.nextInt();
        }
        for (int j=0;j< list.length;j++){
            if (list[j]%2==0){
                System.out.println("Girmiş olduğunuz "+ list[j]+" sayısı çifttir");
            }else
                System.out.println("Girmiş olduğunuz "+ list[j]+" sayısı tektir");
        }
    }
}
