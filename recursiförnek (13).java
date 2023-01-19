public class ornek15 {
    public static void main(String[] args) {
        // kendisine parametre olarak gelen 10 elemanlı dizideki
        // pozitif tam sayıların toplamını geri döndüren rekürsif fonksiyon

        int list[] = {1, 2, 3, 4, 5, 6, -6, -3, -5, -9};
        int x = toplambulma(list, 0);
        System.out.println(x);

    }

    public static int toplambulma(int list[], int indis) {
        if (indis == list.length) {
            return 0;
        } else if (list[indis] > 0) {
            return list[indis] + toplambulma(list, indis + 1);
        } else
            return toplambulma(list, indis + 1);
    }
}
