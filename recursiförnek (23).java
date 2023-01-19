public class ornek25 {
    public static void main(String[] args) {
        //kendisine parametre olarak gelen dizinin simetrik olup olmadağını hesaplayan rekürsif method
        //1 2 2 1

        int[] list = {1, 2, 2, 1};
        boolean x = siraliMi(list, 0, list.length);
        System.out.println(x);
    }

    public static boolean siraliMi(int[] list, int i, int j) {
        if (i == list.length) {
            return true;
        }
        if (list[i] == list[j - 1]) {
            return siraliMi(list, i + 1, j - 1);
        } else return false;
    }
}
