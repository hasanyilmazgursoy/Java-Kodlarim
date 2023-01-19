public class ornek23 {
    public static void main(String[] args) {
        //kendisime parametre olarak gelen  tam sayı dizisinde enbüyük elemanın indisini hesaplayan recursif fonk

        int list[] = {4, 6, 9, 4, 8, 4, 8, 1, 11, 12};
        int x = enbBulmal(list, list[0], 1);
        System.out.println(x);

    }

    public static int enbBulmal(int[] list, int enb, int i) {
        if (i == list.length ) {
            return enb;
        }
        if (list[i] > enb) {
            return enbBulmal(list, list[i], i + 1);
        } else return enbBulmal(list, enb, i + 1);
    }
}
