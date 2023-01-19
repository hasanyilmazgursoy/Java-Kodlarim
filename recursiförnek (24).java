public class ornek26 {
    public static void main(String[] args) {
        //kendisine parametre olarak gelen dizide kaç tane pozitif eleman olduğunu bulan recursif method

        int list[] = {4, 6, 3, -6, -8, 2, 4, 12, 32};
        int x = pozitifBulma(list, 0, 0);
        System.out.println(x);

    }

    public static int pozitifBulma(int[] list, int sayac, int i) {
        if (i == list.length) {
            return sayac;
        }
        if (list[i] > 0) {
            return pozitifBulma(list, sayac + 1, i + 1);
        } else {
            return pozitifBulma(list, sayac, i + 1);
        }

    }
}
