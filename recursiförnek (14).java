public class ornek16 {
    public static void main(String[] args) {
        //kendisine parametre olarak gelen tam sayı dizideki en büyük elemanı geri döndüren rekürsif fonk.

        int list[] = {6, 31, 2, 1, 54, 85, -96, 63, 99, 11};
        int x = enBulma(list, 0, list[0]);
        System.out.println(x);

    }

    public static int enBulma(int list[], int indis, int enb) {
        if (indis == list.length) return 0;
        {

        }
        if (list[indis] > enb) {
            return enBulma(list, indis - 1, enb = list[indis]);
        } else
            return enBulma(list, indis - 1, enb);
    }
}