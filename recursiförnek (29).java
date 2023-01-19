public class ornek2 {
    //fibonnaci hesaplayan recursif method
    // 1 1 2 3 5
    public static int fibonnaci(int x) {
        if (x == 1) return 1;
        if (x == 2) return 1;
        return fibonnaci(x - 1) + fibonnaci(x - 2);


    }

    public static void main(String[] args) {
        System.out.println(fibonnaci(6));
    }
}
