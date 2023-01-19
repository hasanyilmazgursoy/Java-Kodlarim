public class ornek3 {
    //kendisine parametre olarak gelen pozitif tam
    // sayıya kadar olan sayıların toplamını hesaplayan rekursif fonk

    public static int toplam(int x) {
        if (x == 1) return 1;
        return x + toplam(x - 1);

    }

    public static void main(String[] args) {
        System.out.println(toplam(10));
    }
}
