public class ornek11 {
    public static void main(String[] args) {
        //kendisine parametre olarak gelen tam sayı dizisnin sıralı olup olmadığını bulan rekürsif fonk.

        int list[] = {4, 6, 8, 10, 11};
        boolean x = siralimi(list, 0);
        System.out.println(x);

    }

    public static boolean siralimi(int list[], int indis) {
        if (indis == list.length - 1) {
            return true;
        } else if (list[indis] < list[indis + 1]) {
            return siralimi(list, indis + 1);
        } else return false;
    }
}
