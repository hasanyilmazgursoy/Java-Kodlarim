public class ornek40 {
    public static void main(String[] args) {

        //// Kendisine parametre olarak gelen tek boyutlu sayısal dizinin en büyük değerini bulup ekrana yazan

        int list[] = {6, 4, 1, 9, 6, 31};

        int x = enbuyuk(list);
        System.out.println(x);

    }

    public static int enbuyuk(int newList[]) {
        int enb = newList[0];

        for (int i = 1; i < newList.length; i++) {
            if (newList[i] > enb) {
                enb = newList[i];
            }
        }
        return enb;


    }
}
