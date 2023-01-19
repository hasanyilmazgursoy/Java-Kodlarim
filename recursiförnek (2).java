public class ornek4 {
    //kendisine parametre olarak gelen a ve b sayısının a üzeri bsini hesaplayan recursif method

    public static int usAlma(int a, int b) {
        if (b == 0) return 1;
        return a * usAlma(a, b - 1);
    }

    public static void main(String[] args) {
        System.out.println(usAlma(2, 5));
    }

}
