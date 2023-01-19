public class ornek18 {
    public static void main(String[] args) {
        //10 elemanlı tam sayı dizisini bir sağa döndüren program

        int list[] = {7, 4, 0, 3, 9, 8, 1, 5, 2, 6};
        int yedek = list[9];

        for (int i = 8; i >= 0; i--) {
        }
        list[0] = yedek;
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
