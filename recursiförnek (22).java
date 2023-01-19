public class ornek24 {
    public static void main(String[] args) {
        //kendisine parametere olarak gelen
        //tam sayı dizisinin sıralı olup olmadağını hesaplayan program

        int list[] = {4, 1, 6, 7, 33};
        boolean x = siraliMi(list, 0);
        System.out.println(x);

    }

    public static boolean siraliMi(int list[], int i) {
        if (i == list.length - 1) {
            return true;
        }
        if (list[i] < list[i + 1]) {
            return siraliMi(list, i + 1);
        } else return false;

    }
}
