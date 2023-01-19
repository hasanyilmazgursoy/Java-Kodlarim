public class ornek17 {
    public static void main(String[] args) {
        //5,7,9,1,0büyükten küçüğre sıralama

        int list[] = {5, 7, 9, 1, 0};

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (list[j] > list[j + 1]) {
                    int yedek = list[j + 1];// yedek 1
                    list[j + 1] = list[j];
                    list[j] = yedek;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list[i]);
        }


    }
}
