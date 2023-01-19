public class ornek4 {
    public static void main(String[] args) {
        ////kendine parametre olarak gelen pozitif sayının kaç basamaklı olduğunu bulan program
        int x = 1356;
        int y = basamakBulma(x);
        System.out.println(y);
    }

    public static int basamakBulma(int x) {
        int bas = 0;
        while (x > 0) {
            bas++;
            x = x / 10;
        }
        return bas;
    }
}
